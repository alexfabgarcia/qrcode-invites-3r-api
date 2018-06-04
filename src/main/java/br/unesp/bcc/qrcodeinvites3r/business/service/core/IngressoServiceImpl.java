package br.unesp.bcc.qrcodeinvites3r.business.service.core;

import br.unesp.bcc.qrcodeinvites3r.business.service.IngressoService;
import br.unesp.bcc.qrcodeinvites3r.common.dto.IngressoDto;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import static reactor.core.publisher.Flux.create;

/**
 * Implementação default de {@link IngressoService} obtendo informações do banco de dados do Firebase.
 */
@Service
public class IngressoServiceImpl implements IngressoService {

    private static final String PATH_INGRESSOS = "ingressos";

    private final DatabaseReference database;

    @Autowired
    public IngressoServiceImpl(DatabaseReference database) {
        this.database = database.child(PATH_INGRESSOS);
    }

    @Override
    public Flux<IngressoDto> list() {
        return create(fluxSink -> database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                try {
                    for (DataSnapshot ingresso : snapshot.getChildren()) {
                        fluxSink.next(ingresso.getValue(IngressoDto.class));
                        System.out.println(ingresso.getValue(IngressoDto.class));
                    }
                    fluxSink.complete();
                } catch (Exception e) {
                    fluxSink.error(e);
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {
                fluxSink.error(error.toException());
            }
        }));
    }
}

package br.unesp.bcc.qrcodeinvites3r.presentation.endpoint;

import br.unesp.bcc.qrcodeinvites3r.common.dto.IngressoDto;
import br.unesp.bcc.qrcodeinvites3r.business.service.core.IngressoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * Endpoint utilizado para acesso e manipulação de ingressos.
 */
@RestController
@RequestMapping("/ingressos")
public class IngressoEndpoint {

    private final IngressoServiceImpl ingressoService;

    @Autowired
    public IngressoEndpoint(IngressoServiceImpl ingressoService) {
        this.ingressoService = ingressoService;
    }

    /**
     * Retorna um {@link Flux} para a listagem de ingressos.
     * @return {@link Flux} para a listagem de ingressos.
     */
    @GetMapping
    public Flux<IngressoDto> list() {
        return ingressoService.list();
    }

}

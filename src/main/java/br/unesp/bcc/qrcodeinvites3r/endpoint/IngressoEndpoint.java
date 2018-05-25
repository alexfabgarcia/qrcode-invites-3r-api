package br.unesp.bcc.qrcodeinvites3r.endpoint;

import br.unesp.bcc.qrcodeinvites3r.common.dto.IngressoDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Endpoint utilizado para acesso e manipulação de ingressos.
 */
@RestController
@RequestMapping("/ingressos")
public class IngressoEndpoint {

    /**
     * Realiza a listagem de ingressos.
     * @return Lista de ingressos.
     */
    @GetMapping
    public ResponseEntity<List<IngressoDto>> list() {
        return new ResponseEntity<>(mockIngressos(), HttpStatus.OK);
    }

    private List<IngressoDto> mockIngressos() {
        return Arrays.asList(
                new IngressoDto("1", "Tadeu Junior"),
                new IngressoDto("2", "Alex Garcia"),
                new IngressoDto("3", "Lucas Dick")
        );
    }

}

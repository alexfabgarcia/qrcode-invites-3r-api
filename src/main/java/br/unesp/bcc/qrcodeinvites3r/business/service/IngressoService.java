package br.unesp.bcc.qrcodeinvites3r.business.service;

import br.unesp.bcc.qrcodeinvites3r.common.dto.IngressoDto;
import reactor.core.publisher.Flux;

/**
 * Service utilizado para manipualção reativa de ingressos.
 */
public interface IngressoService {

    /**
     * Método responsável por retorna um {@link Flux} para listagem de ingressos.
     * @return {@link Flux} para listagem de ingressos
     */
    Flux<IngressoDto> list();

}

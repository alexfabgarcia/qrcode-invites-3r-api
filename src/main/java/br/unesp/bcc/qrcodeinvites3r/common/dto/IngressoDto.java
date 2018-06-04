package br.unesp.bcc.qrcodeinvites3r.common.dto;

import lombok.*;

/**
 * Data Transfer Object utilizado para ingressos.
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class IngressoDto {

    private String id;

    private String nome;

}

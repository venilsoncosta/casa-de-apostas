package com.venilson.casadeaposta.apostador.dto;

import java.util.Date;

public record ApostadorDTO(
        String nome,
        String email,
        String senha,
        Date dataNascimento
) {
}

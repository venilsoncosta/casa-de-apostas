package com.venilson.casadeaposta.eventoEsportivo.dto;

import com.venilson.casadeaposta.esporte.Esporte;

import java.util.Date;

public record EventoEsportivoDTO(
        String nome,
        Date dataEHora,
        Esporte tipoEsporte
) {
}

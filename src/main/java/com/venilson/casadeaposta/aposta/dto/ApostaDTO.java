package com.venilson.casadeaposta.aposta.dto;

import com.venilson.casadeaposta.aposta.StatusAposta;
import com.venilson.casadeaposta.apostador.Apostador;
import com.venilson.casadeaposta.eventoEsportivo.EventoEsportivo;
import com.venilson.casadeaposta.tipoAposta.TipoAposta;

public record ApostaDTO(
        Apostador apostador,
        EventoEsportivo eventoEsportivo,
        TipoAposta tipoAposta,
        double valorApostado,
        double odds,
        StatusAposta statusAposta
) {
}

package com.venilson.casadeaposta.aposta;

import com.venilson.casadeaposta.apostador.Apostador;
import com.venilson.casadeaposta.eventoEsportivo.EventoEsportivo;
import com.venilson.casadeaposta.tipoAposta.TipoAposta;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "apostas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Aposta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "apostador_id", nullable = false)
    private Apostador apostador;

    @ManyToOne
    @JoinColumn(name = "evento_esportivo_id", nullable = false)
    private EventoEsportivo eventoEsportivo;
    @ManyToOne
    @JoinColumn(name = "tipo_aposta_id", nullable = false)
    private TipoAposta tipoAposta;

    private double valorApostado;

    private double odds;

    @Enumerated(EnumType.STRING)
    private StatusAposta statusAposta;
}

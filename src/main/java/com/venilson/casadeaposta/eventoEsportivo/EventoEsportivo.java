package com.venilson.casadeaposta.eventoEsportivo;

import com.venilson.casadeaposta.esporte.Esporte;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Entity
@Table(name = "evento_esportivo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EventoEsportivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Date dataEHora;

    @ManyToOne
    @JoinColumn(name = "esporte_id", nullable = false)
    private Esporte tipoEsporte;
}

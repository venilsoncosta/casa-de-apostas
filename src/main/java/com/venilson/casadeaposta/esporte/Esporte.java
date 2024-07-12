package com.venilson.casadeaposta.esporte;

import com.venilson.casadeaposta.equipeJogador.EquipeJogador;
import com.venilson.casadeaposta.eventoEsportivo.EventoEsportivo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "esportes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Esporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private NomeEsporte nomeEsporte;

    @OneToMany(mappedBy = "esporte", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<EquipeJogador> equipesJogadores;

    @OneToMany(mappedBy = "tipoEsporte", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<EventoEsportivo> eventosEsportivos;
}

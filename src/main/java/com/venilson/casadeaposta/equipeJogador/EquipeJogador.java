package com.venilson.casadeaposta.equipeJogador;

import com.venilson.casadeaposta.equipeJogador.dto.EquipeJogadorDTO;
import com.venilson.casadeaposta.esporte.Esporte;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "equipe_jogador")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EquipeJogador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "esporte_id", nullable = false)
    private Esporte esporte;

    public EquipeJogador(EquipeJogadorDTO equipeJogadorDTO){
        this.esporte = equipeJogadorDTO.esporte();
    }
}

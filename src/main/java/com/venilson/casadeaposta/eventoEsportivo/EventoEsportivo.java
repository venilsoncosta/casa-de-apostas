package com.venilson.casadeaposta.eventoEsportivo;

import com.venilson.casadeaposta.esporte.Esporte;
import com.venilson.casadeaposta.eventoEsportivo.dto.EventoEsportivoDTO;
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

    public EventoEsportivo(EventoEsportivoDTO eventoEsportivoDTO){
        this.nome = eventoEsportivoDTO.nome();
        this.dataEHora = eventoEsportivoDTO.dataEHora();
        this.tipoEsporte = eventoEsportivoDTO.tipoEsporte();
    }
}

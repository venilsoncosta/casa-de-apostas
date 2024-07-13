package com.venilson.casadeaposta.apostador;

import com.venilson.casadeaposta.aposta.Aposta;
import com.venilson.casadeaposta.apostador.dto.ApostadorDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@Entity
@Table(name = "apostador")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Apostador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private Date dataNascimento;
    private double saldo;
    @OneToMany(mappedBy = "apostador", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Aposta> historicoApostas;

    public Apostador(ApostadorDTO apostador){
        this.nome = apostador.nome();
        this.email = apostador.email();
        this.senha = apostador.senha();
        this.dataNascimento = apostador.dataNascimento();
    }
}

package com.venilson.casadeaposta.tipoAposta;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tipo_aposta")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TipoAposta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private TipoApostaEnum tipoDeAposta;
    private String descricao;
}

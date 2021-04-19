package com.controlevacina.controlevacinaapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Vacina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomeDaVacina;

    @Column(unique = true)
    private  String emailDoUsuario;

    @Column(nullable = false)
    private  String dataAplicacaoDaVacina;
}

// ### Este arquivo demonstra o 'esqueleto' de código pretendido para a classe Pessoas ###


package com.gevichiatto.sisgu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import java.util.Date;


import lombok.Data;

@Entity
@Data
public abstract class Pessoas {

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    @NotNull(message="{NotNull.Pessoa.nome}")
    private String nome;

    @Column
    @NotNull(message="{NotNull.Pessoa.cpf}")
    private String cpf;

    @Column
    @NotNull(message="{NotNull.Pessoa.dataNascimento}")
    private Date dataNascimento;

    @Column
    @NotNull(message="{NotNull.Pessoa.sexo}")
    private String sexo;

    public int getId(); {
        return this.id;
    }

    public abstract String getNome();

    public abstract String getCpf();

    public abstract Date getdataNascimento();

    public abstract String getSexo();
}

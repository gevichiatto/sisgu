package com.gevichiatto.sisgu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


import lombok.Data;

@Entity
@Data
public class Cargos {

    @Id
    @Column
    private long id;

    @Column
    @NotNull(message="{NotNull.Cargo.nome}")
    private String nome;
    
}
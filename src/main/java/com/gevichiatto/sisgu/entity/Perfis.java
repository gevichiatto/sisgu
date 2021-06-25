package com.gevichiatto.sisgu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


import lombok.Data;

@Entity
@Data
public class Perfis {

    @Id
    @GeneratedValue
    @Column
    public int id;

    @Column
    @NotNull(message="{NotNull.Perfil.nome}")
    public String nome;
    
}
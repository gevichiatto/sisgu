// ### Este arquivo demonstra o 'esqueleto' de código pretendido para a classe Users ###


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
public abstract class Users extends Pessoas { //A classe Users herda da classe abstrata Pessoas

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    @NotNull(message="{NotNull.User.id_pessoa}")
    private int id_pessoa; //Nesta declaração seriam necessárias cláusulas do tipo "belongsTo", informando a natureza
                            //de chave estrangeira deste atributo.

    @Column
    @NotNull(message="{NotNull.User.id_perfil}")
    private int id_perfil; //Nesta declaração seriam necessárias cláusulas do tipo "belongsTo", informando a natureza
                            //de chave estrangeira deste atributo.

    @Column
    @NotNull(message="{NotNull.User.id_cargo}")
    private int id_cargo; //Nesta declaração seriam necessárias cláusulas do tipo "belongsTo", informando a natureza
                            //de chave estrangeira deste atributo.

    @Column
    @NotNull(message="{NotNull.User.sexo}")
    private Date data_cadastro;

    //A seguir estão os métodos getters. São apenas protótipos.

    public int getId() {
        return this.id;
    }

    public int getIdPessoa() {
        return this.id_pessoa;
    }

    public int getIdPerfil() {
        return this.id_perfil;
    }

    public int getIdCargo() {
        return this.id_cargo;
    }

    public Date getDataCadastro() {
        return this.data_cadastro;
    }

    public String getNome() {
        //Demais getters
    }

    public String getCpf() {
        //Demais getters
    }

    public Date getdataNascimento() {
        //Demais getters
    }

    public String getSexo() {
        //Demais getters
    }
}

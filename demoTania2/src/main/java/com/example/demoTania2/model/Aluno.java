/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demoTania2.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author taniabasso
 */
@Entity
@Table
public class Aluno {
    
    @Id
    @Column
    private int ra;
    
    @Column
    private String nome;

   /* @ManyToMany
    @JoinTable (name= "Matricula", 
        joinColumns = @JoinColumn(name = "ra"),
        inverseJoinColumns = @JoinColumn(name = "codigoDisc"))
    private List<Disciplina> listaDisc;*/
    
    @ManyToMany (mappedBy = "listaAlunosMatriculados")
    private List<Disciplina> listaDisc;
    
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplina> getListaDisc() {
        return listaDisc;
    }

    public void setListaDisc(List<Disciplina> listaDisc) {
        this.listaDisc = listaDisc;
    }
    
    
}

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
public class Disciplina {
    
    @Id
    private int codigoDisc;
    
    @Column
    private String nomeDisc;
    
    //@ManyToMany (mappedBy = "listaDisc")
    //private List<Aluno> listaAlunosMatriculados;

    @ManyToMany
    @JoinTable (name= "Matricula", 
        joinColumns = @JoinColumn(name = "codigoDisc"),
        inverseJoinColumns = @JoinColumn(name = "ra"))
    private List<Aluno> listaAlunosMatriculados;
    
    public int getCodigoDisc() {
        return codigoDisc;
    }

    public void setCodigoDisc(int codigoDisc) {
        this.codigoDisc = codigoDisc;
    }

    public String getNomeDisc() {
        return nomeDisc;
    }

    public void setNomeDisc(String nomeDisc) {
        this.nomeDisc = nomeDisc;
    }

    public List<Aluno> getListaAlunosMatriculados() {
        return listaAlunosMatriculados;
    }

    public void setListaAlunosMatriculados(List<Aluno> listaAlunosMatriculados) {
        this.listaAlunosMatriculados = listaAlunosMatriculados;
    }
    
    
}

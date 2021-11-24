/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demoTania2.repository;

import com.example.demoTania2.model.Aluno;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author taniabasso
 */
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{
    
    
    @Query (value= "select a from Aluno a where a.nome like %?1% ")
    public List<Aluno> findByName (String nome);
    
    
}

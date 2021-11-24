/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demoTania2.repository;

import com.example.demoTania2.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author taniabasso
 */
public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer> {
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demoTania2.controller;

import com.example.demoTania2.model.Aluno;
import com.example.demoTania2.model.Disciplina;
import com.example.demoTania2.repository.DisciplinaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author taniabasso
 */

@RestController
@RequestMapping (value = "/apiDisc")
public class DisciplinaController {
    
    @Autowired
    DisciplinaRepository discRepo;
    
    @GetMapping("/todasDisc")
    public List<Disciplina> todasDisc ()
    {
        return discRepo.findAll();
    }
    
    @PutMapping ("/inserirListaAl")
    public void inserirDiscComAluno (@RequestBody Disciplina disc)
    {
        System.out.println("+++" + disc.getNomeDisc());
        List <Aluno> als = disc.getListaAlunosMatriculados();
        for (Aluno a: als )
        {
            System.out.println("=======" + a.getNome());
        }
        System.out.println("===" + als);
        discRepo.save(disc);
    }
}

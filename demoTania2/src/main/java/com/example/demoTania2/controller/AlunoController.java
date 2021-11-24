/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demoTania2.controller;

import com.example.demoTania2.model.Aluno;
import com.example.demoTania2.repository.AlunoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping (value = "/apiAluno")
public class AlunoController {
    
    @Autowired
    AlunoRepository alRepo;
    
    @GetMapping (value = "/todos")
    public List<Aluno> buscarTodosAlunos()
    {
        return alRepo.findAll();
    }
    
    @GetMapping (value = "/aluno/{ra}")
    public Optional<Aluno> buscarPorRa (@PathVariable (value="ra") int ra)
    {
        return alRepo.findById(ra);
    }
    
    @PostMapping (value="/inserir")
    public void inserirAluno (@RequestBody Aluno al)
    {
        alRepo.save(al);
    }
    
    @DeleteMapping (value="/excluir")
    public void excluirAluno (@RequestBody Aluno al)
    {
        alRepo.delete(al);
    }
    
    @PutMapping (value="/atualizar")
    public void atualizarAluno (@RequestBody Aluno al)
    {
        alRepo.save(al);
    }
    
    @GetMapping (value = "/alunoNome/{nome}")
    public List<Aluno> buscarPorNome (@PathVariable (value="nome") String nome)
    {
        return alRepo.findByName(nome);
    }
    
    
}

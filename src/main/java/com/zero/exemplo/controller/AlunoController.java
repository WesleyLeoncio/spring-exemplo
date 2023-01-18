package com.zero.exemplo.controller;

import com.zero.exemplo.modelo.Aluno;
import com.zero.exemplo.service.AlunoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoController {

    final
    AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping("/todos")
    public ResponseEntity<List<Aluno>> listarTodos() {
        return ResponseEntity.ok().body(alunoService.listarTodos());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Aluno> buscarId(@PathVariable Integer id){
        return ResponseEntity.ok().body(alunoService.buscarId(id));
    }

    @PostMapping
    public ResponseEntity<Aluno> cadastrar(@RequestBody Aluno aluno) {
        return ResponseEntity.ok().body(alunoService.cadastrar(aluno));
    }

    @PutMapping
    public ResponseEntity<Aluno> editar(@RequestBody Aluno aluno) {
        return ResponseEntity.ok().body(alunoService.editar(aluno));
    }

}
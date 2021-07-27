package br.gotasdetecnologia.controller;

import java.time.Instant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gotasdetecnologia.model.Aluno;

@RestController
@RequestMapping("alunos")
public class AlunoController {

	@GetMapping
	//public String getInfo() {
	public Aluno getInfo() {
		
		Aluno aluno = new Aluno(1L, "Everton", "3333-3333", "everton@gmail.com", Instant.now());
	
		
		return aluno;
//return "mensagem";
		
	}

}

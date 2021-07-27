package br.gotasdetecnologia.controller;

import java.time.Instant;
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
import br.gotasdetecnologia.model.Aluno;
import br.gotasdetecnologia.repository.AlunoRepository;

@RestController
@RequestMapping("alunos")
public class AlunoController {

	@Autowired
	private AlunoRepository alunoRepository;
	
//	@GetMapping		// estava no inicio public String getInfo() 
//	public Aluno getInfo() {
//		Aluno aluno = new Aluno(1L, "Everton", "3333-3333", "everton@gmail.com", Instant.now());
//		return aluno; //return "mensagem";
	//}
	
	@PostMapping		
	public void incluir(@RequestBody Aluno aluno){
		alunoRepository.save(aluno);
	}
	
	@GetMapping		
	public List<Aluno> listar() {
		return alunoRepository.findAll();
	}

	@PutMapping
	public void alterar(@RequestBody Aluno aluno) {
		alunoRepository.save(aluno);
	}

	@DeleteMapping("/{matricula}") 
	public void deletar (@PathVariable Long matricula) {
		alunoRepository.deleteById(matricula);
	}

	@GetMapping("/{matricula}")
	public Optional<Aluno> ler(@PathVariable Long matricula){
		return alunoRepository.findById(matricula);
	}
	}
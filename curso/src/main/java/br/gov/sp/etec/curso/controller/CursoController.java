package br.gov.sp.etec.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.etec.curso.dto.CursoDto;
import br.gov.sp.etec.curso.entity.CursoEntity;
import br.gov.sp.etec.curso.repository.CursoRepository;

@RestController
@RequestMapping(value= "/curso")
public class CursoController {
	
	@Autowired
	CursoRepository repository;
	
	@GetMapping(value = "consultar_curso")	
	public ResponseEntity<?> findAllCurso(){		
		List<CursoEntity> listacursos = repository.findAll();
		return ResponseEntity.ok(listacursos);
	}
	
	@PostMapping(path = "adicionar_curso", consumes ="application/json", produces = "application/json")
	public ResponseEntity<?> AddCurso(@RequestBody CursoDto dto){
		CursoEntity entity = new CursoEntity(dto.getNome(), dto.getSigla());
		CursoEntity response = repository.save(entity);
		return ResponseEntity.ok(dto);			
	}
}
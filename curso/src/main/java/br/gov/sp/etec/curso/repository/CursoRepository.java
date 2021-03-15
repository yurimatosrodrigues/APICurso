package br.gov.sp.etec.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.etec.curso.entity.CursoEntity;

public interface CursoRepository  extends JpaRepository<CursoEntity, Long>{	
}

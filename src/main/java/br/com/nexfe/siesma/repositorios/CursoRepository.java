package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
	
}

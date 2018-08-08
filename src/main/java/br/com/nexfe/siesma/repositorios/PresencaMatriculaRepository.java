package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.PresencaMatricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresencaMatriculaRepository extends JpaRepository<PresencaMatricula, Long> {

}

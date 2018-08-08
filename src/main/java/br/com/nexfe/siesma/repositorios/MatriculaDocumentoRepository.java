package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.MatriculaDocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaDocumentoRepository extends JpaRepository<MatriculaDocumento, Long> {

}

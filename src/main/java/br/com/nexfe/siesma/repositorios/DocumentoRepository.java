package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.Documento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentoRepository extends JpaRepository<Documento, Long> {

}

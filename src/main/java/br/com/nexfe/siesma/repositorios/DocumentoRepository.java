package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.Documento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentoRepository extends JpaRepository<Documento, Long> {

    @Query("select e from Documento e order by e.nomeDocumento")
    List<Documento> findAllOrdenado();

}

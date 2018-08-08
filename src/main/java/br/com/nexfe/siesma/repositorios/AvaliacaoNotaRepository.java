package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.AvaliacaoNota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoNotaRepository extends JpaRepository<AvaliacaoNota, Long> {

}

package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvaliacaoRepository  extends JpaRepository<Avaliacao, Long> {
	
}
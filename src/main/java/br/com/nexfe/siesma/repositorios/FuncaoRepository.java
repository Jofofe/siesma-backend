package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.Funcao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncaoRepository extends JpaRepository<Funcao, Long> {

}

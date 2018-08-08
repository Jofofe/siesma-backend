package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.Desconto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DescontoRepository extends JpaRepository<Desconto, Long> {

}
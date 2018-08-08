package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.LancamentoComercial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LancamentoComercialRepository extends JpaRepository<LancamentoComercial, Long> {

}
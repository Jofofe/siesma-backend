package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.DescontoAplicado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DescontoAplicadoRepository extends JpaRepository<DescontoAplicado, Long> {

}

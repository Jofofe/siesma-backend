package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.Empregado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpregadoRepository extends JpaRepository<Empregado, Long> {

}

package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.Uf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UfRepository extends JpaRepository<Uf, Long> {

}

package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.Presenca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresencaRepository extends JpaRepository<Presenca, Long> {

}
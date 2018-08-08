package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.NivelAcesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NivelAcessoRepository extends JpaRepository<NivelAcesso, Long> {

}

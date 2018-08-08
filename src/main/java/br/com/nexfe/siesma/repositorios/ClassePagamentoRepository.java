package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.ClassePagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassePagamentoRepository  extends JpaRepository<ClassePagamento, Long> {

}

package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.Modulo;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Repository
public interface ModuloRepository extends JpaRepository<Modulo, Long> {

}

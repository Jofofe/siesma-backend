package br.com.nexfe.siesma.repositorios;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@NamedQueries(value = { @NamedQuery(name="UnidadeMedida.selectAll", query="select e from UnidadeMedida e order by e.nomeUnidadeMedida") } )
@Table(name = "UNIDADE_MEDIDA")
public class UnidadeMedidaRepository implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_UNIDADE_MEDIDA")
	private Long idUnidadeMedida;
	
	@Column(name = "NOME_UNIDADE_MEDIDA")
	private String nomeUnidadeMedida;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = TipoLancamentoRepository.class, mappedBy="unidadeMedida")
	private List<TipoLancamentoRepository> tiposLancamentos;

}

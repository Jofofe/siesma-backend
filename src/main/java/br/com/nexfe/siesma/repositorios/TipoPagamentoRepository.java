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
@NamedQueries(value = { @NamedQuery(name="TipoPagamento.selectAll", query="select e from TipoPagamento e order by e.nomeTipoPagamento") } )
@Table(name = "TIPO_PAGAMENTO")
public class TipoPagamentoRepository implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_TIPO_PAGAMENTO")
	private Long idTipoPagamento;
	
	@Column(name = "NOME_TIPO_PAGAMENTO")
	private String nomeTipoPagamento;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = TipoLancamentoRepository.class, mappedBy="tipoPagamento")
	private List<TipoLancamentoRepository> tiposLancamentos;
	
}

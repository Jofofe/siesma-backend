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
@NamedQueries(value = { 
		@NamedQuery(name="TipoLancamento.selectAll", query="select e from TipoLancamento e where e.status = 'Ativo' order by e.descricao"),
		@NamedQuery(name="TipoLancamento.selectAllNoDistinction", query="select e from TipoLancamento e order by e.descricao") 
} )
@Table(name = "TIPO_LANCAMENTO")
public class TipoLancamentoRepository implements Serializable {
	
	private static final long serialVersionUID = 5865432441665436228L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TIPO_LANCAMENTO")
	private Long idTipoLancamento;
	
	@Column(name = "DESCRICAO", length = 50, nullable = false)
	private String descricao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_UNIDADE_MEDIDA")
	private UnidadeMedidaRepository unidadeMedida;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_TIPO_PAGAMENTO")
	private TipoPagamentoRepository tipoPagamento;
	
	@Column(name = "OBS_LANCAMENTO", length = 100)
	private String obsLancamento;
	
	@Column(name = "STATUS", length = 20, nullable = false)
	private String status;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = LancamentoComercialRepository.class, mappedBy="tipoLancamento")
	private List<LancamentoComercialRepository> lancamentosComerciais;
	
}

package br.com.nexfe.siesma.dtos;

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
@Table(name = "TIPO_LANCAMENTO")
public class TipoLancamentoDTO implements Serializable {
	
	private static final long serialVersionUID = 5865432441665436228L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TIPO_LANCAMENTO")
	private Long idTipoLancamento;
	
	@Column(name = "DESCRICAO", length = 50, nullable = false)
	private String descricao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_UNIDADE_MEDIDA")
	private UnidadeMedidaDTO unidadeMedidaDTO;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_TIPO_PAGAMENTO")
	private TipoPagamentoDTO tipoPagamentoDTO;
	
	@Column(name = "OBS_LANCAMENTO", length = 100)
	private String obsLancamento;
	
	@Column(name = "STATUS", length = 20, nullable = false)
	private String status;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = LancamentoComercialDTO.class, mappedBy="tipoLancamentoDTO")
	private List<LancamentoComercialDTO> lancamentosComerciais;
	
}

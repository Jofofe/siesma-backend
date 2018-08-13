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
@Table(name = "TIPO_PAGAMENTO")
public class TipoPagamentoDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_TIPO_PAGAMENTO")
	private Long idTipoPagamento;
	
	@Column(name = "NOME_TIPO_PAGAMENTO")
	private String nomeTipoPagamento;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = TipoLancamentoDTO.class, mappedBy="tipoPagamentoDTO")
	private List<TipoLancamentoDTO> tiposLancamentos;
	
}

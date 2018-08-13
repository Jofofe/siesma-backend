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
@Table(name = "UNIDADE_MEDIDA")
public class UnidadeMedidaDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_UNIDADE_MEDIDA")
	private Long idUnidadeMedida;
	
	@Column(name = "NOME_UNIDADE_MEDIDA")
	private String nomeUnidadeMedida;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = TipoLancamentoDTO.class, mappedBy="unidadeMedidaDTO")
	private List<TipoLancamentoDTO> tiposLancamentos;

}

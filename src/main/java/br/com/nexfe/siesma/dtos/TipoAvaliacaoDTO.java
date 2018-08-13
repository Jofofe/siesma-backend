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
@Table(name = "TIPO_AVALIACAO")
public class TipoAvaliacaoDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_TIPO_AVALIACAO")
	private Long idTipoAvaliacao;
	
	@Column(name = "NOME_TIPO_AVALIACAO")
	private String nomeAvaliacao;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = AvaliacaoDTO.class, mappedBy="tipoAvaliacao")
	private List<AvaliacaoDTO> avaliacoes;
	
}

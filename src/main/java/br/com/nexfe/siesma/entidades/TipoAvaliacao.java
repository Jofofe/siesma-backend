package br.com.nexfe.siesma.entidades;

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
public class TipoAvaliacao implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_TIPO_AVALIACAO")
	private Long idTipoAvaliacao;
	
	@Column(name = "NOME_TIPO_AVALIACAO")
	private String nomeAvaliacao;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = Avaliacao.class, mappedBy="tipoAvaliacao")
	private List<Avaliacao> avaliacoes;
	
}

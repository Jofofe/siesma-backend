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
@NamedQueries(value = { @NamedQuery(name="TipoAvaliacao.selectAll", query="select e from TipoAvaliacao e order by e.nomeAvaliacao") } )
@Table(name = "TIPO_AVALIACAO")
public class TipoAvaliacaoRepository implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_TIPO_AVALIACAO")
	private Long idTipoAvaliacao;
	
	@Column(name = "NOME_TIPO_AVALIACAO")
	private String nomeAvaliacao;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = AvaliacaoRepository.class, mappedBy="tipoAvaliacao")
	private List<AvaliacaoRepository> avaliacoes;
	
}

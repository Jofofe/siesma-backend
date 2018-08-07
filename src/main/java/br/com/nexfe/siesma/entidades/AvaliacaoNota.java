package br.com.nexfe.siesma.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NamedQueries(value = { @NamedQuery(name="AvaliacaoNota.selectAll", query="select e from AvaliacaoNota e") } )
@Table(name = "AVALIACAO_NOTA")
public class AvaliacaoNota implements Serializable {
	
	private static final long serialVersionUID = 3285709846262607435L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_AVALIACAO_NOTA")
	private Long idAvaliacaoNota;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_AVALIACAO")
	private Avaliacao avaliacao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_MATRICULA")
	private Matricula matricula;
	
	@Column(name = "NOTA", nullable = false)
	private BigDecimal nota;

}

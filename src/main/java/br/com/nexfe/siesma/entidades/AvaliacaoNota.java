package br.com.nexfe.siesma.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
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

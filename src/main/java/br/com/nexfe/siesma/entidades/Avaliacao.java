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
@Table(name = "AVALIACAO")
public class Avaliacao implements Serializable {
	
	private static final long serialVersionUID = 5203700797322414197L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_AVALIACAO")
	private Long idAvaliacao;
	
	@Column(name = "NOME_AVALIACAO", length = 30, nullable = false)
	private String nome;
	
	@Column(name = "OBS_AVALIACAO", length = 100)
	private String obsAvaliacao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_TIPO_AVALIACAO")
	private TipoAvaliacao tipoAvaliacao;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_DISCIPLINA")
	private Disciplina disciplina;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, 
			targetEntity = AvaliacaoNota.class, mappedBy="avaliacao")
	private List<AvaliacaoNota> avaliacoesNotas;
	
}
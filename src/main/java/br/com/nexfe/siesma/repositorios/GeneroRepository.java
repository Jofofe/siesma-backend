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
@NamedQueries(value = { @NamedQuery(name="Genero.selectAll", query="select e from Genero e order by e.nomeGenero") } )
@Table(name = "GENERO")
public class GeneroRepository implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_GENERO")
	private Long idGenero;
	
	@Column(name = "NOME_GENERO")
	private String nomeGenero;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = Aluno.class, mappedBy="genero")
	private List<Aluno> alunos;

}

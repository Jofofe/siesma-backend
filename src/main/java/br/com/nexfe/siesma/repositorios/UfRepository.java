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
@NamedQueries(value = { @NamedQuery(name="Uf.selectAll", query="select e from Uf e order by e.nomeUf") } )
@Table(name = "UF")
public class UfRepository implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_UF")
	private Long idUf;
	
	@Column(name = "NOME_UF")
	private String nomeUf;
	
	@Column(name = "SG_UF")
	private String sgUf;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = Aluno.class, mappedBy="uf")
	private List<Aluno> alunos;

}

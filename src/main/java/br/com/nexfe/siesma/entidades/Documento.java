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
@NamedQueries(value = { @NamedQuery(name="Documento.selectAll", query="select e from Documento e order by e.nomeDocumento") } )
@Table(name = "DOCUMENTO")
public class Documento implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_DOCUMENTO")
	private Long idDocumento;
	
	@Column(name = "NOME_DOCUMENTO")
	private String nomeDocumento;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, 
			targetEntity = MatriculaDocumento.class, mappedBy="documento")
	private List<MatriculaDocumento> matriculasDocumentos;


	
}

package br.com.nexfe.siesma.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "MATRICULA_DOCUMENTO")
public class MatriculaDocumento implements Serializable {
	
	private static final long serialVersionUID = 1549556007971257400L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_MATRICULA_DOCUMENTO")
	private Long idMatriculaDocumento;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_MATRICULA")
	private Matricula matricula;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_DOCUMENTO")
	private Documento documento;
	
	@Column(name = "ENTREGUE", nullable = false)
	private boolean entregue;

}

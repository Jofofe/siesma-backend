package br.com.nexfe.siesma.repositorios;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NamedQueries(value = { @NamedQuery(name="MatriculaDocumento.selectAll", query="select e from MatriculaDocumento e") } )
@Table(name = "MATRICULA_DOCUMENTO")
public class MatriculaDocumentoRepository implements Serializable {
	
	private static final long serialVersionUID = 1549556007971257400L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_MATRICULA_DOCUMENTO")
	private Long idMatriculaDocumento;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_MATRICULA")
	private MatriculaRepository matricula;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_DOCUMENTO")
	private DocumentoRepository documento;
	
	@Column(name = "ENTREGUE", nullable = false)
	private boolean entregue;

}

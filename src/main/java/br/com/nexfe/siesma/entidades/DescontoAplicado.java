package br.com.nexfe.siesma.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "DESCONTO_APLICADO")
public class DescontoAplicado implements Serializable {
	
	private static final long serialVersionUID = -2959477147744399856L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_DESCONTO_APLICADO")
	private Long idDescontoAplicado;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ALUNO")
	private Aluno aluno;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_MODULO")
	private Modulo modulo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_DESCONTO")
	private Desconto desconto;
	
	@Column(name = "OBS_DESCONTO_APLICADO", length = 100)
	private String obsDesconto;

}

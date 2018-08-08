package br.com.nexfe.siesma.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@NamedQueries(value = { @NamedQuery(name="Desconto.selectAllDate", query="select e from Desconto e "
		+ " where :dataAtual between e.dtInicio and e.dtFim order by e.nome") } )
@Table(name = "DESCONTO")
public class Desconto implements Serializable {
	
	private static final long serialVersionUID = -926610339785316306L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_DESCONTO")
	private Long idDesconto;
	
	@Column(name = "NOME_DESCONTO", length = 30, nullable = false)
	private String nome;
	
	@Column(name = "PERCENTUAL_DESCONTO", nullable = false)
	private BigDecimal percentual;
	
	@Column(name = "DT_INICIO", nullable = false)
	private Date dtInicio;
	
	@Column(name = "DT_FIM", nullable = false)
	private Date dtFim;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = DescontoAplicado.class, mappedBy="desconto")
	private List<DescontoAplicado> descontosAplicados;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = LancamentoComercial.class, mappedBy="desconto")
	private List<LancamentoComercial> lancamentosComerciais;
	
}
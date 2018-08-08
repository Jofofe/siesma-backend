package br.com.nexfe.siesma.repositorios;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@NamedQueries(value = { @NamedQuery(name="FormaPagamento.selectAllDate", query="select e from FormaPagamento e where :dataAtual between e.dtInicio and e.dtFim order by e.nome") } )
@Table(name = "FORMA_PAGAMENTO")
public class FormaPagamentoRepository implements Serializable {
	
	private static final long serialVersionUID = -1230554335503936347L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_FORMA_PAGAMENTO")
	private Long idFormaPagamento;
	
	@Column(name = "NOME_PAGAMENTO", length = 50, nullable = false)
	private String nome;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CLASSE_PAGAMENTO")
	private ClassePagamentoRepository classePagamento;
	
	@Column(name = "QTD_PARCELAS", nullable = false)
	private Integer qtdParcelas;
	
	@Column(name = "DT_INICIO", nullable = false)
	private Date dtInicio;
	
	@Column(name = "DT_FIM", nullable = false)
	private Date dtFim;
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity = LancamentoComercialRepository.class, mappedBy="formaPagamento")
	private List<LancamentoComercialRepository> lancamentosComerciais;
	
}
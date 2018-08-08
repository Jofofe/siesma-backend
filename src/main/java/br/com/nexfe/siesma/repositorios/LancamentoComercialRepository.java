package br.com.nexfe.siesma.repositorios;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@NamedQueries(value = { 
		@NamedQuery(name="LancamentoComercial.selectAllDate", query="select e from LancamentoComercial e where :dataAtual between e.formaPagamento.dtInicio and e.formaPagamento.dtFim "
		+ " order by e.formaPagamento.nome"),
		@NamedQuery(name="LancamentoComercial.selectEmpregados", query="select e from LancamentoComercial e where e.matricula is null"),
		@NamedQuery(name="LancamentoComercial.selectAlunos", query="select e from LancamentoComercial e where e.empregado is null")
} )
@Table(name = "LANCAMENTO_COMERCIAL")
public class LancamentoComercialRepository implements Serializable {
	
	private static final long serialVersionUID = 2110315437815080324L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_LANCAMENTO_COMERCIAL")
	private Long idLancamentoComercial;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_FORMA_PAGAMENTO")
	private FormaPagamentoRepository formaPagamento;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_TIPO_LANCAMENTO")
	private TipoLancamentoRepository tipoLancamento;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_MATRICULA")
	private MatriculaRepository matricula;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_DESCONTO")
	private DescontoRepository desconto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_EMPREGADO")
	private EmpregadoRepository empregadoRepository;
	
	@Column(name = "VALOR_RECEBIMENTO", nullable = false)
	private BigDecimal vlRecebimento;
	
	@Column(name = "DT_PREVISTA")
	private Date dtPrevista;
	
	@Column(name = "DT_RECEBIMENTO")
	private Date dtRecebimento;
	
	@Column(name = "STATUS", length = 20, nullable = false)
	private String status;
	
	@Column(name = "OBS_RECEBIMENTO", length = 100)
	private String obsRecebimento;
	
	@Transient
	public String getNomeContemplado() {
		if(this.matricula == null) {
			return this.empregadoRepository.getNome();
		} else {
			return this.matricula.getAluno().getNome();
		}
	}
	
	@Transient
	public String getTipoContemplado() {
		if(this.matricula == null) {
			return "EmpregadoRepository";
		} else {
			return "Aluno matriculado";
		}
	}
	
}
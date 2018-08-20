package br.com.nexfe.siesma.dtos;

import javax.persistence.Transient;
import java.math.BigDecimal;
import java.util.Date;

public class LancamentoComercialDTO {

	private Long idLancamentoComercial;

	private FormaPagamentoDTO formaPagamentoDTO;

	private TipoLancamentoDTO tipoLancamentoDTO;

	private MatriculaDTO matriculaDTO;

	private DescontoDTO descontoDTO;

	private EmpregadoDTO empregadoDTO;
	
	private BigDecimal vlRecebimento;
	
	private Date dtPrevista;
	
	private Date dtRecebimento;
	
	private String status;
	
	private String obsRecebimento;
	
}
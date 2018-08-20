package br.com.nexfe.siesma.mapper;

import br.com.nexfe.siesma.dtos.FormaPagamentoDTO;
import br.com.nexfe.siesma.entidades.FormaPagamento;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface FormaPagamentoMapper extends  BaseMapper<FormaPagamento, FormaPagamentoDTO>  {
}

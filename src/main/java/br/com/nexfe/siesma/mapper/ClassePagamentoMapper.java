package br.com.nexfe.siesma.mapper;

import br.com.nexfe.siesma.dtos.ClassePagamentoDTO;
import br.com.nexfe.siesma.entidades.ClassePagamento;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ClassePagamentoMapper extends  BaseMapper<ClassePagamento, ClassePagamentoDTO>  {
}

package br.com.nexfe.siesma.mapper;

import br.com.nexfe.siesma.dtos.DescontoDTO;
import br.com.nexfe.siesma.entidades.Desconto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DescontoMapper extends  BaseMapper<Desconto, DescontoDTO>  {
}

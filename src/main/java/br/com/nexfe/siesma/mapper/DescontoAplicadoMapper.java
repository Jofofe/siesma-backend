package br.com.nexfe.siesma.mapper;

import br.com.nexfe.siesma.dtos.DescontoAplicadoDTO;
import br.com.nexfe.siesma.entidades.DescontoAplicado;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DescontoAplicadoMapper extends  BaseMapper<DescontoAplicado, DescontoAplicadoDTO>  {
}

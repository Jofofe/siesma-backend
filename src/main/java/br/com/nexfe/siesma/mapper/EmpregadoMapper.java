package br.com.nexfe.siesma.mapper;

import br.com.nexfe.siesma.dtos.EmpregadoDTO;
import br.com.nexfe.siesma.entidades.Empregado;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EmpregadoMapper extends  BaseMapper<Empregado, EmpregadoDTO>  {
}

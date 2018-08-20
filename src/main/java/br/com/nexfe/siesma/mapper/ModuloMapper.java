package br.com.nexfe.siesma.mapper;

import br.com.nexfe.siesma.dtos.ModuloDTO;
import br.com.nexfe.siesma.entidades.Modulo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ModuloMapper extends  BaseMapper<Modulo, ModuloDTO>  {
}

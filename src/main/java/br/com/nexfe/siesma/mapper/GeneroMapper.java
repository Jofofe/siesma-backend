package br.com.nexfe.siesma.mapper;

import br.com.nexfe.siesma.dtos.GeneroDTO;
import br.com.nexfe.siesma.entidades.Genero;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface GeneroMapper extends  BaseMapper<Genero, GeneroDTO>  {
}

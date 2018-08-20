package br.com.nexfe.siesma.mapper;

import br.com.nexfe.siesma.dtos.MatriculaDTO;
import br.com.nexfe.siesma.entidades.Matricula;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MatriculaMapper extends  BaseMapper<Matricula, MatriculaDTO>  {
}

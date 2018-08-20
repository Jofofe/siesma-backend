package br.com.nexfe.siesma.mapper;

import br.com.nexfe.siesma.dtos.PresencaMatriculaDTO;
import br.com.nexfe.siesma.entidades.PresencaMatricula;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PresencaMatriculaMapper extends  BaseMapper<PresencaMatricula, PresencaMatriculaDTO>  {
}

package br.com.nexfe.siesma.mapper;

import br.com.nexfe.siesma.dtos.MatriculaDocumentoDTO;
import br.com.nexfe.siesma.entidades.MatriculaDocumento;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MatriculaDocumentoMapper extends  BaseMapper<MatriculaDocumento, MatriculaDocumentoDTO>  {
}

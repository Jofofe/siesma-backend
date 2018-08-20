package br.com.nexfe.siesma.mapper;

import br.com.nexfe.siesma.dtos.AlunoDTO;
import br.com.nexfe.siesma.dtos.DocumentoDTO;
import br.com.nexfe.siesma.entidades.Aluno;
import br.com.nexfe.siesma.entidades.Documento;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DocumentoMapper extends  BaseMapper<Documento, DocumentoDTO>  {
}

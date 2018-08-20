package br.com.nexfe.siesma.mapper;

import br.com.nexfe.siesma.dtos.NivelAcessoDTO;
import br.com.nexfe.siesma.entidades.NivelAcesso;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface NivelAcessoMapper extends  BaseMapper<NivelAcesso, NivelAcessoDTO>  {
}

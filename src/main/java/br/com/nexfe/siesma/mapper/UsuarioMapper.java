package br.com.nexfe.siesma.mapper;

import br.com.nexfe.siesma.dtos.UsuarioDTO;
import br.com.nexfe.siesma.entidades.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(componentModel="spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UsuarioMapper extends  BaseMapper<Usuario, UsuarioDTO>  {
}

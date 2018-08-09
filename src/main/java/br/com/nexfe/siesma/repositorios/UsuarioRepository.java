package br.com.nexfe.siesma.repositorios;

import br.com.nexfe.siesma.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("select e from Usuario e where e.email = :email and e.senha = :senha")
    Usuario findLogin(@Param("email") String email, @Param("senha") String senha);

}

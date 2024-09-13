package com.servipetJ.servipet2.usuario.repositorio;

import com.servipetJ.servipet2.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioUsuario extends JpaRepository <Usuario, Long> {

}

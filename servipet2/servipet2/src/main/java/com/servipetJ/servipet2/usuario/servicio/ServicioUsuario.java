package com.servipetJ.servipet2.usuario.servicio;

import com.servipetJ.servipet2.usuario.Usuario;
import com.servipetJ.servipet2.usuario.repositorio.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ServicioUsuario {
    @Autowired
     private RepositorioUsuario repositorioUsuario;
    public Usuario crearUsuario( Usuario usuario){
       return repositorioUsuario.save(usuario);


    }
}

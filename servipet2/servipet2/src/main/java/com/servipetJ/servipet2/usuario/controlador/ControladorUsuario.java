package com.servipetJ.servipet2.usuario.controlador;

import com.servipetJ.servipet2.usuario.Usuario;
import com.servipetJ.servipet2.usuario.servicio.ServicioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Usuario")
public class ControladorUsuario {
    @Autowired
    private ServicioUsuario servicioUsuario;
    @PostMapping ("/registrar")
    public String registrarUsuario(@RequestBody Usuario usuario){
        servicioUsuario.crearUsuario(usuario);
        return ("Usuario Registrado");
    }
}

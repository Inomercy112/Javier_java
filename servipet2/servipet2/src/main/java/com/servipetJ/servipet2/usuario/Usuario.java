package com.servipetJ.servipet2.usuario;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity //entidad
@Data //set-get de atributos
@NoArgsConstructor //constructor de la clase sin argumentos
@Table(name="usuario")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private Integer idUsuario;
    @Column(name="documento")
    private Integer documento;
    @Column(name = "nombre_usuario")
    private String nombreUsuario;
    @Column(name="correo_usuario")
    private String correoUsuario;
    @Column(name="contrasena_usuario")
    private String contrasenaUsuario;
    @Column(name="fecha_nacimiento")
    private Date fechaNacimiento;
    @Column (name="direccion")
    private String direccion;
    @Column (name = "telefono")
    private Integer telefono;
    @Column (name = "rol")
    private Integer rol;
    @Column (name = "estado_usuario")
    private Integer estadoUsuario;



}

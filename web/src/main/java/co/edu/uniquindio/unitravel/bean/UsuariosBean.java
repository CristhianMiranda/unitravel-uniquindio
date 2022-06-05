package co.edu.uniquindio.unitravel.bean;

import co.edu.uniquindio.proyecto.entidades.Usuario;
import co.edu.uniquindio.proyecto.servicios.UsuarioServicio;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
@Component
@ViewScoped
public class UsuariosBean implements Serializable {
    //   private String mensaje = "Mi primera página en JSF";


    @Autowired
    private UsuarioServicio usuarioServicio;



    @Getter @Setter
    public Usuario usuario;



    @PostConstruct
    public void inicializar(){
        usuario = new Usuario();
    }

    public void registrarUsuario()throws Exception {
        try {
            System.out.println(usuario.toString());
            usuarioServicio.registraUsuario(usuario);
        } catch (Exception e) {
            System.out.println("PRUEBAsss");
            e.printStackTrace();
        }
    }
}

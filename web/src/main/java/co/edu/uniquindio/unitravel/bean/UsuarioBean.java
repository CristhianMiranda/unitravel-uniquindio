package co.edu.uniquindio.unitravel.bean;

import co.edu.uniquindio.unitravel.entidades.Usuario;
import co.edu.uniquindio.unitravel.servicios.UsuarioServicio;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
@Component
@ViewScoped
public class UsuarioBean implements Serializable {
    //   private String mensaje = "Mi primera página en JSF";


    @Autowired
    private UsuarioServicio usuarioServicio;



    @Getter @Setter
    public Usuario usuario;



    @PostConstruct
    public void inicializar(){

        usuario = new Usuario();
    }

    public void validarLogin() throws Exception{
        try {
          System.out.println(usuario.toString());
            usuarioServicio.validarLogin(usuario.getEmail(), usuario.getContraseña());
         //   System.out.println("OTOARKOSK");
            FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Alerta",
                    "Login exitoso");
            FacesContext.getCurrentInstance().addMessage(null, facesMsg);
        } catch (Exception e) {
            FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Alerta",
                    e.getMessage());
            FacesContext.getCurrentInstance().addMessage(null, facesMsg);
            e.printStackTrace();
        }

    }
    public void recuperarContrasena() throws Exception
    {
        try {
            usuarioServicio.recuperarContrasenaCorreo(usuario.getEmail());
            FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Alerta",
                    "Correo enviado");
            FacesContext.getCurrentInstance().addMessage(null, facesMsg);
        } catch (Exception e) {
            FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Alerta",
                    e.getMessage());
            FacesContext.getCurrentInstance().addMessage(null, facesMsg);
            e.printStackTrace();
        }
    }

    public void registrarUsuario()throws Exception {
        try {
                usuarioServicio.registraUsuario(usuario);
                FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Alerta",
                        "Registro exitoso");
                FacesContext.getCurrentInstance().addMessage(null, facesMsg);
            } catch (Exception e) {
                FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Alerta",
                    e.getMessage());
            FacesContext.getCurrentInstance().addMessage(null, facesMsg);
            e.printStackTrace();
        }
    }
}

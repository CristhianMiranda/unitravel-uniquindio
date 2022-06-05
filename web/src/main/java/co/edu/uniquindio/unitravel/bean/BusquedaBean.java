package co.edu.uniquindio.unitravel.bean;
import co.edu.uniquindio.unitravel.entidades.Hotel;
import co.edu.uniquindio.unitravel.entidades.Usuario;
import co.edu.uniquindio.unitravel.servicios.UsuarioServicio;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
@Component
@ViewScoped
public class BusquedaBean implements Serializable {



/*
    @Getter
    @Setter
    public Hotel hotel;*/
  @Autowired
  private UsuarioServicio usuarioServicio;

  @Getter
  @Setter
  private String busqueda;

  @Value("#{param['busqueda']}")
    private String busquedaParam;




    @Getter @Setter
    private   Hotel hotel;

    @PostConstruct
    public void inicializar(){
        if(!(busquedaParam ==null))
        {
        try {
            hotel = usuarioServicio.obtenerHotel(busquedaParam);
            FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Alerta",
                    "Busqueda exitosa");
            FacesContext.getCurrentInstance().addMessage(null, facesMsg);
        } catch (Exception e) {
            FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Alerta",
                    e.getMessage());
            FacesContext.getCurrentInstance().addMessage(null, facesMsg);
            e.printStackTrace();
        }
        }
    }
        public String buscar()
        {
            if(busqueda!=null)
            {
            System.out.println("NOOOOOOOOOOOOOOOO"+busqueda);
            }
            return "resultados_busqueda?faces-redirect=true&amp;busqueda="+busqueda;
        }
    }
/*
    public void buscarHotel()
    {
        try {
            usuarioServicio.obtenerHotel(hotel.getNombre());
            FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Alerta",
                    "Busqueda exitosa");
            FacesContext.getCurrentInstance().addMessage(null, facesMsg);
        } catch (Exception e) {
            FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Alerta",
                    e.getMessage());
            FacesContext.getCurrentInstance().addMessage(null, facesMsg);
            e.printStackTrace();
        }
    }*/


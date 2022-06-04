package co.edu.uniquindio.proyecto;


import co.edu.uniquindio.proyecto.entidades.Ciudad;
import co.edu.uniquindio.proyecto.entidades.Hotel;
import co.edu.uniquindio.proyecto.entidades.Reserva;
import co.edu.uniquindio.proyecto.entidades.Usuario;
import co.edu.uniquindio.proyecto.servicios.EmailService;
import co.edu.uniquindio.proyecto.servicios.UsuarioServicio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
//@Transactional
public class UsuarioServicioTest {

    @Autowired
    private UsuarioServicio usuarioServicio;
    @Autowired
    private EmailService emailService;
    @Sql("classpath:dataset.sql")
    @Test
    public void registrarUsuarioTest() {
    Usuario usuario = new Usuario("4564","cristhian  miranda ","cristhian@email.com","andres1805");
        try {
            usuarioServicio.registraUsuario(usuario);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
//Registrarse y loguearse
    @Sql("classpath:dataset.sql")
    @Test
    public void validarLogin() {

        try {
            usuarioServicio.validarLogin("pedro@email.com","palopero");
            System.out.println("Estas logeado");
        } catch (Exception e) {
            e.printStackTrace();
        }
        /* Usuario usuario = new Usuario();
        usuario.setEmail("pedro@email.com");
        usuario.setContraseña("palopero");
*/
        /*
        try {
            usuarioServicio.validarLogin(usuario.getEmail(),usuario.getContraseña());
            System.out.println("Estas logeado");
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
    }


    @Sql("classpath:dataset.sql")
    @Test
    public void listasReservas() {
        List<Reserva> reservas = usuarioServicio.listaReservas("456");
        reservas.forEach(System.out::println);
    }

    @Sql("classpath:dataset.sql")
    @Test
    public void obtenerListaHotel()
    {
        List<Hotel> hoteles = usuarioServicio.obtenerListaHoteles("2");

      hoteles.forEach(System.out::println);
    }


    @Sql("classpath:dataset.sql")
    @Test
    public void obtenerCiudad()
    {
        try {
            Ciudad ciudad = usuarioServicio.obtenerCiudad("Bogota");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    @Sql("classpath:dataset.sql")
    @Test
    public void obtenerHotel()
    {
       // Hotel hotel = null;
        try {
            Hotel hotel = usuarioServicio.obtenerHotel("Caverasna");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Sql("classpath:dataset.sql")
    @Test
    public void denunciarHotel()
    {
        try {
            usuarioServicio.denunciarHotel("1013125168","2","S");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Sql("classpath:dataset.sql")
    @Test
    public void comentarHotel()
    {
        try {
            usuarioServicio.comentarHotel("456","3","maso",2.6);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Sql("classpath:dataset.sql")
    @Test
    public void recuperarContrasena()
    {
      //  Usuario usuario = new Usuario("10115151","cristhianmiranda","cris@email.com","prueba");
/*
        try {
            usuarioServicio.registraUsuario(usuario);
        } catch (Exception e) {
            e.printStackTrace();
        }
         try {
            Usuario recuperado = usuarioServicio.recuperarContrasena(usuario.getEmail());
            System.out.println(recuperado.getContraseña());
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
        try {
            Usuario recuperado = usuarioServicio.recuperarContrasena("pedro@email.com");
            System.out.println(recuperado.getContraseña());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Sql("classpath:dataset.sql")
    @Test
    public void enviarCorreo()
    {
        boolean estado = emailService.enviarEmail("prueba","Este es un mensaje","cristhianmirandapro@gmail.com");
    }
/*
    @Sql("classpath:dataset.sql")
    @Test
    public void registrarUsuarioTest() throws Exception {
        Usuario usuario = new Usuario("1515","marcedsla","popids@email.com","lola212");
        usuarioServicio.registraUsuario(usuario);
    }*/
/*
    @Sql("classpath:dataset.sql")
    @Test
    public void nada() throws Exception {
    List<Usuario> u = usuarioServicio.listarUsuarios();
    System.out.println(u);
    }

    @Sql("classpath:dataset.sql")
    @Test
    public void eliminarUsuarioTest() throws Exception{
        Usuario u = new Usuario("1515","marcela","popi@email.com","lola12");
        usuarioServicio.eliminarUsuario(u.getCedula());

    }


    @Sql("classpath:dataset.sql")
    @Test
    public void registrarUsuarioTest() throws Exception {
        Usuario u = new Usuario("1515","marcela","popi@email.com","lola12");
       /* List<String> telfs = new ArrayList<>();
        telfs.add("751564");
        telfs.add("758552");

        u.setTelefono(telfs);*/
  //    Usuario guardado = usuarioServicio.registrarUsuario(u);
      /* try {
            Usuario guardado = usuarioServicio.registrarUsuario(u);
            System.out.println("hola");
            Assertions.assertNotNull(guardado);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}

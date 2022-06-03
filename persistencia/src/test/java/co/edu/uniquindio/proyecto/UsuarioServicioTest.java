package co.edu.uniquindio.proyecto;


import co.edu.uniquindio.proyecto.entidades.Usuario;
import co.edu.uniquindio.proyecto.servicios.UsuarioServicio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest
public class UsuarioServicioTest {

    @Autowired
    private UsuarioServicio usuarioServicio;

    @Sql("classpath:dataset.sql")
    @Test
    public void registrarUsuarioTest() {
    Usuario usuario = new Usuario("234","carlos","papo@email.com","perosq");
        try {
            usuarioServicio.registraUsuario(usuario);
        } catch (Exception e) {
            e.printStackTrace();
        }

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

package co.edu.uniquindio.proyecto;
import co.edu.uniquindio.proyecto.entidades.Reserva;
import co.edu.uniquindio.proyecto.entidades.Usuario;
import co.edu.uniquindio.proyecto.repositorios.UsuarioRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UsuarioTest {
    @Autowired
    private UsuarioRepo usuarioRepo;

    @Test
    public void registrarUsuarioTest(){
        Usuario u = new Usuario();
        u.setCedula("111");
        u.setNombre("Juanita");
        u.setEmail("juana@mail.com");
//Guardamos el registro
        Usuario guardado = usuarioRepo.save(u);
//Comprobamos que si haya quedado
        Assertions.assertNotNull(guardado);
    }
    @Sql("classpath:dataset.sql")
    @Test
    public void listarUsuariosTest(){
//Obtenemos la lista de todos los usuarios
        List<Usuario> usuarios= usuarioRepo.findAll();
//Imprimimos la lista
       // System.out.println("HOLAAAAAAAAAAAAA"+usuarios.toString());
        System.out.println(usuarios);
    }

    @Sql("classpath:dataset.sql")
    @Test
    public void ListaReservas()
    {
        List<Reserva> reservas = usuarioRepo.obtenerListaReservas("234");


        /* Cliente cliente = (Cliente) clienteRepo.obtenerListaReservas("pepe@email.com");*/
        System.out.println("holaaaaaaaaaaa");
        System.out.println(reservas);

    }
}
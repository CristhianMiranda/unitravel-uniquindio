package co.edu.uniquindio.proyecto;


import co.edu.uniquindio.proyecto.entidades.Cliente;
import co.edu.uniquindio.proyecto.repositorios.ClienteRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import javax.validation.constraints.Email;
import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)

public class ClienteTest {

    @Autowired
    private ClienteRepo clienteRepo;

    @Test
    public void registrar(){
        Cliente cliente = new Cliente("1010125168", "Paola Andrea Ruiz Londoño", "crishtianandres2001@gmail.com", "Andres1805") ;
        Cliente clienteGuardado = clienteRepo.save(cliente);
        Assertions.assertNotNull(clienteGuardado);
    }

    @Test
    public void eliminar()
    {
        Cliente cliente = new Cliente("1010125168", "Paola Andrea Ruiz Londoño", "crishtianandres2001@gmail.com", "Andres1805") ;
        Cliente clienteGuardado = clienteRepo.save(cliente);

        //Luego lo eliminamos
        clienteRepo.delete(clienteGuardado);

        //Por último, verificamos que si haya quedado borrado
        Cliente clienteBuscado = clienteRepo.findById("1010125168").orElse(null);

        Assertions.assertNull(clienteBuscado);

    }
    //@Sql("classpath:dataset.sql")
    @Test
    public void actualizar()
    {
        Cliente cliente = new Cliente("1010125168", "Paola Andrea Ruiz Londoño", "crishtianandres2001@gmail.com", "Andres1805") ;
        Cliente clienteGuardado = clienteRepo.save(cliente);


        clienteGuardado.setContraseña("lolotro");

        clienteRepo.save(clienteGuardado);


        //Por último, verificamos que si haya quedado borrado
        Cliente clienteBuscado = clienteRepo.findById("1010125168").orElse(null);

        Assertions.assertEquals("lolotro", clienteBuscado.getContraseña());

    }
    @Sql("classpath:clientes.sql")
    @Test
    public void listar()
    {

        List<Cliente> clientes = clienteRepo.findAll();
        System.out.println(clientes);
    }

}

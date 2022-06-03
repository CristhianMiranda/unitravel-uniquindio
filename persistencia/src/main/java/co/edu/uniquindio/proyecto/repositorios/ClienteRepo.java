package co.edu.uniquindio.proyecto.repositorios;
import co.edu.uniquindio.proyecto.entidades.Cliente;
import co.edu.uniquindio.proyecto.entidades.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ClienteRepo extends JpaRepository<Cliente, String> {
   /* @Query("select r from Cliente c, IN(c.reservas) r where c.email = :email ")
    List<Reserva> obtenerListaReservas(String email);

    */
}

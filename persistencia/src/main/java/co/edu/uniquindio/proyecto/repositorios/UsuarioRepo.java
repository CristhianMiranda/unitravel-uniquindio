package co.edu.uniquindio.proyecto.repositorios;
import co.edu.uniquindio.proyecto.entidades.Reserva;
import co.edu.uniquindio.proyecto.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, String> {


    @Query("select r from Usuario u, IN(u.reservas) r where u.cedula = :cedula ")
    List<Reserva> obtenerListaReservas(String cedula);
/*
    Optional<Usuario> findByCorreo(String email);



     Optional<Usuario> findByCorreoAndPassword(String email, String password);*/
  //  @Query("select from Hotel h,IN(h.co)")
}
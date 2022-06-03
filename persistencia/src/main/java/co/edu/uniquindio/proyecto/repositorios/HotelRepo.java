package co.edu.uniquindio.proyecto.repositorios;

import co.edu.uniquindio.proyecto.entidades.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface HotelRepo extends JpaRepository<Hotel, String> {
    @Query("select c.hoteles from Hotel h,IN(h.ciudad) c where h.ciudad.codigo = :ciudadCodigo")
    List<Hotel> obtenerListaHoteles(String ciudadCodigo);



}

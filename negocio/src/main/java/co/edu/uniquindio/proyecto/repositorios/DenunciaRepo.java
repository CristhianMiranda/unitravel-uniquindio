package co.edu.uniquindio.proyecto.repositorios;

import co.edu.uniquindio.proyecto.entidades.Denuncia;
import co.edu.uniquindio.proyecto.entidades.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DenunciaRepo extends JpaRepository<Denuncia, String> {

}

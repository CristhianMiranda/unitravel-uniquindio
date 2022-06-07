package co.edu.uniquindio.proyecto.repositorios;

import co.edu.uniquindio.proyecto.entidades.BancoPregunta;
import co.edu.uniquindio.proyecto.entidades.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface BancoPreguntaRepo extends JpaRepository<BancoPregunta, String> {
}

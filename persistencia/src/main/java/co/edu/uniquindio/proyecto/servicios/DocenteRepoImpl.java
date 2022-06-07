package co.edu.uniquindio.proyecto.servicios;

import co.edu.uniquindio.proyecto.entidades.*;
import co.edu.uniquindio.proyecto.repositorios.BancoPreguntaRepo;
import co.edu.uniquindio.proyecto.repositorios.ExamenRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DocenteRepoImpl implements DocenteServicio{
    private final ExamenRepo examenRepo;
    private final BancoPreguntaRepo bancoRepo;

    public DocenteRepoImpl(ExamenRepo examenRepo, BancoPreguntaRepo bancoRepo) {
        this.examenRepo = examenRepo;
        this.bancoRepo = bancoRepo;
    }

    @Override
    public Examen crearExamen(double calificacion) {
        Examen examen = new Examen(calificacion);
        examen.setFecha(LocalDate.now());

        return examenRepo.save(examen);
    }

    @Override
    public Examen adicionarPregunta(Tema tema,Pregunta pregunta) {
        Examen examen = new Examen();
        examen.setExamenPreguntas((List<ExamenPregunta>) tema.getBancoPregunta().getPregunta());
      //  examen.setTemaExamenes();
        return examenRepo.save(examen);
    }

    @Override
    public BancoPregunta anadirPreguntaBase(Pregunta pregunta) throws Exception {
        BancoPregunta bancoPregunta = new BancoPregunta();

        if(pregunta.getEstado()!=bancoPregunta.getEstado()) {
            throw  new Exception("No se puede añadir la pregunta a la base de datos esta en otro estado");
        }
        bancoPregunta.setPregunta(pregunta);
        return bancoRepo.save(bancoPregunta);

    }




}

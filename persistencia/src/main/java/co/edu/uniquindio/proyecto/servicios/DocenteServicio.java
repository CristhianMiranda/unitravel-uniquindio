package co.edu.uniquindio.proyecto.servicios;

import co.edu.uniquindio.proyecto.entidades.BancoPregunta;
import co.edu.uniquindio.proyecto.entidades.Examen;
import co.edu.uniquindio.proyecto.entidades.Pregunta;
import co.edu.uniquindio.proyecto.entidades.Tema;

public interface DocenteServicio {
    Examen crearExamen(double calificacion);
    Examen adicionarPregunta(Tema tema,Pregunta pregunta) throws Exception;
    BancoPregunta anadirPreguntaBase(Pregunta pregunta) throws Exception;
}

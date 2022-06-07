package co.edu.uniquindio.proyecto;

import co.edu.uniquindio.proyecto.entidades.Pregunta;
import co.edu.uniquindio.proyecto.servicios.DocenteServicio;
import co.edu.uniquindio.unitravel.servicios.UsuarioServicio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

@SpringBootTest
//@Transactional
public class DocenteServicioTest {

    @Autowired
    private DocenteServicio docenteServicio;

  //  @Sql("classpath:databaseprueba.sql")
    @Test
    public void crearExamen()
    {
        docenteServicio.crearExamen(0.5);
    }
    @Sql("classpath:dataset.sql")
    @Test
    public void anadirPreguntaABase ()
    {
        Pregunta pregunta = new Pregunta();
        pregunta.setEncabezado("1+1");
        pregunta.setEstado(0);
        try {
            docenteServicio.anadirPreguntaBase(pregunta);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

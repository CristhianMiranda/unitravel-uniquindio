package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
@Entity
public class Examen implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(length = 6)
    @EqualsAndHashCode.Include
    private int codigo;

    @Column(nullable = false)
    private LocalDate fecha;

    @Min(0)
    @Max(5)
    @Column(nullable = false)
    private double calificacion;



    public Examen(double calificacion) {
        this.calificacion = calificacion;
    }
    @OneToMany(mappedBy = "examen")
    private List<TemaExamen> temaExamenes;

    @OneToMany(mappedBy = "examen")
    private List<ExamenPregunta> examenPreguntas;

    @OneToMany(mappedBy = "examen")
    private List<EstudianteExamen> estudianteExamen;

    @OneToMany(mappedBy = "examen")
    private List<DocenteExamen> docenteExamen;


}

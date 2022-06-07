package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
@Entity
public class Pregunta implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(length = 6)
    @EqualsAndHashCode.Include
    private int codigo;

    @Column(nullable = true)
    private String encabezado;

    @Min(0)
    @Max(1)
    private int estado;

    @OneToMany(mappedBy = "pregunta")
    private List<ExamenPregunta> examenPreguntas;

    @OneToMany(mappedBy = "pregunta")
    private List<RespuestaPregunta> respuestaPreguntas;

    @OneToMany(mappedBy = "pregunta")
    private List<BancoPregunta> bancoPreguntas;

    @ManyToOne
    @JoinColumn(name = "codigoTipo",unique = false)
    private Tipo tipo;

}

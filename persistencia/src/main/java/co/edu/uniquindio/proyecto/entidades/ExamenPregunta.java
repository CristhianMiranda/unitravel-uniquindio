package co.edu.uniquindio.proyecto.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ExamenPregunta implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(length = 6)
    @EqualsAndHashCode.Include
    private int codigo;


    @ManyToOne
    @JoinColumn(name = "codigoExamen",unique = false)
    private Examen examen;

    @ManyToOne
    @JoinColumn(name = "codigoPregunta",unique = false)
    private Pregunta pregunta;
}

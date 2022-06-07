package co.edu.uniquindio.proyecto.entidades;

import co.edu.uniquindio.proyecto.entidades.*;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class DocenteExamen implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(length = 6)
    @EqualsAndHashCode.Include
    private int codigo;


    @ManyToOne
    @JoinColumn(name = "codigoExamen",unique = false)
    private Examen examen;

    @ManyToOne
    @JoinColumn(name = "codigoDocente",unique = false)
    private Docente docente;
}

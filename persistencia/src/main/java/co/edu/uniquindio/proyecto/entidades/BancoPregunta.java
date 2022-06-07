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
public class BancoPregunta implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(length = 6)
    @EqualsAndHashCode.Include
    private int codigo;

    @Min(0)
    @Max(1)
    @Column(nullable = false)
    private int estado;

/*
    @OneToMany(mappedBy = "tema")
    private List<Tema> temas;
*/
    @ManyToOne
    @JoinColumn(name = "codigoPregunta",unique = false)
    private Pregunta pregunta;

}

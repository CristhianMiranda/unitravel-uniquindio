package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
@Entity
public class Curso implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(length = 6)
    @EqualsAndHashCode.Include
    private int codigo;

    @OneToMany(mappedBy = "curso")
    private List<CursoEstudiante>cursoEstudiantes;

}

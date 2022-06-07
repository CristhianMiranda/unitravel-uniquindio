package co.edu.uniquindio.proyecto.entidades;

import co.edu.uniquindio.proyecto.entidades.*;
import co.edu.uniquindio.unitravel.entidades.ReservaHabitacion;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Tema implements Serializable {
    @ToString.Include
    @Id
    @EqualsAndHashCode.Include
    @Column(length = 10)
    private String codigo;

    //@ToString.Include
    @Column(length = 50,nullable = false)
    private String nombre;


    @OneToMany(mappedBy = "tema")
    private List<TemaExamen> temaExamen;

    @ManyToOne
    @JoinColumn(name = "codigoBancoPregunta",unique = false)
    private BancoPregunta bancoPregunta;
}

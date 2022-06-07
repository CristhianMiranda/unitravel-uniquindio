package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;
import java.util.List;


@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
@Entity
public class Docente implements Serializable {
    @ToString.Include
    @Id
    @EqualsAndHashCode.Include
    @Column(length = 10)
    private String cedula;

    //@ToString.Include
    @Column(length = 50,nullable = false)
    private String nombre;


   @ToString.Include
    @Email
    @Column(length = 30,nullable = false,unique = true)
    private String email;


    @ToString.Include
    @Column(length = 50,nullable = false)
    private String contraseña;


    @OneToMany(mappedBy = "docente")
    private List<DocenteExamen> docenteExamen;

}

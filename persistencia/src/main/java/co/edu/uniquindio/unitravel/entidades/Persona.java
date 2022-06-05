package co.edu.uniquindio.unitravel.entidades;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;


@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@ToString(onlyExplicitlyIncluded = true)
public class Persona implements Serializable {
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




}

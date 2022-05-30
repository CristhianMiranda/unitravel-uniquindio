package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import java.io.Serializable;
import java.util.Objects;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
public class Persona implements Serializable {
    @ToString.Include
    @Id
    @EqualsAndHashCode.Include
    @Column(length = 10)
    private String cedula;

    @ToString.Include
    @Column(length = 30)
    private String nombre;


    @ToString.Include
    @Email
    @Column(length = 30,nullable = false,unique = true)
    private String email;


    @ToString.Include
    @Column(length = 50,nullable = false)
    private String contraseña;




}

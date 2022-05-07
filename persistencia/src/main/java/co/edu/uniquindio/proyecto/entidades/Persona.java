package co.edu.uniquindio.proyecto.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
public class Persona implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @Column(length = 10)
    private String cedula;

    @Column(length = 30)
    private String nombre;

    @Email
    @Column(length = 30)
    private String email;
    @Column(length = 50)
    private String contraseña;



    public Persona(String cedula, String nombre, String email, String contraseña) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
    }

}

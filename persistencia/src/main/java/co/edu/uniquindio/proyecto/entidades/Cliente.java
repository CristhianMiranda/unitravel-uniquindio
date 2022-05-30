package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper=false)
//@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(callSuper = true, onlyExplicitlyIncluded = true)
public class Cliente extends Persona implements Serializable {
    @ToString.Include
    @ElementCollection
    private List<String> telefono;


    @OneToMany(mappedBy = "cliente")
    private List<Comentario> comentarios;

    @OneToMany(mappedBy = "cliente")
    private List<Punto> puntos;

    @ManyToOne
    @JoinColumn(name = "codigoCiudad",nullable = false)
    private Ciudad ciudad;
/*
    @ManyToOne
    @JoinColumn(name = "cedulaCliente",nullable = false)
    private Cliente cliente;
  */
    @OneToMany(mappedBy = "cliente")
    private List<Reserva> reservas;

    @OneToMany(mappedBy = "cliente")
    private List<Denuncia> denuncias;




    public Cliente(String cedula, String nombre, @Email String email, String contraseña) {
        super(cedula, nombre, email, contraseña);
    }
}

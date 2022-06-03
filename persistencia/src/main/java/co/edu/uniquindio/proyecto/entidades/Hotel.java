package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
public class Hotel {
    @Id
    @EqualsAndHashCode.Include
    @Column(length = 200)
    @ToString.Include
    private String codigo;
    @Column(length = 50)
    @ToString.Include
    private String nombre;

    @Column(length = 50)
    @ToString.Include
    private String direccion;

    @Column(length = 10,unique = true)
    @ToString.Include
    private String telefono;

    @Min(0)
    @Max(5)
    @ToString.Include
    private short numeroEstrellas;

    @OneToMany(mappedBy="hotel")
    private List<Denuncia> denuncia;


    @ManyToOne

    @JoinColumn(name = "cedulaAdministradorHotel",nullable = false)
    private AdministradorHotel administradorHotel;

    @OneToMany(mappedBy="hotel")
    private List<Comentario> comentarios;

    /*
    @ManyToOne
    private Comentario comentario;
*/
   // @JoinColumn(name = "codigoCiudad")
    @ManyToOne
    private Ciudad ciudad;

    @ManyToMany(mappedBy="hoteles")
    private List<Caracteristica> caracteristicas;

    @OneToMany(mappedBy="hotel")
    private List<Habitacion> habitacion;

    @OneToMany(mappedBy="hotel")
    private List<Foto> foto;

    public Hotel(String codigo, String nombre, String direccion, String telefono, short numeroEstrellas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.numeroEstrellas = numeroEstrellas;
    }
}

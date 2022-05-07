package co.edu.uniquindio.proyecto.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
public class Hotel {
    @Id
    @EqualsAndHashCode.Include
    @Column(length = 200)
    private String codigo;
    @Column(length = 50)
    private String nombre;

    @Column(length = 50)
    private String direccion;

    @Column(length = 10,unique = true)
    private String telefono;

    @Min(0)
    @Max(5)
    private short numeroEstrellas;

    @OneToMany(mappedBy="hotel")
    private List<Denuncia> denuncia;

    @ManyToOne
    private AdministradorHotel administradorHotel;

    @ManyToOne
    private Comentario comentario;

    @OneToMany(mappedBy="hotel")
    private List<Ciudad> ciudades;

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

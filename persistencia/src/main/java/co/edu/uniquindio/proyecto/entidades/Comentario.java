package co.edu.uniquindio.proyecto.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Comentario {
    @Id
    @EqualsAndHashCode.Include
    @Column(length = 6)
    private String codigo;

    @Column(nullable = false,length = 220)
    private String comentario;
    @Min(0)
    @Max(5)
    @Column(nullable = false)
    private double calificacion;

    @JoinColumn(name = "cedulaCliente")
    @ManyToOne
    private Cliente cliente;

    @JoinColumn(name = "codigoHotel",nullable = false)
    @ManyToOne
    private Hotel hotel;
    /*
    @OneToMany(mappedBy="comentario")
    private List<Hotel> hoteles;
    */
    @Column(nullable = false)
    private LocalDateTime fechaCalificacion;


    public Comentario(String codigo, String comentario, double calificacion, LocalDateTime fechaCalificacion) {
        this.codigo = codigo;
        this.comentario = comentario;
        this.calificacion = calificacion;
        this.fechaCalificacion = fechaCalificacion;
    }

}

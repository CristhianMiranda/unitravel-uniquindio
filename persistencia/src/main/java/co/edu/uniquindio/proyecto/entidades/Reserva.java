package co.edu.uniquindio.proyecto.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Positive;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Reserva implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @Column(length = 10)
    private String codigo;

    @Column(nullable = false)
    private LocalDateTime fechaReserva;

    @FutureOrPresent
    @Column(nullable = false)
    private LocalDate fechaInicio;
    @Future
    @Column(nullable = false)
    private LocalDate fechaFin;

    @Positive
    private float precioTotal;

    private boolean estado;

    private short cantidadPersonas;

    @ManyToOne
    private Cliente cliente;

    public Reserva(String codigo, LocalDateTime fechaReserva, LocalDate fechaInicio, LocalDate fechaFin, float precioTotal, boolean estado, short cantidadPersonas) {
        this.codigo = codigo;
        this.fechaReserva = fechaReserva;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioTotal = precioTotal;
        this.estado = estado;
        this.cantidadPersonas = cantidadPersonas;
    }

}

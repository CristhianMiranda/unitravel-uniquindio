package co.edu.uniquindio.proyecto.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ReservaHabitacion {

    @Id
    @EqualsAndHashCode.Include
    private int codigo;


    @Min(0)
    private double precio;

    @ManyToOne
    @JoinColumn(name = "codigoReserva",unique = false)
    private Reserva reserva;

    @ManyToOne
    @JoinColumn(name = "codigoHabitacion",unique = false)
    private Habitacion habitacion;
}

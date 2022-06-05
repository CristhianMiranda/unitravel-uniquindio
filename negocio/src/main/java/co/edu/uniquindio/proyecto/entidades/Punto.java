package co.edu.uniquindio.proyecto.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;
import java.util.Objects;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Punto implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @Min(0)
    private String cantidad;


    @ManyToOne
    private Cliente cliente;

    public Punto(String cantidad) {
        this.cantidad = cantidad;
    }

}

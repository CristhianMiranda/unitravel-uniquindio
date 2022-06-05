package co.edu.uniquindio.unitravel.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import java.io.Serializable;

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

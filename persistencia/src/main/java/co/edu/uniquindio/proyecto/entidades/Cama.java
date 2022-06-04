package co.edu.uniquindio.proyecto.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cama implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @Column(length = 2)
    private String codigo;

    @ManyToMany
    private List<Habitacion> habitaciones;

    private boolean tipo;

    public Cama(String codigo) {
        this.codigo = codigo;
    }



}

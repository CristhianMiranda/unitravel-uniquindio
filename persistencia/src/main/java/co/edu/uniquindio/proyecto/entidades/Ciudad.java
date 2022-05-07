package co.edu.uniquindio.proyecto.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Ciudad implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @Column(length = 150)
    private String codigo;

    @Column(nullable = false,length = 50)
    private String nombre;


    @ManyToOne
    private Hotel hotel;

    @OneToMany(mappedBy="ciudadDestino")
    private List<Vuelo> vuelosDestinos;

    @OneToMany(mappedBy="ciudadOrigen")
    private List<Vuelo> vuelosOrigenes;


    public Ciudad(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }


}

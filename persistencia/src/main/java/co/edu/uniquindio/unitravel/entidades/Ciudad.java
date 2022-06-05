package co.edu.uniquindio.unitravel.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Ciudad implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @Column(length = 150)
    private String codigo;

    @Column(nullable = false,length = 50)
    private String nombre;


    @OneToMany(mappedBy="ciudad")
    private List<Cliente> clientes;
/*
@OneToMany(mappedBy = "cliente")
    private List<Reserva> reservas;

*/
    @OneToMany(mappedBy="ciudad")
    private List<Hotel> hoteles;

    @OneToMany(mappedBy="ciudadDestino")
    private List<Vuelo> vuelosDestinos;

    @OneToMany(mappedBy="ciudadOrigen")
    private List<Vuelo> vuelosOrigenes;


    public Ciudad(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }


}

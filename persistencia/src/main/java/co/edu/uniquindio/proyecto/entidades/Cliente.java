package co.edu.uniquindio.proyecto.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cliente {
    @Id
    @EqualsAndHashCode.Include
    @Column(length = 10)
    private String cedula;

    @OneToMany(mappedBy = "cliente")
    private List<Comentario> comentarios;

    @OneToMany(mappedBy = "cliente")
    private List<Punto> puntos;

    @ManyToOne
    @JoinColumn(name = "codigoCiudad",nullable = false)
    private Ciudad ciudad;
/*
    @ManyToOne
    @JoinColumn(name = "cedulaCliente",nullable = false)
    private Cliente cliente;
  */
    @OneToMany(mappedBy = "cliente")
    private List<Reserva> reservas;

    @OneToMany(mappedBy = "cliente")
    private List<Denuncia> denuncias;

    public Cliente(String cedula) {
        this.cedula = cedula;
    }


}

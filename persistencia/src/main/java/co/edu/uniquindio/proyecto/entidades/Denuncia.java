package co.edu.uniquindio.proyecto.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Denuncia implements Serializable {
    @Id
    @Column(length = 6)
    @EqualsAndHashCode.Include
    private String codigo;

    @Column(nullable = false,length = 220)
    private String motivo;
    @Column(nullable = false,length = 220)
    private String mensaje;

    @JoinColumn(name = "cedulaCliente",nullable = false)
    @ManyToOne
    private Cliente cliente;

    @JoinColumn(name = "codigoHotel",nullable = false)
    @ManyToOne
    private Hotel hotel;


    public Denuncia(String codigo, String mensaje, String motivo) {
        this.codigo = codigo;
        this.mensaje = mensaje;
        this.motivo = motivo;
    }

}

package co.edu.uniquindio.proyecto.entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Denuncia {
    @Id
    @Column(length = 6)
    @EqualsAndHashCode.Include
    private String codigo;

    @Column(nullable = false,length = 220)
    private String mensaje;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Hotel hotel;


    public Denuncia(String codigo, String mensaje) {
        this.codigo = codigo;
        this.mensaje = mensaje;
    }

}

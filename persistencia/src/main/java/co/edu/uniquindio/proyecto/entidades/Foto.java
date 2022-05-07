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
public class Foto {
    @Id
    @EqualsAndHashCode.Include
    @Column(length = 10)
    private String codigo;
    @Column(nullable = false,unique = true)
    private String url;


    @ManyToOne
    private Hotel hotel;


    @ManyToOne
    private Habitacion habitacion;

    public Foto(String codigo, String url) {
        this.codigo = codigo;
        this.url = url;
    }


}

package co.edu.uniquindio.unitravel;
import co.edu.uniquindio.unitravel.entidades.Hotel;
import co.edu.uniquindio.unitravel.repositorios.HotelRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class HotelTest {

    @Autowired
    private HotelRepo hotelRepo;

//Listar todos los hoteles por cada destino
    @Sql("classpath:dataset.sql")
    @Test
    public void obtenerListaHotel()
    {
        List<Hotel> hoteles = hotelRepo.obtenerListaHoteles("1");
        System.out.println("holaaaaaaaaaaa");
       System.out.println(hoteles.get(0));
        System.out.println(hoteles.get(1));
        System.out.println(hoteles.get(2));
        System.out.println(hoteles.get(3));
        //hoteles.forEach(System.out::println);
    }


}

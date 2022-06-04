package co.edu.uniquindio.proyecto.servicios;


import co.edu.uniquindio.proyecto.entidades.Ciudad;
import co.edu.uniquindio.proyecto.entidades.Hotel;
import co.edu.uniquindio.proyecto.entidades.Reserva;
import co.edu.uniquindio.proyecto.entidades.Usuario;
import co.edu.uniquindio.proyecto.repositorios.CiudadRepo;
import co.edu.uniquindio.proyecto.repositorios.HotelRepo;
import co.edu.uniquindio.proyecto.repositorios.UsuarioRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServicioImpl implements UsuarioServicio{

    private final UsuarioRepo usuarioRepo;
    private final HotelRepo hotelRepo;

    private final CiudadRepo ciudadRepo;

    public UsuarioServicioImpl(UsuarioRepo usuarioRepo, HotelRepo hotelRepo, CiudadRepo ciudadRepo) {
        this.usuarioRepo = usuarioRepo;
        this.hotelRepo = hotelRepo;
        this.ciudadRepo = ciudadRepo;
    }

    @Override
    public Usuario registraUsuario(Usuario usuario) throws Exception {
        if(obtenerUsuario(usuario.getCedula())!=null)
        {
           throw new Exception("El usuario ya esta registraado");

        }
        if(obtenerCorreo(usuario.getEmail())!=null)
        {
            throw new Exception("El correo ya esta registraado");

        }

           return usuarioRepo.save(usuario);

    }

    @Override
    public Usuario validarLogin(String email, String password) throws Exception {
    Optional<Usuario> usuario = usuarioRepo.findByEmailAndContraseña(email,password);
    if(usuario.isEmpty())
    {
        throw new Exception("El correo y/o contraseña son incorrectos");
    }
    return usuario.get();
    }

    @Override
    public List<Reserva> listaReservas(String cedula) {
       // List<Reserva> reservas = listaReservas(cedula);


        return usuarioRepo.obtenerListaReservas(cedula);
    }

    @Override
    public List<Hotel> obtenerListaHoteles(String ciudadCodigo) {

        return hotelRepo.obtenerListaHoteles(ciudadCodigo);
    }

    @Override
    public Ciudad obtenerCiudad(String nombreCiudad) throws Exception {
        if(ciudadRepo.obtenerCiudad(nombreCiudad)==null)
        {
            throw new Exception("La ciudad no se encontro");
        }
        return ciudadRepo.obtenerCiudad(nombreCiudad);
    }

    @Override
    public Hotel obtenerHotel(String nombreHotel) throws Exception {
        //System.out.println(hotelRepo.obtenerHotel(nombreHotel).getNombre());
        if(hotelRepo.obtenerHotel(nombreHotel)==null)
        {
            throw new Exception("El hotel no se encontro");
        }
        return hotelRepo.obtenerHotel(nombreHotel);
    }

    @Override
    public Usuario recuperarContrasena(String email) throws Exception{
        if(usuarioRepo.recuperarContrasena(email)==null)
        {
            throw new Exception("El correo no se encontro asociada a ninguna cuenta");
        }

        return usuarioRepo.recuperarContrasena(email);
    }


    public Usuario obtenerCorreo(String email)
    {
        return usuarioRepo.findAllByEmail(email).orElse(null);
    }

    public Usuario obtenerEmail(String correo)

    {
        return usuarioRepo.obtenerEmail(correo);
    }
    @Override
    public Usuario obtenerUsuario(String cedula) {
        return usuarioRepo.findById(cedula).orElse(null);
    }






/*
    @Override
    public Usuario registrarUsuario(Usuario usuario) throws Exception {
        Usuario buscado = obtenerUsuario(usuario.getCedula());
        if(buscado!=null)
        {
            throw new Exception("El codigo del usuario ya está registrado");

        }
        Usuario usuarioEmail = buscarPorEmail(usuario.getEmail());
        if(usuarioEmail!=null)
        {
            throw new Exception("El email ya esta registrado");
        }

        return usuarioRepo.save(usuario);
    }

    public Usuario buscarPorEmail(String email){
        return usuarioRepo.findByCorreo(email).orElse(null);
    }

    @Override
    public Usuario actualizarUsuario(Usuario usuario) throws Exception {
        Usuario buscado = obtenerUsuario(usuario.getCedula());
        if (buscado==null)

        {
            throw new Exception("El usuario que quieres actualizar no existe");
        }
        return usuarioRepo.save(usuario);
    }

    @Override
    public Usuario loguearUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public Usuario obtenerUsuario(String codigo) {
        return usuarioRepo.findById(codigo).orElse(null);
    }

    @Override
    public void eliminarUsuario(String cedula) throws Exception {
        Usuario usuario = obtenerUsuario(cedula);
        if (usuario==null)

        {
            throw new Exception("El usuario que quieres eliminar no existe");
        }

    usuarioRepo.delete(usuario);
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioRepo.findAll();
    }

    @Override
    public Usuario validarLogin(String correo, String password) throws Exception {
        Optional<Usuario> usuario = usuarioRepo.findByCorreoAndPassword(correo,password);
        if(usuario.isEmpty())
        {
            throw new Exception("El correo y/o contraseña no coincide con ningun usuario");
        }

        return usuario.get();
    }

*/
}

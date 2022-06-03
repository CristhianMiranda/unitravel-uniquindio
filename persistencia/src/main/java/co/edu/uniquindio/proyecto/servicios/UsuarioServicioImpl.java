package co.edu.uniquindio.proyecto.servicios;


import co.edu.uniquindio.proyecto.entidades.Usuario;
import co.edu.uniquindio.proyecto.repositorios.UsuarioRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServicioImpl implements UsuarioServicio{

    private final UsuarioRepo usuarioRepo;

    public UsuarioServicioImpl(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
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
    public Usuario validadLogin(String email, String password) throws Exception {
    Optional<Usuario> usuario = usuarioRepo.findByEmailAndContraseña(email,password);
    if(usuario.isEmpty())
    {
        throw new Exception("El correo y/o contraseña son incorrectos");
    }
    return usuario.get();
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

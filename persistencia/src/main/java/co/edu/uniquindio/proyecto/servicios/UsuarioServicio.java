package co.edu.uniquindio.proyecto.servicios;

import co.edu.uniquindio.proyecto.entidades.*;

import java.util.List;


public interface UsuarioServicio {



    /**Registrarse
     * Metodo para registrar usuario
     * @param usuario usuario que se guardara
     * @return retorna usuario registrado
     * @throws Exception no se pudo registrar el usuario por datos ya existentes
     */
    Usuario registraUsuario(Usuario usuario) throws Exception;



    /**
     * Metodo para buscar el usuario por medio de la cedula
     *
     * @param cedula es la identificacion de un usuario
     * @return usuario buscado por cedula
     */
    Usuario obtenerUsuario(String cedula);



    /**loguearse
     * Metodo para validar credenciales de login
     * @param email es el correo de usuario
     * @param password es la contraseña  asociada a usuario
     * @return usuario validado
     * @throws Exception las credenciales son incorrectas
     */
    Usuario validarLogin(String email, String password) throws Exception;



    /**Listar sus propias reservas
     * Metodo para listar reservas de usuario
     * @param cedula es la identificacion de un usuario
     * @return lsita de reservas de usuario
     */
    List<Reserva> listaReservas(String cedula);


    /**Listar todos los hoteles por cada destino.
     * Metodo para lista de hoteles por codigo de ciudad
     * @param ciudadCodigo codigo de ciudad a buscar hoteles
     * @return lista de hoteles por ciudad
     */
    List<Hotel> obtenerListaHoteles(String ciudadCodigo);


    /**Buscar destinos
     * Metodo para obtener ciudad a partir del nombre de la ciudad
     * @param nombreCiudad representa el nombre de una ciudad
     * @return la ciudad dependiendo del nombre que se busca
     * @throws Exception No existe una ciudad con ese nombre
     */
    Ciudad obtenerCiudad(String nombreCiudad) throws Exception;

    /**Buscar hoteles
     * Metodo para obtener hotel a partir del nombre del hotel
     * @param nombreHotel representa el nombre de un hotel
     * @return el hotel dependiendo del nombre que se busca
     * @throws Exception No existe un hotel con ese nombre
     */
    Hotel obtenerHotel(String nombreHotel)  throws Exception;

    /**
     * Metodo para recuperar la contraseña de la cuenta de usuario con el correo
     * @param email correo de cuenta de usuario
     * @return contraseña de cuenta
     * @throws Exception no existe el correo asociada a ninguna cuenta
     */
    Usuario recuperarContrasena(String email) throws Exception;

    /**
     * Metodo para hacer una denuncia del usuario a el hotel
     * @param cedulaUsuario codigo de usuario que denunciara
     * @param codigoHotel   codigo de hotel denunciado
     * @param mensaje       mensaje de exposicion de denuncia
     * @return  una denuncia
     * @throws Exception    El mensaje es muy corto
     */
    Denuncia denunciarHotel(String cedulaUsuario,String codigoHotel,String mensaje) throws Exception;

    /**
     * Metodo para comentar hotel por usuario
     * @param cedulaUsuario codigo de usuario que comentara
     * @param codigoHotel codigo de hotel el cual se comentara
     * @param mensaje     mensaje de denuncia
     * @param calificacion calificacion del hotel
     * @return Comentario realizado
     * @throws Exception El mensajee es muy corto
     */
    Comentario comentarHotel(String cedulaUsuario,String codigoHotel,String mensaje,double calificacion) throws Exception;

    /**NOINOSNOSNOSNOS
     * Metodo para recuperar la contraseña de la cuenta de usuario con el correo
     * @param email correo de cuenta de usuario
     * @return contraseña de cuenta
     * @throws Exception no existe el correo asociada a ninguna cuenta
     */
    void recuperarContrasenaCorreo(String email) throws Exception;

  //  Reserva reserva()
    // Hotel obtenerHotelConCodigo(String codigoHotel)  throws Exception;

}

package co.edu.uniquindio.proyecto.servicios;

import co.edu.uniquindio.proyecto.entidades.Cliente;

public interface ClienteServicio {
    Cliente registrarUsuario(Cliente u) throws Exception;
    Cliente actualizarUsuario(Cliente u) throws Exception;
    Cliente obtenerCliente(String codigo);
    void eliminarUsuario(String cedula) throws Exception;

}

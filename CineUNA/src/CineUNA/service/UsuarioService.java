/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CineUNA.service;

import CineUNA.model.UsuarioDto;
import CineUNA.util.Request;
import CineUNA.util.Respuesta;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos Olivares
 */
public class UsuarioService {
    
    public Respuesta guardarUsuario(UsuarioDto usuario) {
        try {
            Request request = new Request("usuarioController/guardarUsuario");
            request.post(usuario);

            if (request.isError()) {
                return new Respuesta(false, request.getError(), "");
            }

            UsuarioDto usuarioDto = (UsuarioDto) request.readEntity(UsuarioDto.class);
            return new Respuesta(true, "", "", "Usuario", usuarioDto);
        } catch (Exception ex) {
            Logger.getLogger(UsuarioService.class.getName()).log(Level.SEVERE, "Error guardando al usuario.", ex);
            return new Respuesta(false, "Error guardando al usuario.", "guardarUsuario " + ex.getMessage());
        }
    }
}

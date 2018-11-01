/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CineUNA.service;

import CineUNA.model.CineDto;
import CineUNA.util.Request;
import CineUNA.util.Respuesta;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos Olivares
 */
public class CineService {

    public Respuesta getCine(Long id) {
        try {
            Map<String, Object> parametros = new HashMap<>();
            parametros.put("id", id);
            Request request = new Request("cineController/cine", "/{id}", parametros);
            request.get();

            if (request.isError()) {
                return new Respuesta(false, request.getError(), "");
            }

            CineDto empleado = (CineDto) request.readEntity(CineDto.class);
            return new Respuesta(true, "", "", "Cine", empleado);
        } catch (Exception ex) {
            Logger.getLogger(CineService.class.getName()).log(Level.SEVERE, "Error obteniendo el Cine [" + id + "]", ex);
            return new Respuesta(false, "Error obteniendo el cine.", "getCine " + ex.getMessage());
        }
    }

    public Respuesta guardarCine(CineDto cine) {
        try {
            Request request = new Request("cineController/guardarCine");
            request.post(cine);

            if (request.isError()) {
                return new Respuesta(false, request.getError(), "");
            }

            CineDto cineDto = (CineDto) request.readEntity(CineDto.class);
            return new Respuesta(true, "", "", "Cine", cineDto);
        } catch (Exception ex) {
            Logger.getLogger(CineService.class.getName()).log(Level.SEVERE, "Error guardando el Cine.", ex);
            return new Respuesta(false, "Error guardando el Cine.", "guardarCine " + ex.getMessage());
        }
    }

}

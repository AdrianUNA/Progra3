/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CineUNA.model;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Carlos Olivares
 */

@XmlRootElement( name= "CineDto" )
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class CineDto {
    private Long cineId;
    private Long cineTelefono;
    private String cineCorreo;
    private LocalTime cineHoraInicio;
    private LocalTime cineHoraCierre;
    private String cineNombre;
    private List<PeliculaDto> peliculasList;
    private List<ReporteDto> reportesList;
    private List<SalaDto> salasList;
    private List<UsuarioDto> usuariosList;
    

    public Long getCineId() {
        return cineId;
    }

    public void setCineId(Long cineId) {
        this.cineId = cineId;
    }

    public Long getCineTelefono() {
        return cineTelefono;
    }

    public void setCineTelefono(Long cineTelefono) {
        this.cineTelefono = cineTelefono;
    }

    public String getCineCorreo() {
        return cineCorreo;
    }

    public void setCineCorreo(String cineCorreo) {
        this.cineCorreo = cineCorreo;
    }

    public LocalTime getCineHoraInicio() {
        return cineHoraInicio;
    }

    public void setCineHoraInicio(LocalTime cineHoraInicio) {
        this.cineHoraInicio = cineHoraInicio;
    }

    public LocalTime getCineHoraCierre() {
        return cineHoraCierre;
    }

    public void setCineHoraCierre(LocalTime cineHoraCierre) {
        this.cineHoraCierre = cineHoraCierre;
    }

    public String getCineNombre() {
        return cineNombre;
    }

    public void setCineNombre(String cineNombre) {
        this.cineNombre = cineNombre;
    }

    public List<PeliculaDto> getPeliculasList() {
        return peliculasList;
    }

    public void setPeliculasList(List<PeliculaDto> peliculasList) {
        this.peliculasList = peliculasList;
    }

    public List<ReporteDto> getReportesList() {
        return reportesList;
    }

    public void setReportesList(List<ReporteDto> reportesList) {
        this.reportesList = reportesList;
    }

    public List<SalaDto> getSalasList() {
        return salasList;
    }

    public void setSalasList(List<SalaDto> salasList) {
        this.salasList = salasList;
    }

    public List<UsuarioDto> getUsuariosList() {
        return usuariosList;
    }

    public void setUsuariosList(List<UsuarioDto> usuariosList) {
        this.usuariosList = usuariosList;
    }
    
}


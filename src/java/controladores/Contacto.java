/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import utilidades.Formatos;

/**
 *
 * @author Sebastian
 */
@ManagedBean
@RequestScoped
public class Contacto {

    private String nombreEstudiante;
    private Long DNIEstudiante;

    /**
     * Creates a new instance of Contact
     */
    public Contacto() {

    }

    public String getSaludo() {
//        return "Hola " + this.nombreEstudiante + ", su DNI es: " + this.DNIEstudiante;
        return Formatos.getString("#{msg['app_m1']}")
                + this.nombreEstudiante
                + Formatos.getString("#{msg['app_m2']}")
                + this.DNIEstudiante;
    }

    /**
     * Get the value of nombreEstudiante
     *
     * @return the value of nombreEstudiante
     */
    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    /**
     * Set the value of nombreEstudiante
     *
     * @param nombreEstudiante new value of nombreEstudiante
     */
    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public Long getDNIEstudiante() {
        return DNIEstudiante;
    }

    public void setDNIEstudiante(Long DNIEstudiante) {
        this.DNIEstudiante = DNIEstudiante;
    }

}

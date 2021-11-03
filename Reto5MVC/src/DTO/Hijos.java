/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;
import java.util.Date;
/**
 *
 * @author EHT7557A
 */
public class Hijos {
      private int id;
      private String nombre;
      private Date fecha_nacimiento;
      private String genero;
      private Persona id_padre;

    public Hijos(int id, String nombre, Date fecha_nacimiento, String genero, Persona id_padre) {
        this.id = id;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.genero = genero;
        this.id_padre = id_padre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Persona getId_padre() {
        return id_padre;
    }

    public void setId_padre(Persona id_padre) {
        this.id_padre = id_padre;
    }   
        
}

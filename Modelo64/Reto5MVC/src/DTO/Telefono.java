/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author EHT7557A
 */
public class Telefono {
    private int numero;
    private Persona id_cliente;
    private String uso;

    public Telefono(int numero, Persona id_cliente, String uso) {
        this.numero = numero;
        this.id_cliente = id_cliente;
        this.uso = uso;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Persona getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Persona id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    
}

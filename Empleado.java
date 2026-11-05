/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.io.Serializable;

/**
 *
 * @author Home
 */

public class Empleado extends Persona {

    private double salarioBase;
    private double bono;

    //Sera el miembro estatico que nos ayudara a contar las instancia globales creadas
    public static int contadorEmpleados = 0;

    public Empleado(String id, String nombre, Direccion direccion, double salarioBase, double bono) {
        super(id, nombre, direccion);//llamada al contructor padre
        this.salarioBase = salarioBase;
        this.bono = bono;
        contadorEmpleados++;
    }

    @Override // sobre escritura
    public double calcularSalario() {
        return salarioBase + bono;
    }
}


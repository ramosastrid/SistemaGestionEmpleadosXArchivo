/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemagestionempleadosxarchivo;
import controlador.EmpleadoController;
import modelo.Empleado;
import java.util.ArrayList;

/**
 *
 * @author Home
 */
public class SistemaGestionEmpleadosXArchivo {

    public static void main(String[] args) {
        EmpleadoController controller = new EmpleadoController();
        
        //1 probar el registro de empleado
        boolean exito1 = controller.registrarEmpleado("EMPO1", "Alexander Maradiaga", "Tegucigalpa", "Col.Palmira",1500,2500);
        boolean exito2 = controller.registrarEmpleado("EMPO2","Maria Lope","San Pedro Sula","Barrio Guamilito",1800,3000);
        
        if(exito1 && exito2){
            System.out.println("Empleados guardados correctamente en empleado.txt!");
        }
        
        // 2 leer los datos persistidos en el archivo
        System.out.println("\n---Lista de Empleados en Archivo---");
        ArrayList<String> empleado =  controller.ListarEmpleados();
        for(String emp : empleado){
            System.out.println(emp);
        }
    }
}

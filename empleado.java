/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GetSet;

/**
 *
 * @author OHMASTER
 */
public class empleado {
    //atributos
    public String nombre;
    public String apellido;
    public int edad;

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public void setApellido (String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }
    
    public void setEdad (int edad) {
        this.edad = edad;
    }
    
    public empleado(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public void datos(){
        //hola pedro picapierda tienes 30 años
        System.out.println("Hola "+nombre+" "+apellido+ " tienes "+edad+" años.");
    }
    
}
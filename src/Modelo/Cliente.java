package Modelo;

import java.sql.Date;

/**
 *
 * @author IN1DM3B_15
 */
public class Cliente {
    
   //ATRIBUTOS
    private String dni;
    private String nombre;
    private String apellido;
    private String sexo;
    private String contraseña;
    private String fecha_nac;
    
   //CONSTRUCTORES
    public Cliente(){
    }
    
    public Cliente (String dni, String nombre, String apellido, String sexo, String contraseña,String fecha_nac){
    this.dni = dni;
    this.nombre = nombre;
    this.apellido = apellido;
    this.sexo = sexo;
    this.contraseña = contraseña;
    this.fecha_nac = fecha_nac;
}

    //GETTER
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    public String getFecha_nac() {
        return fecha_nac;
    }

    //SETTER
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public void setFecha_nac(String string) {
        this.fecha_nac = string;
    }

 
    
    
}
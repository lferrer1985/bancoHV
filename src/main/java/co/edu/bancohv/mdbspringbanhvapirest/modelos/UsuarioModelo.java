package co.edu.bancohv.mdbspringbanhvapirest.modelos;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("cliente") // me permite determinar como se va llamar la coleccion o tabla para que spring lo reconozca
public class UsuarioModelo {
    @Id    
    private String id; 
    private String nombre;
    private String apellido;
    private LocalDate fechaRegistro;
    private String email;
    private String clave;

    

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public UsuarioModelo() {
    }
    public UsuarioModelo(String id, String nombre, String apellido, LocalDate fechaRegistro) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaRegistro = fechaRegistro;
    }
    @Override
    public String toString() {
        return "UsuarioModelo [apellido=" + apellido + ", fechaRegistro=" + fechaRegistro + ", id=" + id + ", nombre="
                + nombre + "]";
    }   

}

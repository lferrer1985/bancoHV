package co.edu.bancohv.mdbspringbanhvapirest.modelos;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("usuarios") // me permite determinar como se va llamar la coleccion o tabla para que spring lo reconozca
public class UsuarioModelo {
    @Id    
    private String id; 
    private String numerodocumento;
    private String nombre;
    private String apellido;
    private LocalDate fechaRegistro;
    private String email;
    private String celular;
    private String clave;
    private DireccionModelo direccion;
    private List<UsuarioAcademiaModelo> academia;
    
    public List<UsuarioAcademiaModelo> getAcademia() {
        return academia;
    }
    public void setAcademia(List<UsuarioAcademiaModelo> academia) {
        this.academia = academia;
    }
    public DireccionModelo getDireccion() {
        return direccion;
    }
    public void setDireccion(DireccionModelo direccion) {
        this.direccion = direccion;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNumerodocumento() {
        return numerodocumento;
    }
    public void setNumerodocumento(String numerodocumento) {
        this.numerodocumento = numerodocumento;
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
    
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public UsuarioModelo() {
    }
        
    public UsuarioModelo(String id, List<UsuarioAcademiaModelo> academia) {
        this.id = id;
        this.academia = academia;
    }
    

}

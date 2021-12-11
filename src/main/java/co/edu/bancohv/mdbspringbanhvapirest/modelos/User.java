package co.edu.bancohv.mdbspringbanhvapirest.modelos;



import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("t_user")
public class User {
    @Id // Especificar ID
    private String id;    
    private String nombre;    
    private String clave;
    private ArrayList<UsuarioAcademiaModelo> academia;   

    public ArrayList<UsuarioAcademiaModelo> getAcademia() {
        return academia;
    }

    public void setAcademia(ArrayList<UsuarioAcademiaModelo> academia) {
        this.academia = academia;
    }

    public User() {
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

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    
    
    
}

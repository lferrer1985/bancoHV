package co.edu.bancohv.mdbspringbanhvapirest.modelos;

public class UsuarioAcademiaModelo {
    private String nivel;/** nivel de estudios */
    private String titulo;/** titulo obtenido */
    private String anio;/** año de finalizacion */
    private String estado; /** finalizado o en curso */

    public UsuarioAcademiaModelo(){        
    }
    

    public UsuarioAcademiaModelo(String nivel, String titulo, String anio, String estado) {
        this.nivel = nivel;
        this.titulo = titulo;
        this.anio = anio;
        this.estado = estado;
    }


    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}

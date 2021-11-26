package co.edu.bancohv.mdbspringbanhvapirest.modelos;

public class DireccionModelo {
    private String pais;
    private String departamento;
    private String ciudad;
    private String dirResidencia;
    public DireccionModelo() {
    }
    public DireccionModelo(String pais, String departamento, String ciudad, String dirResidencia) {
        this.pais = pais;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.dirResidencia = dirResidencia;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getDirResidencia() {
        return dirResidencia;
    }
    public void setDirResidencia(String dirResidencia) {
        this.dirResidencia = dirResidencia;
    }
        
}

package co.edu.bancohv.mdbspringbanhvapirest.controladores;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.bancohv.mdbspringbanhvapirest.modelos.UsuarioModelo;
import co.edu.bancohv.mdbspringbanhvapirest.servicios.UsuarioServicio;


@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})    
@RequestMapping("/api/usuario")
public class UsuarioControlador {
    @Autowired
    UsuarioServicio clienteServicio;    
    
    @GetMapping()
    public ArrayList<UsuarioModelo> obtenerUsuario(){
        return clienteServicio.obtenerUsuario();
    }   
    
    @PostMapping()    
    public UsuarioModelo guardarCliente(@RequestBody UsuarioModelo cliente){
        return clienteServicio.guardarUsuarioModelo(cliente);
    }

    @DeleteMapping(path = "{id}")
    public String eliminarClientePorId(@PathVariable("id") String id){
        if(clienteServicio.eliminarUsuario(id)){
            return "Eliminado el cliente con id: "+id;
        }else{
            return "Error eliminando el cliente";
        }
        
    }

    @GetMapping(path = "/nombre/{nombre}")
    public List<UsuarioModelo> clientePorNombre(@PathVariable("nombre") String nombre){
        return this.clienteServicio.obtenerClientePorNombre(nombre);
    }

    @GetMapping(path = "/apellido/{apellido}")
    public List<UsuarioModelo> ClientePorApellido(@PathVariable("apellido") String apellido){
        return clienteServicio.obtenerPorApellido(apellido);
    }
    
}

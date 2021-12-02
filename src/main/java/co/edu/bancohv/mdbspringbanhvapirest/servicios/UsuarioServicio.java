package co.edu.bancohv.mdbspringbanhvapirest.servicios;

import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import co.edu.bancohv.mdbspringbanhvapirest.modelos.UsuarioModelo;
import co.edu.bancohv.mdbspringbanhvapirest.repositorios.UsuarioRepository;
/*el servicio de va a comunicar con el repository
y el controlador con el servicio
*/
@Service
public class UsuarioServicio {
    @Autowired
    UsuarioRepository clienteRepository; // convierto la interfaz ClienteRepository en una variable
    
    public ArrayList <UsuarioModelo> obtenerUsuario(){
        return (ArrayList<UsuarioModelo>) clienteRepository.findAll();
    }

    public UsuarioModelo guardarUsuarioModelo(UsuarioModelo cliente){
        return clienteRepository.save(cliente);
    }

    public boolean eliminarUsuario(String id){
        if(clienteRepository.existsById(id)){
            clienteRepository.deleteById(id);
            return true;
        }else{
            return false;
        }

    }

    public List<UsuarioModelo> obtenerClientePorNombre(String nombre){
        return clienteRepository.findByNombre(nombre);
    }
    
    public List<UsuarioModelo> obtenerPorApellido(String apellido){
        return clienteRepository.BuscarPorApellido(apellido);
    }
    
}
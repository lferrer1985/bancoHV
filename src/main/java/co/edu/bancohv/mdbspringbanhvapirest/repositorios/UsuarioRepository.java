package co.edu.bancohv.mdbspringbanhvapirest.repositorios;

import java.util.List;



import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import co.edu.bancohv.mdbspringbanhvapirest.modelos.UsuarioModelo;

public interface UsuarioRepository extends MongoRepository<UsuarioModelo,String>{ // se le pasa el tipo de dato y el identificador
    
    List <UsuarioModelo> findByNombre(String nombre);
    
    @Query("{apellido:'?0'}")//El ?0 marcador de posición le permite sustituir el valor de los argumentos del método en la cadena de consulta JSON.
    List<UsuarioModelo> BuscarPorApellido(String apellido);

    
}

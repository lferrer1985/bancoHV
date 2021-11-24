package co.edu.bancohv.mdbspringbanhvapirest.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.bancohv.mdbspringbanhvapirest.modelos.UsuarioModelo;

public interface UsuarioRepository extends MongoRepository<UsuarioModelo,String>{ // se le pasa el tipo de dato y el identificador
    
}

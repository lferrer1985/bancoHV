package co.edu.bancohv.mdbspringbanhvapirest.controladores;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.bancohv.mdbspringbanhvapirest.modelos.User;
import co.edu.bancohv.mdbspringbanhvapirest.modelos.UsuarioAcademiaModelo;


@RestController
@RequestMapping("/user")
//@EnableSwagger2

public class UserController {
    @Autowired
    MongoTemplate mongoTemplate;

    /**
           * 1. Incrementar
     * @param user
     * @return
     */
    @PostMapping("/insert")
    public User insertUser(@RequestBody User user) {
        // Puedes usar guardar en su lugar
        mongoTemplate.insert(user);
        return user;
    }

    /**
           * 2. Verificar
     * @param id
     * @return
     */
    @GetMapping("/get/{id}")
    public User getUserById(@PathVariable String id) {
        return mongoTemplate.findById(id, User.class);
    }

    /**
           * 4. Cambiar
     * @param user
     * @return
     */
    @PutMapping("/update")
    public User updateUser(@RequestBody User user) {
        // ¡Se puede guardar o agregar!
        mongoTemplate.save(user);
        return user;
    }
    
    /**
           * 5. Todos
     * @return
     */
    @GetMapping("/get/all")
    public List<User> getAllUsers() {
        return mongoTemplate.findAll(User.class);
    }

    /*
    @PutMapping("/update/academia")
    public User updateUserAcademia(@RequestBody User user) {
        // ¡Se puede guardar o agregar!
        
        Query query = new Query();
        query.addCriteria(Criteria.where("nombre").is("royman"));
        Update update = new Update();
        update.set("clave", "hola");        
        
        return mongoTemplate.findAndModify(query, update, User.class);
    }*/

    @PutMapping("/update/academia/{id}/{nivel}/{titulo}/{anio}/{estado}")
    public User updateUserAcademia(@RequestBody User user, @PathVariable String id,@PathVariable String nivel,@PathVariable String titulo,@PathVariable String anio,@PathVariable String estado) {
        // ¡Se puede guardar o agregar!
        
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(id));
        Update update = new Update();              
        UsuarioAcademiaModelo ua = new UsuarioAcademiaModelo();
        ua.setNivel(nivel); ua.setTitulo(titulo); ua.setAnio(anio); ua.setEstado(estado);
        update.push("academia",ua);
        
        return mongoTemplate.findAndModify(query, update, User.class);
        
    }

}

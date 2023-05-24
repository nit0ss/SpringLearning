package com.cris.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cris.model.User;

@RestController
public class UserController {

	@GetMapping("/user")
	public String index(Model model) {
		User user = new User("John Doe", "john@example.com"); 
		model.addAttribute("user",user);
		return "index";
	}
	
	private List<User> userList = new ArrayList<>();
	
	
	
	
	 @PostMapping("/user")
	    public ResponseEntity<String> createUser(@RequestBody User user) {
	        // Lógica para crear un nuevo usuario utilizando los datos recibidos
	        // Por ejemplo, puedes validar los datos, asignar un ID, guardar en la base de datos, etc.

	        // Guardar el usuario en la base de datos
	        boolean createdUser = userList.add(user);

	        if (createdUser) {
	        	
	            // Devuelve una respuesta con el código de estado 201 (Created) y un mensaje
	            return ResponseEntity.status(HttpStatus.CREATED).body("Usuario creado exitosamente");
	        } else {
	            // Devuelve una respuesta con el código de estado 500 (Internal Server Error) si no se pudo crear el usuario
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("No se pudo crear el usuario");
	        }
	    
	        //return ResponseEntity.status(HttpStatus.CREATED).body("Usuario creado exitosamente");
	 }
	 
	 @GetMapping("/users")
	    public List<User> getAllUsers() {
	        // Devolver la lista de usuarios
	        return userList;
	    }
	 
	 
}

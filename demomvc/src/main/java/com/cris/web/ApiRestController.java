package com.cris.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cris.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api")
public class ApiRestController {

	@Autowired
	private ObjectMapper objectMapper; // ObjectMapper para convertir objetos a JSON

	@GetMapping("/usuario")
	public User getUsuario() {
		User user = new User("Mario La Manza", "mario@lamenza.es");
		return user;
	}

	@PostMapping("/user")
	public ResponseEntity<String> createUser(@RequestBody User user) {
		// Lógica para crear un nuevo usuario utilizando los datos recibidos
		// Puedes acceder a los atributos del objeto User (nombre, email, etc.) y
		// realizar las operaciones necesarias

		// Ejemplo de código para guardar el usuario en una base de datos o en una lista
		// en memoria
		// userRepository.save(user);

		// Devuelve una respuesta con el código de estado 201 (Created) para indicar que
		// el usuario se ha creado con éxito
		return ResponseEntity.status(HttpStatus.CREATED).body("Usuario creado exitosamente");

	}
}

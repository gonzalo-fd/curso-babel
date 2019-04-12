package es.babel.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.babel.modelo.entidades.Historia;
import es.babel.modelo.gestion.GestorHistoria;

@RestController()
public class ControladorHistoria {
	
	@Autowired
	GestorHistoria gh;
	
	@GetMapping(path="historia",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Historia> obtenerPelicula(
//			@PathVariable("nombre") String nombre, @PathVariable("mensaje") String mensaje){
			){
			Historia h = gh.getHistoria();
		return new ResponseEntity<>(h,HttpStatus.OK);
	}
}

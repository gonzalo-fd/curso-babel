package es.babel.modelo.gestion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.babel.modelo.entidades.Historia;
import es.babel.modelo.persistencia.DaoHistoria;

@Service
public class GestorHistoria {
	
	@Autowired
	DaoHistoria daoHistoria;
	
	public Historia getHistoria() {
		Historia h = daoHistoria.getHistoria();
		h.settexto(h.getNombre() + ": " + h.gettexto() + " y murio por feo");
		return h;
		}
}

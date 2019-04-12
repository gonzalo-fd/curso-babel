package es.babel.modelo.persistencia;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import es.babel.modelo.entidades.Historia;

@Repository
public class DaoHistoria {
	
	public Historia getHistoria() {
		RestTemplate restTemplate = new RestTemplate();
        Historia h = restTemplate.getForObject("http://172.10.5.25:8080/historia", Historia.class);
		return h;
	}
}

package entidades;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class Saludos {
	private List<String> listaSaludos = new ArrayList<>();

	public List<String> getListaSaludos() {
		return listaSaludos;
	}

	public void setListaSaludos(List<String> listaSaludos) {
		this.listaSaludos = listaSaludos;
	}

	@Override
	public String toString() {
		return "Saludos [listaSaludos=" + listaSaludos + "]";
	}
	
}

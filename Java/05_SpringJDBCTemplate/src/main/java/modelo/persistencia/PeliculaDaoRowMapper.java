package modelo.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import modelo.entidades.Pelicula;
//
//Para simplificar la conversion de un result set a objetos
//
@Component
public class PeliculaDaoRowMapper implements RowMapper<Pelicula>{

	public Pelicula mapRow(ResultSet rs, int rowNum) throws SQLException {
		Pelicula p = new Pelicula();
		p.setId(rs.getInt("id"));
		p.setTitulo(rs.getString("titulo"));
		p.setGenero(rs.getString("genero"));
		p.setDirector(rs.getString("director"));
		p.setAno(rs.getInt("ano"));
		return p;
	}

}

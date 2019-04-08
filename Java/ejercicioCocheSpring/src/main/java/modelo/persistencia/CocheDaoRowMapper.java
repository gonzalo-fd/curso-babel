package modelo.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import modelo.entidades.Coche;
//
//Para simplificar la conversion de un result set a objetos
//
@Component
public class CocheDaoRowMapper implements RowMapper<Coche>{

	public Coche mapRow(ResultSet rs, int rowNum) throws SQLException {
		Coche c = new Coche();
		c.setMarca(rs.getString("marca"));
		c.setMatricula(rs.getString("matricula"));
		c.setModelo(rs.getString("modelo"));
		return c;
	}

}

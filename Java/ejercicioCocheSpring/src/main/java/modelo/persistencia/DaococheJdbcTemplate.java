package modelo.persistencia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import modelo.entidades.Coche;
@Repository
public class DaococheJdbcTemplate implements DaoCoche{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private CocheDaoRowMapper rowMapper;
	
	public int insertar(Coche c) {
		String query = "insert into coches (marca,modelo,matricula) values (?,?,?)";
		return jdbcTemplate.update(query, c.getMarca(), c.getModelo(), c.getMatricula() );
	}

	public int modificar(Coche c) {
		String query = "update coches set marca=?, modelo=? where matricula=?";
		return jdbcTemplate.update(query, c.getMarca(), c.getModelo(), c.getMatricula());
	}
	public int borrar(String matricula) {
		String query = "delete from coches where matricula=?";
		return jdbcTemplate.update(query,matricula);
	}

	public Coche buscar(String matricula) {
		String query = "select * from coches where matricula=?";
		//queryForObject espera un resultado si recibe mas de uno salta excp
		Coche c = jdbcTemplate.queryForObject(query, rowMapper, matricula);
		return c;
	}

	public List<Coche> listar() {
		String query = "select * from coches";
		List<Coche>	lista = jdbcTemplate.query(query, rowMapper);
		return lista;
	}
}

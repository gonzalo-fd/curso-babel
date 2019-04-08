package modelo.persistencia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import modelo.entidades.Pelicula;
@Repository
public class DaoPeliculaJdbcTemplate implements DaoPelicula{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private PeliculaDaoRowMapper rowMapper;
	
	public int insertar(Pelicula p) {
		String query = "insert into peliculas (TITULO,DIRECTOR,GENERO,ano) values (?,?,?,?)";
		return jdbcTemplate.update(query, p.getTitulo(),p.getDirector(), p.getGenero(), p.getAno());
	}

	public int modificar(Pelicula p) {
		String query = "update peliculas set titulo=?, director=?, genero=?,ano=? where id=?";
		return jdbcTemplate.update(query, p.getTitulo(),p.getDirector(), p.getGenero(), p.getAno(), p.getId());
	}
	public int borrar(int id) {
		String query = "delete from peliculas where id=?";
		return jdbcTemplate.update(query,id);
	}

	public Pelicula buscar(int id) {
		String query = "select * from peliculas where id=?";
		//queryForObject espera un resultado si recibe mas de uno salta excp
		Pelicula p = jdbcTemplate.queryForObject(query, rowMapper, id);
		return p;
	}

	public List<Pelicula> listar() {
		String query = "select * from peliculas";
		List<Pelicula>	lista = jdbcTemplate.query(query, rowMapper);
		return lista;
	}
}

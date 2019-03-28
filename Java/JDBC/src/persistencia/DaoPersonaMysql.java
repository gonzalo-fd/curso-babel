package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.entidades.Persona;

public class DaoPersonaMysql implements DaoPersona {
	
	private Connection conexion;
	
	
	//cargar la clase de mysql para conectar con la bbdd
	//bloque estatico: ejecuta un codigo nada más arrancar el programa
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private boolean abrirConexion() {
		String url = "jdbc:mysql://localhost:3306/prueba?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String user = "root";
		String pw = "password";
		
		try {
			conexion = DriverManager.getConnection(url, user, pw);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	private boolean cerrarConexion() {
		try {
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	return true;
	}
	
	@Override
	public boolean alta(Persona p) {
		if(!abrirConexion())
			return false;
		boolean alta = true;
		String query = "insert into personas (nombre, edad, peso) values(?,?,?) ";
		
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setString(1, p.getNombre());
			ps.setInt(2, p.getEdad());
			ps.setDouble(3, p.getPeso());
			
			int numeroColumnasAfectadas = ps.executeUpdate();
			if(numeroColumnasAfectadas == 0)
				alta = false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			cerrarConexion();
		}
		
		return alta;
	}

	@Override
	public boolean eliminar(int id) {
		if(!abrirConexion())
			return false;
		boolean baja = true;
		String query = "delete from personas where id=?";
		
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setInt(1, id);
			
			int numeroColumnasAfectadas = ps.executeUpdate();
			if(numeroColumnasAfectadas == 0)
				baja = false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			cerrarConexion();
		}
		
		return baja;
	}

	@Override
	public boolean modificar(Persona p) {
		if(!abrirConexion())
			return false;
		boolean modificar = true;
		String query = "update personas set nombre = ?, edad = ?, peso = ? where id=?";
		
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setString(1, p.getNombre());
			ps.setInt(2, p.getEdad());
			ps.setDouble(3, p.getPeso());
			ps.setInt(4, p.getId());
			int numeroColumnasAfectadas = ps.executeUpdate();
			if(numeroColumnasAfectadas == 0)
				modificar = false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			cerrarConexion();
		}
		
		return modificar;
	}

	@Override
	public Persona get(int id) {
		if(!abrirConexion())
			return null;
		Persona p = null;
		String query = "select * from personas where id =?";
		
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				p = new Persona();
				p.setId(rs.getInt(1));
				p.setNombre(rs.getString(2));
				p.setEdad(rs.getInt(3));
				p.setPeso(rs.getDouble(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			cerrarConexion();
		}
		
		return p;
	}


	@Override
	public List<Persona> listar() {
		if(!abrirConexion())
			return null;
		List<Persona> l = null;
		Persona p = null;
		String query = "select id,nombre,edad,peso from personas";
		
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			l = new ArrayList<>();
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				p = new Persona();
				p.setId(rs.getInt(1));
				p.setNombre(rs.getString(2));
				p.setEdad(rs.getInt(3));
				p.setPeso(rs.getDouble(4));
				l.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			cerrarConexion();
		}
		
		return l;
	}

}

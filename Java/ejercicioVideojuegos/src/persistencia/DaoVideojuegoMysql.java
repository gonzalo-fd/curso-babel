package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.entidades.Videojuego;

public class DaoVideojuegoMysql implements DaoVideojuego {
	
	private Connection conexion;
	private static DaoVideojuegoMysql instancia = null;
	
	public static DaoVideojuegoMysql getInstance() {
		if(instancia ==  null){
			instancia = new DaoVideojuegoMysql();
		}
		return instancia;
	}
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	private boolean abrirConexion() {
		String url = "jdbc:mysql://localhost:3306/videojuegos?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
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
	public boolean alta(Videojuego v) {
		if(!abrirConexion())
			return false;
		boolean alta = true;
		String query = "insert into videojuegos (nombre, compañia, valoracion, precio) values(?,?,?,?) ";
		
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setString(1, v.getNombre());
			ps.setString(2, v.getCompañia());
			ps.setInt(3, v.getValoracion());
			ps.setDouble(4, v.getPrecio());
					
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
		String query = "delete from videojuegos where id=?";
		
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
	public boolean modificar(Videojuego v) {
		if(!abrirConexion())
			return false;
		boolean modificar = true;
		String query = "update videojuegos set nombre = ?, compañia = ?, valoracion = ?, precio = ? where id=?";
		
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setString(1, v.getNombre());
			ps.setString(2, v.getCompañia());
			ps.setInt(3, v.getValoracion());
			ps.setDouble(4, v.getPrecio());
			ps.setInt(5, v.getId());
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
	public Videojuego buscarId(int id) {
		if(!abrirConexion())
			return null;
		Videojuego v = null;
		String query = "select * from videojuegos where id=?";
		
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				v = new Videojuego();
				v.setId(rs.getInt(1));
				v.setNombre(rs.getString(2));
				v.setCompañia(rs.getString(3));
				v.setValoracion(rs.getInt(4));
				v.setPrecio(rs.getDouble(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			cerrarConexion();
		}
		
		return v;
	}

	@Override
	public Videojuego buscarNombre(String nombre) {
		if(!abrirConexion())
			return null;
		Videojuego v = null;
		String query = "select * from videojuegos where nombre=?";
		
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			ps.setString(1, nombre);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				v = new Videojuego();
				v.setId(rs.getInt(1));
				v.setNombre(rs.getString(2));
				v.setCompañia(rs.getString(3));
				v.setValoracion(rs.getInt(4));
				v.setPrecio(rs.getDouble(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			cerrarConexion();
		}
		
		return v;
	}



	@Override
	public List<Videojuego> listar() {
		if(!abrirConexion())
			return null;
		List<Videojuego> l = null;
		Videojuego v = null;
		String query = "select * from videojuegos";
		
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			l = new ArrayList<>();
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				v = new Videojuego();
				v.setId(rs.getInt(1));
				v.setNombre(rs.getString(2));
				v.setCompañia(rs.getString(3));
				v.setValoracion(rs.getInt(4));
				v.setPrecio(rs.getDouble(5));
				l.add(v);
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

	@Override
	public int valoraciones() {
		if(!abrirConexion())
			return -1;
		int valoraciones = -1;
		String query = "select avg(valoracion) from videojuegos";
		
		try {
			PreparedStatement ps = conexion.prepareStatement(query);		
					
			ResultSet rs = ps.executeQuery();
			if(rs.next())
				valoraciones = rs.getInt(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			cerrarConexion();
		}
		return valoraciones;
	}

	@Override
	public double precio() {
		if(!abrirConexion())
			return -1;
		double precio = -1;
		String query = "select avg(precio) from videojuegos ";
		
		try {
			PreparedStatement ps = conexion.prepareStatement(query);		
					
			ResultSet rs = ps.executeQuery();
			if(rs.next())
				precio = rs.getDouble(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			cerrarConexion();
		}
		return precio;
	}	
}

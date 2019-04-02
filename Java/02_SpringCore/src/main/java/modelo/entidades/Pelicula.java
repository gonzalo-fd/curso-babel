package modelo.entidades;

public class Pelicula {
	private int id;
	private String titulo;
	private String genero;
	private int year;
	
	public Pelicula() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", titulo=" + titulo + ", genero=" + genero + ", year=" + year + ", director="
				+ director + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	public Pelicula(int id, String titulo, String genero, int year, Director director) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.genero = genero;
		this.year = year;
		this.director = director;
	}
	private Director director;
}

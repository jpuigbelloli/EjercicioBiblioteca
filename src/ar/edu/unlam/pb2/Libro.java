package ar.edu.unlam.pb2;

public abstract class Libro {

	private Integer codigo;
	private String autor;
	private String nombre;
	
	public Libro(Integer codigo, String autor, String nombre) {
		this.codigo = codigo;
		this.autor = autor;
		this.nombre = nombre;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getAutor() {
		return autor;
	}

	public String getNombre() {
		return nombre;
	}

	public String fotocopiar() {
		return "";
	}
	
	
	
	
}

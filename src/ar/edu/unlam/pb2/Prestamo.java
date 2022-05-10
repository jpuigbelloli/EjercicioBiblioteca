package ar.edu.unlam.pb2;

public class Prestamo {
	
	private Integer id;
	private Estudiante estudiante;
	private Libro libro;
	
	public Prestamo(Integer id, Estudiante estudiante, Libro libro) {
		this.id = id;
		this.estudiante = estudiante;
		this.libro = libro;
	}

	public Integer getId() {
		return id;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public Libro getLibro() {
		return libro;
	}
	
	public Prestamo getPrestamoPorLibro(Libro libro){
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prestamo other = (Prestamo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	

}

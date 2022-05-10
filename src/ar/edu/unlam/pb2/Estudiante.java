package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;

public class Estudiante {

	private Integer dni;
	private String nombre;
	private String apellido;
	private Set<Prestamo> prestamos;
	
	
	public Estudiante(Integer dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.prestamos= new HashSet<Prestamo>();
		
	}

	public Integer getCantidadDeLibrosPrestados() {
		return prestamos.size();
	}
	
	public void getPrestamo(Prestamo prestamo) {
		prestamos.add(prestamo);
	}
		
	public Libro devolverPrestamo(Integer libro) {		
		Libro prestamoADevolver = buscarLibroPorId(libro);
		prestamos.remove(buscarPrestamoPorLibro(buscarLibroPorId(libro)));		
		return prestamoADevolver;
	}
	
	public Prestamo buscarPrestamoPorLibro(Libro libro) {
		Prestamo prestamoNull = null;
		for(Prestamo prestamoBuscado: prestamos) {
			if(prestamoBuscado.getLibro().equals(libro))
				return prestamoBuscado;
		}return prestamoNull;
	}
	
	public Libro buscarLibroPorId(Integer id) {
		Libro libroEncontrado = null;
		for(Prestamo libroBuscado :prestamos) {
			if(libroBuscado.getId().equals(id)) {
				libroEncontrado = libroBuscado.getLibro();
			}
		}
		return libroEncontrado;
	}
	
	
	
	
}

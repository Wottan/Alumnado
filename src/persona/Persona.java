package persona;

import javax.persistence.*;

import org.openxava.model.*;

@MappedSuperclass
public class Persona extends Identifiable {

	private Long dni;

	private String nombre;

	private String apellido;

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}

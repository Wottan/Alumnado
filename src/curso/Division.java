package curso;

import javax.persistence.*;

import org.openxava.model.*;

@Entity
public class Division extends Identifiable {

	private String descripcion;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}

package periodoLectivo;

import javax.persistence.*;

import org.openxava.model.*;

@Entity
public class PeriodoLectivo extends Identifiable {

	private int anio;

	private String descripcion;

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}

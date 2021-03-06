package orientacion;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

@Entity
public class AnioOrientacion extends Identifiable {

	@Required
	private int anio;

	@ManyToOne
	private Orientacion orientacion;

	@ElementCollection
	@ListProperties("materia.id,materia.descripcion,horasCatedra,formacion")
	private List<MateriaPorAnio> materias;

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public List<MateriaPorAnio> getMaterias() {
		return materias;
	}

	public void setMaterias(List<MateriaPorAnio> materias) {
		this.materias = materias;
	}

	public Orientacion getOrientacion() {
		return orientacion;
	}

	public void setOrientacion(Orientacion orientacion) {
		this.orientacion = orientacion;
	}
}

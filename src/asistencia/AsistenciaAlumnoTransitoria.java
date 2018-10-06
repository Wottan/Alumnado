package asistencia;

import javax.persistence.*;

import org.openxava.annotations.*;

import alumno.*;
import asistencia.control.*;

@Embeddable
public class AsistenciaAlumnoTransitoria {

	// @OnChange(AlCambiarPresente.class)
	private boolean presente;

	@ManyToOne
	private Alumno alumno;

	public boolean isPresente() {
		return presente;
	}

	public void setPresente(boolean presente) {
		this.presente = presente;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	@Stereotype("ETIQUETA")
	public Boolean getEstuvoPresente() {
		return this.presente;
	}
}

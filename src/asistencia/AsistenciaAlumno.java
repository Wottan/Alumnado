package asistencia;

import javax.persistence.*;

import org.openxava.annotations.*;

import alumno.*;
import asistencia.control.*;

@Embeddable
public class AsistenciaAlumno {

	private boolean presente;

	@ManyToOne
	private Alumno alumno;

	public AsistenciaAlumno() {
		super();
	}

	public AsistenciaAlumno(boolean presente, Alumno alumno) {
		super();
		this.presente = presente;
		this.alumno = alumno;
	}

	public Boolean getPresente() {
		return presente;
	}

	public void setPresente(Boolean presente) {
		this.presente = presente;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

}

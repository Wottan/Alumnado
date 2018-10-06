package cursado;

import javax.persistence.*;

import org.openxava.model.*;

import alumno.*;
import curso.*;

@Entity
public class Cursado extends Identifiable {

	@ManyToOne
	private Curso curso;

	@ManyToOne
	private Alumno alumno;

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

}

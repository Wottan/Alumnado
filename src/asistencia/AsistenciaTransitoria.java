package asistencia;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import asistencia.control.*;
import curso.*;

@Views({ @View(members = "fecha;curso;asistencias") })
public class AsistenciaTransitoria {

	private Date fecha;

	@NoCreate
	@NoModify
	@ManyToOne
	@ReferenceView("Simple")
	@OnChange(AlCambiarCurso.class)
	private Curso curso;

	@EditOnly
	@ElementCollection
	@CollectionTable(name = "Asistencia")
	@ListProperties(value = "alumno.id,alumno.documento,alumno.nombreYApellido,presente")
	private List<AsistenciaAlumnoTransitoria> asistencias;

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public List<AsistenciaAlumnoTransitoria> getAsistencias() {
		return asistencias;
	}

	public void setAsistencias(List<AsistenciaAlumnoTransitoria> asistencias) {
		this.asistencias = asistencias;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}

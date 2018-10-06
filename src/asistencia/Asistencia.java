package asistencia;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

import asistencia.control.*;
import curso.*;

@Entity
@Tabs({})
@Views({ @View(name = "Detalle", members = "fecha;curso;asistencias") })
public class Asistencia extends Identifiable {

	private Date fecha;

	@NoCreate
	@NoModify
	@NoSearch(forViews = "Detalle")
	@ReadOnly(forViews = "Detalle")
	@ManyToOne
	@ReferenceView("Simple")
	@OnChange(AlCambiarCurso.class)
	private Curso curso;

	@EditOnly
	@ElementCollection
	// @CollectionTable(name = "Asistencia")
	@ListProperties(value = "alumno.id,alumno.documento,alumno.nombreYApellido,presente")
	private List<AsistenciaAlumno> asistencias;

	public Asistencia() {
		super();
	}

	public Asistencia(Date fecha, Curso curso, List<AsistenciaAlumno> asistencias) {
		super();
		this.fecha = fecha;
		this.curso = curso;
		this.asistencias = asistencias;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public List<AsistenciaAlumno> getAsistencias() {
		return asistencias;
	}

	public void setAsistencias(List<AsistenciaAlumno> asistencias) {
		this.asistencias = asistencias;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}

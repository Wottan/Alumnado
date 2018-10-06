package curso;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

import cursado.*;
import orientacion.*;
import periodoLectivo.*;

@Entity
@Tabs({})
@Views({ @View(name = "Simple", members = "division") })

public class Curso extends Identifiable {

	@ManyToOne
	@NoFrame
	private Division division;

	@ManyToOne
	private AnioOrientacion anio;

	@ManyToOne
	private PeriodoLectivo periodoLectivo;

	@OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
	private List<Cursado> cursados;

	public Division getDivision() {
		return division;
	}

	public void setDivision(Division division) {
		this.division = division;
	}

	public AnioOrientacion getAnio() {
		return anio;
	}

	public void setAnio(AnioOrientacion anio) {
		this.anio = anio;
	}

	public PeriodoLectivo getPeriodoLectivo() {
		return periodoLectivo;
	}

	public void setPeriodoLectivo(PeriodoLectivo periodoLectivo) {
		this.periodoLectivo = periodoLectivo;
	}

	public List<Cursado> getCursados() {
		return cursados;
	}

	public void setCursados(List<Cursado> cursados) {
		this.cursados = cursados;
	}

}

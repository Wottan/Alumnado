package asistencia.control;

import java.util.*;

import org.openxava.actions.*;
import org.openxava.jpa.*;
import org.openxava.model.*;

import alumno.*;
import asistencia.*;
import curso.*;
import util.*;

public class AsistenciasTransitoriasGuardar_action extends ViewBaseAction {

	@Override
	public void execute() throws Exception {
		// TODO Auto-generated method stub
		Map curso = (Map) getView().getValue("curso");
		if (curso.get("id").equals("")) {
			addWarning("Agregue el curso ", 1);
			return;
		}

		Curso cursoaPersistir = (Curso) MapFacade.findEntity("Curso", curso);
		System.out.println(cursoaPersistir.getDivision().getDescripcion());
		Date fecha = (Date) getView().getValue("fecha");
		Asistencia asistencia;
		Boolean presente;
		Alumno alumno;
		String idAlumno;
		Collection asistencias = (Collection) getView().getValue("asistencias");
		System.out.println(asistencias);
		List<AsistenciaAlumno> asistenciasAlumnos = new ArrayList<AsistenciaAlumno>();

		for (Object object : asistencias) {
			Map asistenciaMap = (Map) object;
			Map alumnoMap = (Map) asistenciaMap.get("alumno");
			Map idAlumnoMap = new HashMap();
			idAlumno = (String) alumnoMap.get("id");
			idAlumnoMap.put("id", idAlumno);
			alumno = (Alumno) MapFacade.findEntity("Alumno", idAlumnoMap);
			System.out.println(alumno.getNombreYApellido());
			presente = Util.notNulBoolean((Boolean) asistenciaMap.get("presente"));
			System.out.println(presente);
			asistenciasAlumnos.add(new AsistenciaAlumno(presente, alumno));
//			asistencia = devolverAsistenciaPorAlumno(alumno);
//			if (asistencia != null) {
//				asistencia.setPresente(presente);
//			} else {
//				XPersistence.getManager().persist(new Asistencia(fecha, presente, alumno));
//			}
		}
		XPersistence.getManager().persist(new Asistencia(fecha, cursoaPersistir, asistenciasAlumnos));
		getView().setValue("curso", null);
		getView().setValue("curso.division", null);
		getView().setValue("asistencias", null);
		getView().refreshCollections();
		addMessage("Asistencia Generada Correctamente", 1);

	}

}

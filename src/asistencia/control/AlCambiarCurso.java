package asistencia.control;

import java.util.*;

import org.openxava.actions.*;
import org.openxava.model.*;

import asistencia.*;
import cursado.*;
import curso.*;

public class AlCambiarCurso extends OnChangePropertyBaseAction {

	@Override
	public void execute() throws Exception {
		String valor = (String) getNewValue(); // 2
		if (valor == null)
			return;
		System.out.println(valor);
		Boolean presente = null;
		Asistencia asistencia;
		Map clave = new HashMap();
		clave.put("id", valor);
		Curso curso = (Curso) MapFacade.findEntity("Curso", clave);
		System.out.println(curso.getId());
		System.out.println(curso.getCursados().size());
		Collection cur = new ArrayList();
		for (Cursado cursado : curso.getCursados()) {
			Map cursados = new HashMap();
			Map alumnoMap = new HashMap();
			alumnoMap.put("id", cursado.getAlumno().getId());
			alumnoMap.put("documento", cursado.getAlumno().getDocumento());
			alumnoMap.put("nombreYApellido", cursado.getAlumno().getNombreYApellido());

			cursados.put("alumno", alumnoMap);
			cur.add(cursados);

		}

		getView().setValue("asistencias", cur);
//		asistencia.setAsistencias(asistencias);
//		getView().setModel(asistencia);
//		getView().getSubview("asistencias").setCollectionEditable(false);

	}

}

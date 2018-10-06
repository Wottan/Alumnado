package asistencia.control;

import java.util.*;

import org.openxava.actions.*;
import org.openxava.model.*;

import asistencia.*;

public class AsistenciaAlumnoGuardar_action extends SaveAction {

	@Override
	public void execute() throws Exception {

		// List<AsistenciaAlumno> asistencias = (List)
		// getView().getValue("asistencias");
		Collection asistencias = (Collection) getView().getValue("asistencias");
		System.out.println(asistencias);
//		// Codigo para persistir suspendida
//		AsistenciaGenerada asistenciaGenerada;
//		Boolean suspendida;
//		Boolean cargado;
//		Map codigoAsistenciaGenerada = new HashMap();
//		codigoAsistenciaGenerada.put("codigo", Long.parseLong(getView().getValue("codigo").toString()));
//		asistenciaGenerada = (AsistenciaGenerada) MapFacade.findEntity("AsistenciaGenerada", codigoAsistenciaGenerada);
//		suspendida = (Boolean) getView().getValue("suspendida");
//		cargado = (Boolean) getView().getValue("cargado");
//		asistenciaGenerada.setSuspendida(suspendida);
//		asistenciaGenerada.setCargado(cargado);
		// ------
		Boolean presente;
		for (Object object : asistencias) {

			// Cada objecto de la coleccion es un HashMap
			Map mapAsistencia = (Map) object;
			System.out.println(mapAsistencia);
			// Recupero el codigo de AsistenciaAlumno
			Map codigo = new HashMap();
			codigo.put("codigo", mapAsistencia.get("id"));
			presente = (Boolean) mapAsistencia.get("presente");
			System.out.println(presente);
			// Recupero el objeto AsistenciaAlumno con el codigo anterior
			if (mapAsistencia.containsKey("id")) {
				AsistenciaAlumno asistenciaAlumno = (AsistenciaAlumno) MapFacade.findEntity("AsistenciaAlumno", codigo);
				if (mapAsistencia.containsKey("presente")) {
					asistenciaAlumno.setPresente(true);
				} else {
					asistenciaAlumno.setPresente(false);
				}
			}
			// Seteo la hora marcada
//			asistenciaAlumno.setHora((Time) mapAsistencia.get("horaMarcada"));

			// Si presente se encuentra en la coleccion 'asistencias' seteo el
			// Presente de AsistenciaAlumno como verdadero(true)
			// Sino False

		}

		// Pasa a modo Lista
//		setNextMode(LIST);
//		// getView().setModel(new AsistenciaGenerada());
//		addMessage("Proceso terminado correctamente", 1);
		 super.execute();
	}
}

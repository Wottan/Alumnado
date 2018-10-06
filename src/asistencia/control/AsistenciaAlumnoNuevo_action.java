package asistencia.control;

import java.util.*;

import org.openxava.actions.*;

public class AsistenciaAlumnoNuevo_action extends ViewBaseAction {

	@Override
	public void execute() throws Exception {
		// TODO Auto-generated method stub
		try {

			showNewView();
			getView().setModelName("AsistenciaTransitoria");
//			getView().setViewName("Completa");
			getView().setValue("fecha", new Date());
			setControllers("AsistenciaTransitoriaControl");
		} catch (Exception ex) {
			ex.printStackTrace();
			addError("system_error");
		}
	}
}

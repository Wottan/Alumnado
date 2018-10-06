package asistencia.control;

import org.openxava.actions.*;

public class AsistenciasTransitoriasVolver_action extends ViewBaseAction {

	@Override
	public void execute() throws Exception {
		returnToPreviousControllers();
		setNextMode(LIST);
	}

}

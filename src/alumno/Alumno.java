package alumno;

import javax.persistence.*;

import org.openxava.annotations.*;

import persona.*;

@Entity
public class Alumno extends Persona {

	@Stereotype("ETIQUETA")
	public Long getDocumento() {
		return getDni();
	}

	@Stereotype("ETIQUETA")
	public String getNombreYApellido() {
		return getNombre() + " " + getApellido();
	}

	@Override
	@Stereotype("ETIQUETA")
	public String getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

}

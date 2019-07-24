package co.dostf.dto.wrapper;

import co.cifin.confrontaultra.dto.ultra.ParametrosSeguridadULTRADTO;
import co.cifin.confrontaultra.dto.ultra.ParametrosULTRADTO;

public class CuestionarioDtoWrapper {

	private ParametrosULTRADTO parametrosULTRA;
	private ParametrosSeguridadULTRADTO parametrosSeguridadULTRA;

	public ParametrosULTRADTO getParametrosULTRA() {
		return parametrosULTRA;
	}

	public void setParametrosULTRA(ParametrosULTRADTO parametrosULTRA) {
		this.parametrosULTRA = parametrosULTRA;
	}

	public ParametrosSeguridadULTRADTO getParametrosSeguridadULTRA() {
		return parametrosSeguridadULTRA;
	}

	public void setParametrosSeguridadULTRA(ParametrosSeguridadULTRADTO parametrosSeguridadULTRA) {
		this.parametrosSeguridadULTRA = parametrosSeguridadULTRA;
	}

}

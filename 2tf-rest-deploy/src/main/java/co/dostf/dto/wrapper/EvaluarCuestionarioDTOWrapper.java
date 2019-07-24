package co.dostf.dto.wrapper;

import co.cifin.confrontaultra.dto.ultra.ParametrosSeguridadULTRADTO;
import co.cifin.confrontaultra.dto.ultras.RespuestaCuestionarioULTRADTO;

public class EvaluarCuestionarioDTOWrapper {
	private RespuestaCuestionarioULTRADTO parametros;
	private ParametrosSeguridadULTRADTO security;
	public RespuestaCuestionarioULTRADTO getParametros() {
		return parametros;
	}
	public void setParametros(RespuestaCuestionarioULTRADTO parametros) {
		this.parametros = parametros;
	}
	public ParametrosSeguridadULTRADTO getSecurity() {
		return security;
	}
	public void setSecurity(ParametrosSeguridadULTRADTO security) {
		this.security = security;
	}
	
}

package co.dostf.info.dto.wrapper;

import com.webservice.prospecta.dto.ParametersDto;

import co.dostf.utiles.dto.SecurityDto;

public class ProspectaDtoWrapper {
	private ParametersDto parameters;
	private SecurityDto security;

	public ParametersDto getParameters() {
		return parameters;
	}

	public void setParameters(ParametersDto parameters) {
		this.parameters = parameters;
	}

	public SecurityDto getSecurity() {
		return security;
	}

	public void setSecurity(SecurityDto security) {
		this.security = security;
	}

}

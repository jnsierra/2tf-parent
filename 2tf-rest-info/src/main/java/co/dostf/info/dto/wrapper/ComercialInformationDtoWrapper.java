package co.dostf.info.dto.wrapper;

import com.asobancaria.cifin.infocomercial.dto.ParametrosConsultaDTO;

import co.dostf.utiles.dto.SecurityDto;

public class ComercialInformationDtoWrapper {
	private SecurityDto security;
	private ParametrosConsultaDTO parameters;

	public SecurityDto getSecurity() {
		return security;
	}

	public void setSecurity(SecurityDto security) {
		this.security = security;
	}

	public ParametrosConsultaDTO getParameters() {
		return parameters;
	}

	public void setParameters(ParametrosConsultaDTO parameters) {
		this.parameters = parameters;
	}

}

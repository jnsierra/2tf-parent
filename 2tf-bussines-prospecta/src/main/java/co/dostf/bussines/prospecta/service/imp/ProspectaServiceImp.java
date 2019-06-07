package co.dostf.bussines.prospecta.service.imp;

import java.rmi.RemoteException;

import org.springframework.beans.factory.annotation.Autowired;

import com.webservice.prospecta.ProspectaSoapBindingStub;
import com.webservice.prospecta.dto.ParametersDto;
import com.webservice.prospecta.dto.RespuestaProspectaDTO;

import co.dostf.bussines.prospecta.service.IProspectaService;
import co.dostf.utiles.dto.SecurityDto;

public class ProspectaServiceImp implements IProspectaService {

	@Autowired
	ProspectaSoapBindingStub prospectaSoapBindingStub;
	public RespuestaProspectaDTO getProspecta(ParametersDto parameters, SecurityDto security) throws RemoteException {
		prospectaSoapBindingStub.setUsername(security.getUser());
		prospectaSoapBindingStub.setPassword(security.getPassword());
		return prospectaSoapBindingStub.consultaProspecta(parameters.getCodigoInformacion(), parameters.getNumeroIdentificacion(), parameters.getTipoIdentificacion());
	}

}

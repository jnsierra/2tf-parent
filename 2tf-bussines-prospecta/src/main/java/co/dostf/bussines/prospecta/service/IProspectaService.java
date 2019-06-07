package co.dostf.bussines.prospecta.service;

import java.rmi.RemoteException;

import com.webservice.prospecta.dto.ParametersDto;
import com.webservice.prospecta.dto.RespuestaProspectaDTO;

import co.dostf.utiles.dto.SecurityDto;

public interface IProspectaService {

	RespuestaProspectaDTO getProspecta(ParametersDto parameters, SecurityDto security) throws RemoteException;
}

package co.dostf.bussiness.cuestionario.service;

import java.rmi.RemoteException;

import co.cifin.confrontaultra.dto.ultra.CuestionarioULTRADTO;
import co.cifin.confrontaultra.dto.ultra.ParametrosSeguridadULTRADTO;
import co.cifin.confrontaultra.dto.ultra.ParametrosULTRADTO;

public interface ICuestionarioService {
	/**
	 * Metodo con el cual obtengo el cuestinario para un cliente
	 * @param parametros
	 * @param security
	 * @return
	 */
	CuestionarioULTRADTO getCuestionario(ParametrosULTRADTO parametros, ParametrosSeguridadULTRADTO security)throws RemoteException;

}

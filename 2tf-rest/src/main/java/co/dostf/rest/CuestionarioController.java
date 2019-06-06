package co.dostf.rest;

import java.rmi.RemoteException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.cifin.confrontaultra.dto.ultra.CuestionarioULTRADTO;
import co.dostf.bussiness.cuestionario.service.ICuestionarioService;
import co.dostf.dto.wrapper.CuestionarioDtoWrapper;
import co.dostf.utiles.dto.error.ResponseRestService;


@RestController
@RequestMapping("/v.1.0/cuestionario")
public class CuestionarioController {

	@Autowired
	ICuestionarioService cuestionarioService;


	@RequestMapping(value = "/getCuestionario/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseRestService<CuestionarioULTRADTO>> obtenerCuenstionario(
			@RequestBody() CuestionarioDtoWrapper cuestionario) throws RemoteException {
		CuestionarioULTRADTO cuestionarioResp = cuestionarioService.getCuestionario(cuestionario.getParametrosULTRA(),
				cuestionario.getParametrosSeguridadULTRA());
		return new ResponseEntity<>(new ResponseRestService<>(cuestionarioResp), HttpStatus.OK);
	}
}

package co.dostf.info.rest;

import java.rmi.RemoteException;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.prospecta.dto.RespuestaProspectaDTO;

import co.dostf.bussines.prospecta.service.IProspectaService;
import co.dostf.info.dto.wrapper.ProspectaDtoWrapper;
import co.dostf.utiles.dto.error.ResponseRestService;

@RestController
@RequestMapping("/v.1.0/prospecta")
public class ProspectaController {
	
	@Autowired
	IProspectaService prospectaService;

	@RequestMapping(value = "/get/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseRestService<RespuestaProspectaDTO>> get(@RequestBody(required = true) ProspectaDtoWrapper prospecta) throws RemoteException,JSONException{
		RespuestaProspectaDTO respuesta = prospectaService.getProspecta(prospecta.getParameters(), prospecta.getSecurity());
		return new ResponseEntity<>(new ResponseRestService<>(respuesta), HttpStatus.OK);
	}
}

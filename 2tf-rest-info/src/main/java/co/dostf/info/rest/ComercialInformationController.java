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

import co.dostf.bussiness.informacion.service.IComercialInformationService;
import co.dostf.info.dto.wrapper.ComercialInformationDtoWrapper;

@RestController
@RequestMapping("/v.1.0/comercialInformation")
public class ComercialInformationController {
	
	@Autowired
	IComercialInformationService service;
	
	@RequestMapping(value = "/getComercialInformation/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getComercialInformation(@RequestBody() ComercialInformationDtoWrapper comercialInformation) throws RemoteException,JSONException{
		String response = service.getComercialInformation(comercialInformation.getParameters(), comercialInformation.getSecurity());
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}

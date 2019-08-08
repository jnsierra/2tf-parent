package co.dostf.info.rest;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.RemoteException;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.dostf.bussiness.informacion.service.IComercialInformationService;
import co.dostf.info.dto.wrapper.ComercialInformationDtoWrapper;
import co.dostf.info.dto.wrapper.TestDto;

@RestController
@RequestMapping("/v.1.0/comercialInformation")
public class ComercialInformationController {

	@Autowired
	IComercialInformationService service;
	
	@Value("${spring.application.name}")
	String name;

	@RequestMapping(value = "/getComercialInformation/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getComercialInformation(
			@RequestBody() ComercialInformationDtoWrapper comercialInformation) throws RemoteException, JSONException {
		String response = service.getComercialInformation(comercialInformation.getParameters(),
				comercialInformation.getSecurity());
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET, produces =  MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TestDto> testService() throws UnknownHostException{
		return new ResponseEntity<>(TestDto.of(InetAddress.getLocalHost().toString(), name), HttpStatus.OK);
	}
}

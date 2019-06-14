package co.dostf.bussiness.informacion.service.impl;

import java.rmi.RemoteException;

import javax.annotation.PostConstruct;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asobancaria.cifin.infocomercial.InformacionComercialSoapBindingStub;
import com.asobancaria.cifin.infocomercial.dto.ParametrosConsultaDTO;

import co.dostf.bussiness.informacion.service.IComercialInformationService;
import co.dostf.utiles.dto.SecurityDto;

@Service
public class ComercialInformationService implements IComercialInformationService {

	@Autowired
	InformacionComercialSoapBindingStub informacionComercialSoapBindingStub;

	@PostConstruct
	public void init() {
		
	}

	@Override
	public String getComercialInformation(ParametrosConsultaDTO parameters, SecurityDto security)
			throws RemoteException, JSONException {
		informacionComercialSoapBindingStub.setUsername(security.getUser());
		informacionComercialSoapBindingStub.setPassword(security.getPassword());
		String xml = informacionComercialSoapBindingStub.consultaXml(parameters);
		JSONObject xmlJSONObj = XML.toJSONObject(xml);
		return xmlJSONObj.toString();
	}

}

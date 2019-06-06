package co.dostf.bussiness.informacion.config;

import javax.xml.rpc.ServiceException;

import org.apache.axis.configuration.FileProvider;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import com.asobancaria.cifin.infocomercial.InformacionComercialSoapBindingStub;
import com.asobancaria.cifin.infocomercial.InformacionComercialWSServiceLocator;

@Configuration
@PropertySources({ @PropertySource("classpath:configurationInfo.properities") })
public class WebServiceConfigInfo {
	
	
	
	@Value("${configurarion.service.comercialInformation}")
	String urlServiceComercialInformation;

	@Bean("informacionComercialWSServiceLocator")
	public InformacionComercialWSServiceLocator getServiceinformationLocator() {
		return new InformacionComercialWSServiceLocator(urlServiceComercialInformation);
	}
	
	@Bean("informacionComercialSoapBindingStub")
	public InformacionComercialSoapBindingStub getSoapBindingInformationStub(
			@Qualifier("informacionComercialWSServiceLocator") InformacionComercialWSServiceLocator locator)
			throws ServiceException {
		locator.setEngineConfiguration(new FileProvider("client-config.wsdd"));
		return (InformacionComercialSoapBindingStub) locator.getInformacionComercial();
	}
	
	
}

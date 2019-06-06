package co.dostf.bussiness.cuestionario.config;

import javax.xml.rpc.ServiceException;

import org.apache.axis.configuration.FileProvider;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import corp.universo.ttuweb3.cifin.confrontav2plusws.services.ConfrontaUltraWS.ConfrontaUltraWSSoapBindingStub;
import corp.universo.ttuweb3.cifin.confrontav2plusws.services.ConfrontaUltraWS.ConfrontaUltraWebServiceServiceLocator;

@Configuration
@PropertySources({ @PropertySource("classpath:configuration.properities") })
public class WebServiceConfigCuest {
	
	@Value("${configurarion.service.cuestinario}")
	String urlServiceCuestionario;

	@Bean("confrontaUltraWebServiceServiceLocator")
	public ConfrontaUltraWebServiceServiceLocator getServiceLocatior() {
		return new ConfrontaUltraWebServiceServiceLocator(urlServiceCuestionario);
	}
	
	@Bean("confrontaUltraWSSoapBindingStub")
	public ConfrontaUltraWSSoapBindingStub getSoapBindingStub(
			@Qualifier("confrontaUltraWebServiceServiceLocator") ConfrontaUltraWebServiceServiceLocator locator)
			throws ServiceException {
		locator.setEngineConfiguration(new FileProvider("client-config.wsdd"));
		return (ConfrontaUltraWSSoapBindingStub) locator.getConfrontaUltraWS();
	}	
	
}

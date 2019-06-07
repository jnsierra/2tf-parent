package co.dostf.bussines.prospecta.config;

import javax.xml.rpc.ServiceException;

import org.apache.axis.configuration.FileProvider;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import com.webservice.prospecta.ProspectaSoapBindingStub;
import com.webservice.prospecta.ProspectaWSServiceLocator;

@Configuration
@PropertySources({ @PropertySource("classpath:configurationProspecta.properities") })
public class WebServiceConfigProspecta {
	
	@Value("${configurarion.service.prospecta}")
	String urlServiceProspecta;

	@Bean("prospectaWSServiceLocator")
	public ProspectaWSServiceLocator getServiceLocator() {
		return new ProspectaWSServiceLocator(urlServiceProspecta);
	}
	
	@Bean("prospectaSoapBindingStub")
	public ProspectaSoapBindingStub getSoapBindingProspectaStub(
			@Qualifier("prospectaWSServiceLocator") ProspectaWSServiceLocator locator)
			throws ServiceException {
		locator.setEngineConfiguration(new FileProvider("client-config.wsdd"));
		return (ProspectaSoapBindingStub) locator.getProspecta();
	}
	

}

package co.cifin; 
 
import com.webservice.prospecta.ProspectaSoapBindingStub; 
import com.webservice.prospecta.ProspectaWSServiceLocator; 
import com.webservice.prospecta.dto.RespuestaProspectaDTO; 
 
import java.rmi.RemoteException; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import javax.xml.rpc.ServiceException; 
 

public class Cliente {
    public static void main (String args[]) {
        try {             
            ProspectaWSServiceLocator locator = new ProspectaWSServiceLocator("https://cifinpruebas.asobancaria.com/ws/ProspectaPlusWebService/services/ProspectaPlus");
            ProspectaSoapBindingStub stub = (ProspectaSoapBindingStub) locator.getProspecta();
            //RespuestaProspectaDTO parametros = new RespuestaProspectaDTO();
            stub.setUsername( "90827" );
            stub.setPassword( "Pr3m1s" );

            RespuestaProspectaDTO parametros = stub.consultaProspecta("3058", "41649732", "1");

            System.out.println( "Resultado: " +parametros.getResultado());
            System.out.println("Nombre: "+ parametros.getNombreTitular());
        
        }catch (ServiceException ex) {
         Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
         }catch (RemoteException ex) {
         Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }     
    } 
}


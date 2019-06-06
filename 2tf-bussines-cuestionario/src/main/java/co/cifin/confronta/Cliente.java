//package co.cifin.confronta;
//
//import co.cifin.confrontaultra.dto.ultra.CuestionarioULTRADTO;
//import co.cifin.confrontaultra.dto.ultra.ParametrosSeguridadULTRADTO;
//import co.cifin.confrontaultra.dto.ultra.ParametrosULTRADTO;
//import co.cifin.confrontaultra.dto.ultra.PreguntaULTRADTO;
//import corp.universo.ttuweb3.cifin.confrontav2plusws.services.ConfrontaUltraWS.ConfrontaUltraWSSoapBindingStub;
//import corp.universo.ttuweb3.cifin.confrontav2plusws.services.ConfrontaUltraWS.ConfrontaUltraWebServiceServiceLocator;
//
//import java.rmi.RemoteException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.xml.rpc.ServiceException;
//
//public class Cliente {
//
//    public static void main(String args[]) {
//        try {
//
//            ConfrontaUltraWebServiceServiceLocator locator = new ConfrontaUltraWebServiceServiceLocator("https://cifinpruebas.asobancaria.com/cifin/confrontav2plusws/services/ConfrontaUltraWS?wsdl");
//            ConfrontaUltraWSSoapBindingStub stub = (ConfrontaUltraWSSoapBindingStub) locator.getConfrontaUltraWS();
//            ParametrosULTRADTO parametros = new ParametrosULTRADTO();
//            ParametrosSeguridadULTRADTO para = new ParametrosSeguridadULTRADTO();
//            parametros.setCodigoCiudad(1);
//            parametros.setCodigoCuestionario(7224);
//            parametros.setCodigoDepartamento(19);
//            parametros.setCodigoTipoIdentificacion("1");
//            parametros.setFechaExpedicion("12/10/2010");
//            parametros.setNumeroIdentificacion("1019075086");
//            parametros.setPrimerApellido("BAHAMON");
//            parametros.setTelefono("1");
//            para.setClaveCIFIN("679246");
//            para.setPassword("Rimsa1");
//            CuestionarioULTRADTO respXml = stub.obtenerCuestionario(para, parametros);
//            PreguntaULTRADTO[] listadoPreguntas = respXml.getListadoPreguntas();
//            for (int i = 0; i < listadoPreguntas.length; i++) {
//                System.out.println(listadoPreguntas[i].getTextoPregunta());
//            }
//        } catch (ServiceException ex) {
//            ex.printStackTrace();
//        } catch (RemoteException ex) {
//            ex.printStackTrace();
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }
//}

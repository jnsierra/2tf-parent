/**
 * ProspectaWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.webservice.prospecta;

public interface ProspectaWS extends java.rmi.Remote {
    public com.webservice.prospecta.dto.RespuestaProspectaDTO consultaProspecta(java.lang.String codigoInformacion, java.lang.String numeroIdentificacion, java.lang.String tipoIdentificacion) throws java.rmi.RemoteException;
}

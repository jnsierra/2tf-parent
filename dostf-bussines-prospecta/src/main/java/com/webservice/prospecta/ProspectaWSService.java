/**
 * ProspectaWSService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.webservice.prospecta;

public interface ProspectaWSService extends javax.xml.rpc.Service {
    public java.lang.String getProspectaAddress();

    public com.webservice.prospecta.ProspectaWS getProspecta() throws javax.xml.rpc.ServiceException;

    public com.webservice.prospecta.ProspectaWS getProspecta(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

/**
 * ProspectaWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.webservice.prospecta;

public class ProspectaWSServiceLocator extends org.apache.axis.client.Service implements com.webservice.prospecta.ProspectaWSService {

    public ProspectaWSServiceLocator() {
    }
    
    public ProspectaWSServiceLocator(String url) {
        Prospecta_address=url;            
    }
    
    public ProspectaWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProspectaWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Prospecta
    private java.lang.String Prospecta_address = "https://ttuweb3.universo.corp/ws/ProspectaWebService/services/Prospecta";

    public java.lang.String getProspectaAddress() {
        return Prospecta_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProspectaWSDDServiceName = "Prospecta";

    public java.lang.String getProspectaWSDDServiceName() {
        return ProspectaWSDDServiceName;
    }

    public void setProspectaWSDDServiceName(java.lang.String name) {
        ProspectaWSDDServiceName = name;
    }

    public com.webservice.prospecta.ProspectaWS getProspecta() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Prospecta_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProspecta(endpoint);
    }

    public com.webservice.prospecta.ProspectaWS getProspecta(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.webservice.prospecta.ProspectaSoapBindingStub _stub = new com.webservice.prospecta.ProspectaSoapBindingStub(portAddress, this);
            _stub.setPortName(getProspectaWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProspectaEndpointAddress(java.lang.String address) {
        Prospecta_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.webservice.prospecta.ProspectaWS.class.isAssignableFrom(serviceEndpointInterface)) {
                com.webservice.prospecta.ProspectaSoapBindingStub _stub = new com.webservice.prospecta.ProspectaSoapBindingStub(new java.net.URL(Prospecta_address), this);
                _stub.setPortName(getProspectaWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Prospecta".equals(inputPortName)) {
            return getProspecta();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://prospecta.webservice.com", "ProspectaWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://prospecta.webservice.com", "Prospecta"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Prospecta".equals(portName)) {
            setProspectaEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

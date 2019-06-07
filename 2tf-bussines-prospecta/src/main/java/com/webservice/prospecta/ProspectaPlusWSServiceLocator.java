/**
 * ProspectaPlusWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.webservice.prospecta;

public class ProspectaPlusWSServiceLocator extends org.apache.axis.client.Service implements com.webservice.prospecta.ProspectaPlusWSService {

    public ProspectaPlusWSServiceLocator() {
    }


    public ProspectaPlusWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProspectaPlusWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProspectaPlus
    private java.lang.String ProspectaPlus_address = "https://ttuweb3.universo.corp/ws/ProspectaPlusWebService/services/ProspectaPlus";

    public java.lang.String getProspectaPlusAddress() {
        return ProspectaPlus_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProspectaPlusWSDDServiceName = "ProspectaPlus";

    public java.lang.String getProspectaPlusWSDDServiceName() {
        return ProspectaPlusWSDDServiceName;
    }

    public void setProspectaPlusWSDDServiceName(java.lang.String name) {
        ProspectaPlusWSDDServiceName = name;
    }

    public com.webservice.prospecta.ProspectaPlusWS getProspectaPlus() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProspectaPlus_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProspectaPlus(endpoint);
    }

    public com.webservice.prospecta.ProspectaPlusWS getProspectaPlus(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.webservice.prospecta.ProspectaPlusSoapBindingStub _stub = new com.webservice.prospecta.ProspectaPlusSoapBindingStub(portAddress, this);
            _stub.setPortName(getProspectaPlusWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProspectaPlusEndpointAddress(java.lang.String address) {
        ProspectaPlus_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.webservice.prospecta.ProspectaPlusWS.class.isAssignableFrom(serviceEndpointInterface)) {
                com.webservice.prospecta.ProspectaPlusSoapBindingStub _stub = new com.webservice.prospecta.ProspectaPlusSoapBindingStub(new java.net.URL(ProspectaPlus_address), this);
                _stub.setPortName(getProspectaPlusWSDDServiceName());
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
        if ("ProspectaPlus".equals(inputPortName)) {
            return getProspectaPlus();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://prospecta.webservice.com", "ProspectaPlusWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://prospecta.webservice.com", "ProspectaPlus"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProspectaPlus".equals(portName)) {
            setProspectaPlusEndpointAddress(address);
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

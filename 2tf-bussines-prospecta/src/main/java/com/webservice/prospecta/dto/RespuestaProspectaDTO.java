/**
 * RespuestaProspectaDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.webservice.prospecta.dto;

public class RespuestaProspectaDTO  implements java.io.Serializable {
    private java.lang.Boolean consultadaReciente;

    private java.lang.Boolean generoInconsistencias;

    private com.webservice.prospecta.dto.InconsistenciasDTO[] inconsistencias;

    private java.lang.String nombreTitular;

    private java.lang.String numeroIdentificacion;

    private java.lang.String resultado;

    private java.lang.String tipoIdentificacion;

    public RespuestaProspectaDTO() {
    }

    public RespuestaProspectaDTO(
           java.lang.Boolean consultadaReciente,
           java.lang.Boolean generoInconsistencias,
           com.webservice.prospecta.dto.InconsistenciasDTO[] inconsistencias,
           java.lang.String nombreTitular,
           java.lang.String numeroIdentificacion,
           java.lang.String resultado,
           java.lang.String tipoIdentificacion) {
           this.consultadaReciente = consultadaReciente;
           this.generoInconsistencias = generoInconsistencias;
           this.inconsistencias = inconsistencias;
           this.nombreTitular = nombreTitular;
           this.numeroIdentificacion = numeroIdentificacion;
           this.resultado = resultado;
           this.tipoIdentificacion = tipoIdentificacion;
    }


    /**
     * Gets the consultadaReciente value for this RespuestaProspectaDTO.
     * 
     * @return consultadaReciente
     */
    public java.lang.Boolean getConsultadaReciente() {
        return consultadaReciente;
    }


    /**
     * Sets the consultadaReciente value for this RespuestaProspectaDTO.
     * 
     * @param consultadaReciente
     */
    public void setConsultadaReciente(java.lang.Boolean consultadaReciente) {
        this.consultadaReciente = consultadaReciente;
    }


    /**
     * Gets the generoInconsistencias value for this RespuestaProspectaDTO.
     * 
     * @return generoInconsistencias
     */
    public java.lang.Boolean getGeneroInconsistencias() {
        return generoInconsistencias;
    }


    /**
     * Sets the generoInconsistencias value for this RespuestaProspectaDTO.
     * 
     * @param generoInconsistencias
     */
    public void setGeneroInconsistencias(java.lang.Boolean generoInconsistencias) {
        this.generoInconsistencias = generoInconsistencias;
    }


    /**
     * Gets the inconsistencias value for this RespuestaProspectaDTO.
     * 
     * @return inconsistencias
     */
    public com.webservice.prospecta.dto.InconsistenciasDTO[] getInconsistencias() {
        return inconsistencias;
    }


    /**
     * Sets the inconsistencias value for this RespuestaProspectaDTO.
     * 
     * @param inconsistencias
     */
    public void setInconsistencias(com.webservice.prospecta.dto.InconsistenciasDTO[] inconsistencias) {
        this.inconsistencias = inconsistencias;
    }


    /**
     * Gets the nombreTitular value for this RespuestaProspectaDTO.
     * 
     * @return nombreTitular
     */
    public java.lang.String getNombreTitular() {
        return nombreTitular;
    }


    /**
     * Sets the nombreTitular value for this RespuestaProspectaDTO.
     * 
     * @param nombreTitular
     */
    public void setNombreTitular(java.lang.String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }


    /**
     * Gets the numeroIdentificacion value for this RespuestaProspectaDTO.
     * 
     * @return numeroIdentificacion
     */
    public java.lang.String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }


    /**
     * Sets the numeroIdentificacion value for this RespuestaProspectaDTO.
     * 
     * @param numeroIdentificacion
     */
    public void setNumeroIdentificacion(java.lang.String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }


    /**
     * Gets the resultado value for this RespuestaProspectaDTO.
     * 
     * @return resultado
     */
    public java.lang.String getResultado() {
        return resultado;
    }


    /**
     * Sets the resultado value for this RespuestaProspectaDTO.
     * 
     * @param resultado
     */
    public void setResultado(java.lang.String resultado) {
        this.resultado = resultado;
    }


    /**
     * Gets the tipoIdentificacion value for this RespuestaProspectaDTO.
     * 
     * @return tipoIdentificacion
     */
    public java.lang.String getTipoIdentificacion() {
        return tipoIdentificacion;
    }


    /**
     * Sets the tipoIdentificacion value for this RespuestaProspectaDTO.
     * 
     * @param tipoIdentificacion
     */
    public void setTipoIdentificacion(java.lang.String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespuestaProspectaDTO)) return false;
        RespuestaProspectaDTO other = (RespuestaProspectaDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.consultadaReciente==null && other.getConsultadaReciente()==null) || 
             (this.consultadaReciente!=null &&
              this.consultadaReciente.equals(other.getConsultadaReciente()))) &&
            ((this.generoInconsistencias==null && other.getGeneroInconsistencias()==null) || 
             (this.generoInconsistencias!=null &&
              this.generoInconsistencias.equals(other.getGeneroInconsistencias()))) &&
            ((this.inconsistencias==null && other.getInconsistencias()==null) || 
             (this.inconsistencias!=null &&
              java.util.Arrays.equals(this.inconsistencias, other.getInconsistencias()))) &&
            ((this.nombreTitular==null && other.getNombreTitular()==null) || 
             (this.nombreTitular!=null &&
              this.nombreTitular.equals(other.getNombreTitular()))) &&
            ((this.numeroIdentificacion==null && other.getNumeroIdentificacion()==null) || 
             (this.numeroIdentificacion!=null &&
              this.numeroIdentificacion.equals(other.getNumeroIdentificacion()))) &&
            ((this.resultado==null && other.getResultado()==null) || 
             (this.resultado!=null &&
              this.resultado.equals(other.getResultado()))) &&
            ((this.tipoIdentificacion==null && other.getTipoIdentificacion()==null) || 
             (this.tipoIdentificacion!=null &&
              this.tipoIdentificacion.equals(other.getTipoIdentificacion())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getConsultadaReciente() != null) {
            _hashCode += getConsultadaReciente().hashCode();
        }
        if (getGeneroInconsistencias() != null) {
            _hashCode += getGeneroInconsistencias().hashCode();
        }
        if (getInconsistencias() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInconsistencias());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInconsistencias(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNombreTitular() != null) {
            _hashCode += getNombreTitular().hashCode();
        }
        if (getNumeroIdentificacion() != null) {
            _hashCode += getNumeroIdentificacion().hashCode();
        }
        if (getResultado() != null) {
            _hashCode += getResultado().hashCode();
        }
        if (getTipoIdentificacion() != null) {
            _hashCode += getTipoIdentificacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RespuestaProspectaDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dto.prospecta.webservice.com", "RespuestaProspectaDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consultadaReciente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "consultadaReciente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generoInconsistencias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "generoInconsistencias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inconsistencias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inconsistencias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dto.prospecta.webservice.com", "InconsistenciasDTO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreTitular");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreTitular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroIdentificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroIdentificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoIdentificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoIdentificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

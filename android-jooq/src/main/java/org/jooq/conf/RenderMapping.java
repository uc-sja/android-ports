//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.23 at 06:55:19 PM CEST 
//


package org.jooq.conf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.arbonaut.xml.bind.annotation.XmlAccessType;
import org.arbonaut.xml.bind.annotation.XmlAccessorType;
import org.arbonaut.xml.bind.annotation.XmlElement;
import org.arbonaut.xml.bind.annotation.XmlElementWrapper;
import org.arbonaut.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RenderMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RenderMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="defaultSchema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schemata" type="{http://www.jooq.org/xsd/jooq-runtime-2.3.0.xsd}MappedSchemata" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RenderMapping", propOrder = {

})
public class RenderMapping implements Serializable
{

    private final static long serialVersionUID = 205L;
    protected String defaultSchema;
    @XmlElementWrapper(name = "schemata")
    @XmlElement(name = "schema")
    protected List<MappedSchema> schemata;

    /**
     * Gets the value of the defaultSchema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultSchema() {
        return defaultSchema;
    }

    /**
     * Sets the value of the defaultSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultSchema(String value) {
        this.defaultSchema = value;
    }

    public List<MappedSchema> getSchemata() {
        if (schemata == null) {
            schemata = new ArrayList<MappedSchema>();
        }
        return schemata;
    }

    public void setSchemata(List<MappedSchema> schemata) {
        this.schemata = schemata;
    }

    public RenderMapping withDefaultSchema(String value) {
        setDefaultSchema(value);
        return this;
    }

    public RenderMapping withSchemata(MappedSchema... values) {
        if (values!= null) {
            for (MappedSchema value: values) {
                getSchemata().add(value);
            }
        }
        return this;
    }

    public RenderMapping withSchemata(Collection<MappedSchema> values) {
        if (values!= null) {
            getSchemata().addAll(values);
        }
        return this;
    }

    public RenderMapping withSchemata(List<MappedSchema> schemata) {
        setSchemata(schemata);
        return this;
    }

}
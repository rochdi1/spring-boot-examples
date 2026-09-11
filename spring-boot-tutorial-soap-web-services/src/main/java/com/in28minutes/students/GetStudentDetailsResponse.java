//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2026.09.10 um 09:17:05 PM CEST 
//


package com.in28minutes.students;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StudentDetails" type="{http://in28minutes.com/students}StudentDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "studentDetails"
})
@XmlRootElement(name = "GetStudentDetailsResponse")
public class GetStudentDetailsResponse {

    @XmlElement(name = "StudentDetails", required = true)
    protected StudentDetails studentDetails;

    /**
     * Ruft den Wert der studentDetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StudentDetails }
     *     
     */
    public StudentDetails getStudentDetails() {
        return studentDetails;
    }

    /**
     * Legt den Wert der studentDetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentDetails }
     *     
     */
    public void setStudentDetails(StudentDetails value) {
        this.studentDetails = value;
    }

}

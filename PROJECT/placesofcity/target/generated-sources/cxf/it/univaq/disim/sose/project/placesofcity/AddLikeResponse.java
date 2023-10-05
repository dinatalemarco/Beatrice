
package it.univaq.disim.sose.project.placesofcity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per addLikeResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="addLikeResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="valueResponse" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="messageResponse" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addLikeResponse", propOrder = {
    "valueResponse",
    "messageResponse"
})
public class AddLikeResponse {

    protected boolean valueResponse;
    @XmlElement(required = true)
    protected String messageResponse;

    /**
     * Recupera il valore della proprietà valueResponse.
     * 
     */
    public boolean isValueResponse() {
        return valueResponse;
    }

    /**
     * Imposta il valore della proprietà valueResponse.
     * 
     */
    public void setValueResponse(boolean value) {
        this.valueResponse = value;
    }

    /**
     * Recupera il valore della proprietà messageResponse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageResponse() {
        return messageResponse;
    }

    /**
     * Imposta il valore della proprietà messageResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageResponse(String value) {
        this.messageResponse = value;
    }

}

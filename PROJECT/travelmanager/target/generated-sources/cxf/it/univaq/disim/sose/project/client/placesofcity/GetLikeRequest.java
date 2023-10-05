
package it.univaq.disim.sose.project.client.placesofcity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getLikeRequest complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getLikeRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="token_user" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLikeRequest", propOrder = {
    "tokenUser"
})
public class GetLikeRequest {

    @XmlElement(name = "token_user", required = true)
    protected String tokenUser;

    /**
     * Recupera il valore della proprietà tokenUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenUser() {
        return tokenUser;
    }

    /**
     * Imposta il valore della proprietà tokenUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenUser(String value) {
        this.tokenUser = value;
    }

}

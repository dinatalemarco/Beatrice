
package it.univaq.disim.sose.project.client.placesofcity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per loginResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="loginResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="session" type="{http://it.univaq.disim.sose.project/placesofcity}ResponseLoginType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loginResponse", propOrder = {
    "session"
})
public class LoginResponse {

    @XmlElement(required = true)
    protected ResponseLoginType session;

    /**
     * Recupera il valore della proprietà session.
     * 
     * @return
     *     possible object is
     *     {@link ResponseLoginType }
     *     
     */
    public ResponseLoginType getSession() {
        return session;
    }

    /**
     * Imposta il valore della proprietà session.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseLoginType }
     *     
     */
    public void setSession(ResponseLoginType value) {
        this.session = value;
    }

}


package it.univaq.disim.sose.project.placesofcity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per activityItem complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="activityItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="profile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="weather" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="start_hour" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="end_hour" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numberOfLikes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "activityItem", propOrder = {
    "id",
    "name",
    "phone",
    "longitude",
    "latitude",
    "image",
    "street",
    "profile",
    "weather",
    "startHour",
    "endHour",
    "numberOfLikes"
})
public class ActivityItem {

    protected int id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String phone;
    @XmlElement(required = true)
    protected String longitude;
    @XmlElement(required = true)
    protected String latitude;
    @XmlElement(required = true)
    protected String image;
    @XmlElement(required = true)
    protected String street;
    @XmlElement(required = true)
    protected String profile;
    @XmlElement(required = true)
    protected String weather;
    @XmlElement(name = "start_hour", required = true)
    protected String startHour;
    @XmlElement(name = "end_hour", required = true)
    protected String endHour;
    protected int numberOfLikes;

    /**
     * Recupera il valore della proprietà id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà phone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Imposta il valore della proprietà phone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Recupera il valore della proprietà longitude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Imposta il valore della proprietà longitude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

    /**
     * Recupera il valore della proprietà latitude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Imposta il valore della proprietà latitude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Recupera il valore della proprietà image.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImage() {
        return image;
    }

    /**
     * Imposta il valore della proprietà image.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImage(String value) {
        this.image = value;
    }

    /**
     * Recupera il valore della proprietà street.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Imposta il valore della proprietà street.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Recupera il valore della proprietà profile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfile() {
        return profile;
    }

    /**
     * Imposta il valore della proprietà profile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfile(String value) {
        this.profile = value;
    }

    /**
     * Recupera il valore della proprietà weather.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeather() {
        return weather;
    }

    /**
     * Imposta il valore della proprietà weather.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeather(String value) {
        this.weather = value;
    }

    /**
     * Recupera il valore della proprietà startHour.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartHour() {
        return startHour;
    }

    /**
     * Imposta il valore della proprietà startHour.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartHour(String value) {
        this.startHour = value;
    }

    /**
     * Recupera il valore della proprietà endHour.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndHour() {
        return endHour;
    }

    /**
     * Imposta il valore della proprietà endHour.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndHour(String value) {
        this.endHour = value;
    }

    /**
     * Recupera il valore della proprietà numberOfLikes.
     * 
     */
    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    /**
     * Imposta il valore della proprietà numberOfLikes.
     * 
     */
    public void setNumberOfLikes(int value) {
        this.numberOfLikes = value;
    }

}

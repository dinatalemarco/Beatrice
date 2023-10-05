package it.univaq.disim.sose.project.client.placesofcity;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-03-30T12:48:44.412+01:00
 * Generated source version: 3.2.7
 *
 */
@WebServiceClient(name = "PlacesOfCityService",
                  wsdlLocation = "file:/Users/marcodinatale/eclipse-workspace/Project-SOSE/travelmanager/src/main/resources/client/placesofcity.wsdl",
                  targetNamespace = "http://it.univaq.disim.sose.project/placesofcity")
public class PlacesOfCityService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://it.univaq.disim.sose.project/placesofcity", "PlacesOfCityService");
    public final static QName PlacesOfCityPort = new QName("http://it.univaq.disim.sose.project/placesofcity", "PlacesOfCityPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/marcodinatale/eclipse-workspace/Project-SOSE/travelmanager/src/main/resources/client/placesofcity.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PlacesOfCityService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/Users/marcodinatale/eclipse-workspace/Project-SOSE/travelmanager/src/main/resources/client/placesofcity.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PlacesOfCityService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PlacesOfCityService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PlacesOfCityService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public PlacesOfCityService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public PlacesOfCityService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public PlacesOfCityService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns PlacesOfCity
     */
    @WebEndpoint(name = "PlacesOfCityPort")
    public PlacesOfCity getPlacesOfCityPort() {
        return super.getPort(PlacesOfCityPort, PlacesOfCity.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PlacesOfCity
     */
    @WebEndpoint(name = "PlacesOfCityPort")
    public PlacesOfCity getPlacesOfCityPort(WebServiceFeature... features) {
        return super.getPort(PlacesOfCityPort, PlacesOfCity.class, features);
    }

}

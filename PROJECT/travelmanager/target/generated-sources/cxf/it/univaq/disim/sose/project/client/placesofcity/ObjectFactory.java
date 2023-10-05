
package it.univaq.disim.sose.project.client.placesofcity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.univaq.disim.sose.project.client.placesofcity package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RegisterRequest_QNAME = new QName("http://it.univaq.disim.sose.project/placesofcity", "registerRequest");
    private final static QName _RegisterResponse_QNAME = new QName("http://it.univaq.disim.sose.project/placesofcity", "registerResponse");
    private final static QName _LoginRequest_QNAME = new QName("http://it.univaq.disim.sose.project/placesofcity", "loginRequest");
    private final static QName _LoginResponse_QNAME = new QName("http://it.univaq.disim.sose.project/placesofcity", "loginResponse");
    private final static QName _ActivityRequest_QNAME = new QName("http://it.univaq.disim.sose.project/placesofcity", "ActivityRequest");
    private final static QName _ActivityByProfileRequest_QNAME = new QName("http://it.univaq.disim.sose.project/placesofcity", "ActivityByProfileRequest");
    private final static QName _ActivityResponse_QNAME = new QName("http://it.univaq.disim.sose.project/placesofcity", "ActivityResponse");
    private final static QName _AddLikeRequest_QNAME = new QName("http://it.univaq.disim.sose.project/placesofcity", "addLikeRequest");
    private final static QName _AddLikeResponse_QNAME = new QName("http://it.univaq.disim.sose.project/placesofcity", "addLikeResponse");
    private final static QName _AddCommentRequest_QNAME = new QName("http://it.univaq.disim.sose.project/placesofcity", "addCommentRequest");
    private final static QName _AddCommentResponse_QNAME = new QName("http://it.univaq.disim.sose.project/placesofcity", "addCommentResponse");
    private final static QName _GetCommentRequest_QNAME = new QName("http://it.univaq.disim.sose.project/placesofcity", "getCommentRequest");
    private final static QName _GetCommentResponse_QNAME = new QName("http://it.univaq.disim.sose.project/placesofcity", "getCommentResponse");
    private final static QName _GetLikeRequest_QNAME = new QName("http://it.univaq.disim.sose.project/placesofcity", "getLikeRequest");
    private final static QName _GetLikeResponse_QNAME = new QName("http://it.univaq.disim.sose.project/placesofcity", "getLikeResponse");
    private final static QName _CityRequest_QNAME = new QName("http://it.univaq.disim.sose.project/placesofcity", "cityRequest");
    private final static QName _CityResponse_QNAME = new QName("http://it.univaq.disim.sose.project/placesofcity", "cityResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.univaq.disim.sose.project.client.placesofcity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegisterRequest }
     * 
     */
    public RegisterRequest createRegisterRequest() {
        return new RegisterRequest();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link LoginRequest }
     * 
     */
    public LoginRequest createLoginRequest() {
        return new LoginRequest();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link ActivityRequest }
     * 
     */
    public ActivityRequest createActivityRequest() {
        return new ActivityRequest();
    }

    /**
     * Create an instance of {@link ActivityByProfileRequest }
     * 
     */
    public ActivityByProfileRequest createActivityByProfileRequest() {
        return new ActivityByProfileRequest();
    }

    /**
     * Create an instance of {@link ActivityResponse }
     * 
     */
    public ActivityResponse createActivityResponse() {
        return new ActivityResponse();
    }

    /**
     * Create an instance of {@link AddLikeRequest }
     * 
     */
    public AddLikeRequest createAddLikeRequest() {
        return new AddLikeRequest();
    }

    /**
     * Create an instance of {@link AddLikeResponse }
     * 
     */
    public AddLikeResponse createAddLikeResponse() {
        return new AddLikeResponse();
    }

    /**
     * Create an instance of {@link AddCommentRequest }
     * 
     */
    public AddCommentRequest createAddCommentRequest() {
        return new AddCommentRequest();
    }

    /**
     * Create an instance of {@link AddCommentResponse }
     * 
     */
    public AddCommentResponse createAddCommentResponse() {
        return new AddCommentResponse();
    }

    /**
     * Create an instance of {@link GetCommentRequest }
     * 
     */
    public GetCommentRequest createGetCommentRequest() {
        return new GetCommentRequest();
    }

    /**
     * Create an instance of {@link GetCommentResponse }
     * 
     */
    public GetCommentResponse createGetCommentResponse() {
        return new GetCommentResponse();
    }

    /**
     * Create an instance of {@link GetLikeRequest }
     * 
     */
    public GetLikeRequest createGetLikeRequest() {
        return new GetLikeRequest();
    }

    /**
     * Create an instance of {@link GetLikeResponse }
     * 
     */
    public GetLikeResponse createGetLikeResponse() {
        return new GetLikeResponse();
    }

    /**
     * Create an instance of {@link CityRequest }
     * 
     */
    public CityRequest createCityRequest() {
        return new CityRequest();
    }

    /**
     * Create an instance of {@link CityResponse }
     * 
     */
    public CityResponse createCityResponse() {
        return new CityResponse();
    }

    /**
     * Create an instance of {@link ResponseLoginType }
     * 
     */
    public ResponseLoginType createResponseLoginType() {
        return new ResponseLoginType();
    }

    /**
     * Create an instance of {@link ActivityItem }
     * 
     */
    public ActivityItem createActivityItem() {
        return new ActivityItem();
    }

    /**
     * Create an instance of {@link CommentItem }
     * 
     */
    public CommentItem createCommentItem() {
        return new CommentItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://it.univaq.disim.sose.project/placesofcity", name = "registerRequest")
    public JAXBElement<RegisterRequest> createRegisterRequest(RegisterRequest value) {
        return new JAXBElement<RegisterRequest>(_RegisterRequest_QNAME, RegisterRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://it.univaq.disim.sose.project/placesofcity", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://it.univaq.disim.sose.project/placesofcity", name = "loginRequest")
    public JAXBElement<LoginRequest> createLoginRequest(LoginRequest value) {
        return new JAXBElement<LoginRequest>(_LoginRequest_QNAME, LoginRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://it.univaq.disim.sose.project/placesofcity", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivityRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://it.univaq.disim.sose.project/placesofcity", name = "ActivityRequest")
    public JAXBElement<ActivityRequest> createActivityRequest(ActivityRequest value) {
        return new JAXBElement<ActivityRequest>(_ActivityRequest_QNAME, ActivityRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivityByProfileRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://it.univaq.disim.sose.project/placesofcity", name = "ActivityByProfileRequest")
    public JAXBElement<ActivityByProfileRequest> createActivityByProfileRequest(ActivityByProfileRequest value) {
        return new JAXBElement<ActivityByProfileRequest>(_ActivityByProfileRequest_QNAME, ActivityByProfileRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://it.univaq.disim.sose.project/placesofcity", name = "ActivityResponse")
    public JAXBElement<ActivityResponse> createActivityResponse(ActivityResponse value) {
        return new JAXBElement<ActivityResponse>(_ActivityResponse_QNAME, ActivityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLikeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://it.univaq.disim.sose.project/placesofcity", name = "addLikeRequest")
    public JAXBElement<AddLikeRequest> createAddLikeRequest(AddLikeRequest value) {
        return new JAXBElement<AddLikeRequest>(_AddLikeRequest_QNAME, AddLikeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLikeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://it.univaq.disim.sose.project/placesofcity", name = "addLikeResponse")
    public JAXBElement<AddLikeResponse> createAddLikeResponse(AddLikeResponse value) {
        return new JAXBElement<AddLikeResponse>(_AddLikeResponse_QNAME, AddLikeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCommentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://it.univaq.disim.sose.project/placesofcity", name = "addCommentRequest")
    public JAXBElement<AddCommentRequest> createAddCommentRequest(AddCommentRequest value) {
        return new JAXBElement<AddCommentRequest>(_AddCommentRequest_QNAME, AddCommentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCommentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://it.univaq.disim.sose.project/placesofcity", name = "addCommentResponse")
    public JAXBElement<AddCommentResponse> createAddCommentResponse(AddCommentResponse value) {
        return new JAXBElement<AddCommentResponse>(_AddCommentResponse_QNAME, AddCommentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://it.univaq.disim.sose.project/placesofcity", name = "getCommentRequest")
    public JAXBElement<GetCommentRequest> createGetCommentRequest(GetCommentRequest value) {
        return new JAXBElement<GetCommentRequest>(_GetCommentRequest_QNAME, GetCommentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCommentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://it.univaq.disim.sose.project/placesofcity", name = "getCommentResponse")
    public JAXBElement<GetCommentResponse> createGetCommentResponse(GetCommentResponse value) {
        return new JAXBElement<GetCommentResponse>(_GetCommentResponse_QNAME, GetCommentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLikeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://it.univaq.disim.sose.project/placesofcity", name = "getLikeRequest")
    public JAXBElement<GetLikeRequest> createGetLikeRequest(GetLikeRequest value) {
        return new JAXBElement<GetLikeRequest>(_GetLikeRequest_QNAME, GetLikeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLikeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://it.univaq.disim.sose.project/placesofcity", name = "getLikeResponse")
    public JAXBElement<GetLikeResponse> createGetLikeResponse(GetLikeResponse value) {
        return new JAXBElement<GetLikeResponse>(_GetLikeResponse_QNAME, GetLikeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://it.univaq.disim.sose.project/placesofcity", name = "cityRequest")
    public JAXBElement<CityRequest> createCityRequest(CityRequest value) {
        return new JAXBElement<CityRequest>(_CityRequest_QNAME, CityRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://it.univaq.disim.sose.project/placesofcity", name = "cityResponse")
    public JAXBElement<CityResponse> createCityResponse(CityResponse value) {
        return new JAXBElement<CityResponse>(_CityResponse_QNAME, CityResponse.class, null, value);
    }

}

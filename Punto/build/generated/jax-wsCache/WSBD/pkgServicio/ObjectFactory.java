
package pkgServicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pkgServicio package. 
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

    private final static QName _Altas_QNAME = new QName("http://pkgWS/", "altas");
    private final static QName _AltasResponse_QNAME = new QName("http://pkgWS/", "altasResponse");
    private final static QName _Hello_QNAME = new QName("http://pkgWS/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://pkgWS/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pkgServicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Altas }
     * 
     */
    public Altas createAltas() {
        return new Altas();
    }

    /**
     * Create an instance of {@link AltasResponse }
     * 
     */
    public AltasResponse createAltasResponse() {
        return new AltasResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Altas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Altas }{@code >}
     */
    @XmlElementDecl(namespace = "http://pkgWS/", name = "altas")
    public JAXBElement<Altas> createAltas(Altas value) {
        return new JAXBElement<Altas>(_Altas_QNAME, Altas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://pkgWS/", name = "altasResponse")
    public JAXBElement<AltasResponse> createAltasResponse(AltasResponse value) {
        return new JAXBElement<AltasResponse>(_AltasResponse_QNAME, AltasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://pkgWS/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://pkgWS/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}

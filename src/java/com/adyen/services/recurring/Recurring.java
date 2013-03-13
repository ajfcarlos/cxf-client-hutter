package com.adyen.services.recurring;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2013-03-13T14:38:38.200-05:00
 * Generated source version: 2.6.2
 * 
 */
@WebServiceClient(name = "Recurring", 
                  wsdlLocation = "https://pal-test.adyen.com/pal/Recurring.wsdl",
                  targetNamespace = "http://recurring.services.adyen.com") 
public class Recurring extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://recurring.services.adyen.com", "Recurring");
    public final static QName RecurringHttpPort = new QName("http://recurring.services.adyen.com", "RecurringHttpPort");
    static {
        URL url = null;
        try {
            url = new URL("https://pal-test.adyen.com/pal/Recurring.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Recurring.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "https://pal-test.adyen.com/pal/Recurring.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Recurring(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Recurring(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Recurring() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Recurring(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Recurring(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Recurring(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns RecurringPortType
     */
    @WebEndpoint(name = "RecurringHttpPort")
    public RecurringPortType getRecurringHttpPort() {
        return super.getPort(RecurringHttpPort, RecurringPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RecurringPortType
     */
    @WebEndpoint(name = "RecurringHttpPort")
    public RecurringPortType getRecurringHttpPort(WebServiceFeature... features) {
        return super.getPort(RecurringHttpPort, RecurringPortType.class, features);
    }

}

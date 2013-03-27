package com.adyen.services.payment;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2013-03-27T17:10:25.172-05:00
 * Generated source version: 2.6.2
 * 
 */
@WebServiceClient(name = "Payment", 
                  wsdlLocation = "https://pal-test.adyen.com/pal/Payment.wsdl",
                  targetNamespace = "http://payment.services.adyen.com") 
public class Payment extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://payment.services.adyen.com", "Payment");
    public final static QName PaymentHttpPort = new QName("http://payment.services.adyen.com", "PaymentHttpPort");
    static {
        URL url = null;
        try {
            url = new URL("https://pal-test.adyen.com/pal/Payment.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Payment.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "https://pal-test.adyen.com/pal/Payment.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Payment(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Payment(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Payment() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Payment(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Payment(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Payment(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns PaymentPortType
     */
    @WebEndpoint(name = "PaymentHttpPort")
    public PaymentPortType getPaymentHttpPort() {
        return super.getPort(PaymentHttpPort, PaymentPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PaymentPortType
     */
    @WebEndpoint(name = "PaymentHttpPort")
    public PaymentPortType getPaymentHttpPort(WebServiceFeature... features) {
        return super.getPort(PaymentHttpPort, PaymentPortType.class, features);
    }

}
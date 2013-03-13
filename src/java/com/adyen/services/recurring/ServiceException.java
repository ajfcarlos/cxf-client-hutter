
package com.adyen.services.recurring;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.2
 * 2013-03-13T14:38:38.058-05:00
 * Generated source version: 2.6.2
 */

@WebFault(name = "ServiceException", targetNamespace = "http://recurring.services.adyen.com")
public class ServiceException extends Exception {
    
    private com.adyen.services.common.ServiceException serviceException;

    public ServiceException() {
        super();
    }
    
    public ServiceException(String message) {
        super(message);
    }
    
    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(String message, com.adyen.services.common.ServiceException serviceException) {
        super(message);
        this.serviceException = serviceException;
    }

    public ServiceException(String message, com.adyen.services.common.ServiceException serviceException, Throwable cause) {
        super(message, cause);
        this.serviceException = serviceException;
    }

    public com.adyen.services.common.ServiceException getFaultInfo() {
        return this.serviceException;
    }
}

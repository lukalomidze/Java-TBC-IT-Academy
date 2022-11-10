
package wsdl;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 4.0.0-M4
 * Generated source version: 3.0
 * 
 */
@WebFault(name = "UserNotFound", targetNamespace = "http://template/")
public class UserNotFound_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private UserNotFound faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public UserNotFound_Exception(String message, UserNotFound faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public UserNotFound_Exception(String message, UserNotFound faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: wsdl.UserNotFound
     */
    public UserNotFound getFaultInfo() {
        return faultInfo;
    }

}
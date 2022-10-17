
package homework.wsdl;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.FaultAction;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 4.0.0-M4
 * Generated source version: 3.0
 * 
 */
@WebService(name = "PersonServiceTemplate", targetNamespace = "http://template/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PersonServiceTemplate {


    /**
     * 
     * @param auth
     * @return
     *     returns java.lang.Object
     * @throws ClientUnauthorized_Exception
     * @throws GeneralError_Exception
     * @throws AccessForbidden_Exception
     */
    @WebMethod(operationName = "ListPersons")
    @WebResult(name = "persons", targetNamespace = "")
    @RequestWrapper(localName = "ListPersons", targetNamespace = "http://template/", className = "homework.wsdl.ListPersonsRequest")
    @ResponseWrapper(localName = "ListPersonsResponse", targetNamespace = "http://template/", className = "homework.wsdl.ListPersonsResponse")
    @Action(input = "http://template/PersonServiceTemplate/ListPersonsRequest", output = "http://template/PersonServiceTemplate/ListPersonsResponse", fault = {
        @FaultAction(className = GeneralError_Exception.class, value = "http://template/PersonServiceTemplate/ListPersons/Fault/GeneralError"),
        @FaultAction(className = AccessForbidden_Exception.class, value = "http://template/PersonServiceTemplate/ListPersons/Fault/AccessForbidden"),
        @FaultAction(className = ClientUnauthorized_Exception.class, value = "http://template/PersonServiceTemplate/ListPersons/Fault/ClientUnauthorized")
    })
    public Object listPersons(
        @WebParam(name = "auth", targetNamespace = "")
        AuthData auth)
        throws AccessForbidden_Exception, ClientUnauthorized_Exception, GeneralError_Exception
    ;

    /**
     * 
     * @param updatePersonRequest
     * @return
     *     returns boolean
     * @throws ClientUnauthorized_Exception
     * @throws GeneralError_Exception
     * @throws PersonNotFound_Exception
     * @throws AccessForbidden_Exception
     */
    @WebMethod(operationName = "UpdatePerson")
    @WebResult(name = "UpdatePersonResponse", targetNamespace = "http://template/", partName = "UpdatePersonResponse")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input = "http://template/PersonServiceTemplate/UpdatePersonRequest", output = "http://template/PersonServiceTemplate/UpdatePersonResponse", fault = {
        @FaultAction(className = GeneralError_Exception.class, value = "http://template/PersonServiceTemplate/UpdatePerson/Fault/GeneralError"),
        @FaultAction(className = AccessForbidden_Exception.class, value = "http://template/PersonServiceTemplate/UpdatePerson/Fault/AccessForbidden"),
        @FaultAction(className = ClientUnauthorized_Exception.class, value = "http://template/PersonServiceTemplate/UpdatePerson/Fault/ClientUnauthorized"),
        @FaultAction(className = PersonNotFound_Exception.class, value = "http://template/PersonServiceTemplate/UpdatePerson/Fault/PersonNotFound")
    })
    public boolean updatePerson(
        @WebParam(name = "UpdatePersonRequest", targetNamespace = "http://template/", partName = "UpdatePersonRequest")
        UpdatePersonRequest updatePersonRequest)
        throws AccessForbidden_Exception, ClientUnauthorized_Exception, GeneralError_Exception, PersonNotFound_Exception
    ;

    /**
     * 
     * @param addPersonRequest
     * @return
     *     returns boolean
     * @throws ClientUnauthorized_Exception
     * @throws GeneralError_Exception
     * @throws AccessForbidden_Exception
     * @throws PersonAlreadyExists_Exception
     */
    @WebMethod(operationName = "AddPerson")
    @WebResult(name = "AddPersonResponse", targetNamespace = "http://template/", partName = "AddPersonResponse")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input = "http://template/PersonServiceTemplate/AddPersonRequest", output = "http://template/PersonServiceTemplate/AddPersonResponse", fault = {
        @FaultAction(className = GeneralError_Exception.class, value = "http://template/PersonServiceTemplate/AddPerson/Fault/GeneralError"),
        @FaultAction(className = AccessForbidden_Exception.class, value = "http://template/PersonServiceTemplate/AddPerson/Fault/AccessForbidden"),
        @FaultAction(className = ClientUnauthorized_Exception.class, value = "http://template/PersonServiceTemplate/AddPerson/Fault/ClientUnauthorized"),
        @FaultAction(className = PersonAlreadyExists_Exception.class, value = "http://template/PersonServiceTemplate/AddPerson/Fault/PersonAlreadyExists")
    })
    public boolean addPerson(
        @WebParam(name = "AddPersonRequest", targetNamespace = "http://template/", partName = "AddPersonRequest")
        AddPersonRequest addPersonRequest)
        throws AccessForbidden_Exception, ClientUnauthorized_Exception, GeneralError_Exception, PersonAlreadyExists_Exception
    ;

    /**
     * 
     * @param getPersonRequest
     * @return
     *     returns homework.wsdl.GetPersonResponse
     * @throws ClientUnauthorized_Exception
     * @throws PersonNotFound_Exception
     * @throws GeneralError_Exception
     * @throws AccessForbidden_Exception
     */
    @WebMethod(operationName = "GetPerson")
    @WebResult(name = "GetPersonResponse", targetNamespace = "http://template/", partName = "GetPersonResponse")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input = "http://template/PersonServiceTemplate/GetPersonRequest", output = "http://template/PersonServiceTemplate/GetPersonResponse", fault = {
        @FaultAction(className = GeneralError_Exception.class, value = "http://template/PersonServiceTemplate/GetPerson/Fault/GeneralError"),
        @FaultAction(className = AccessForbidden_Exception.class, value = "http://template/PersonServiceTemplate/GetPerson/Fault/AccessForbidden"),
        @FaultAction(className = ClientUnauthorized_Exception.class, value = "http://template/PersonServiceTemplate/GetPerson/Fault/ClientUnauthorized"),
        @FaultAction(className = PersonNotFound_Exception.class, value = "http://template/PersonServiceTemplate/GetPerson/Fault/PersonNotFound")
    })
    public GetPersonResponse getPerson(
        @WebParam(name = "GetPersonRequest", targetNamespace = "http://template/", partName = "GetPersonRequest")
        GetPersonRequest getPersonRequest)
        throws AccessForbidden_Exception, ClientUnauthorized_Exception, GeneralError_Exception, PersonNotFound_Exception
    ;

    /**
     * 
     * @param deletePersonRequest
     * @return
     *     returns boolean
     * @throws ClientUnauthorized_Exception
     * @throws PersonNotFound_Exception
     * @throws GeneralError_Exception
     * @throws AccessForbidden_Exception
     */
    @WebMethod(operationName = "DeletePerson")
    @WebResult(name = "DeletePersonResponse", targetNamespace = "http://template/", partName = "DeletePersonResponse")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input = "http://template/PersonServiceTemplate/DeletePersonRequest", output = "http://template/PersonServiceTemplate/DeletePersonResponse", fault = {
        @FaultAction(className = GeneralError_Exception.class, value = "http://template/PersonServiceTemplate/DeletePerson/Fault/GeneralError"),
        @FaultAction(className = AccessForbidden_Exception.class, value = "http://template/PersonServiceTemplate/DeletePerson/Fault/AccessForbidden"),
        @FaultAction(className = ClientUnauthorized_Exception.class, value = "http://template/PersonServiceTemplate/DeletePerson/Fault/ClientUnauthorized"),
        @FaultAction(className = PersonNotFound_Exception.class, value = "http://template/PersonServiceTemplate/DeletePerson/Fault/PersonNotFound")
    })
    public boolean deletePerson(
        @WebParam(name = "DeletePersonRequest", targetNamespace = "http://template/", partName = "DeletePersonRequest")
        DeletePersonRequest deletePersonRequest)
        throws AccessForbidden_Exception, ClientUnauthorized_Exception, GeneralError_Exception, PersonNotFound_Exception
    ;

}
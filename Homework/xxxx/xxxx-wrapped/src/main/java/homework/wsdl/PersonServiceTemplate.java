
package homework.wsdl;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
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
     * @param id
     * @return
     *     returns homework.wsdl.Person
     * @throws PersonNotFound_Exception
     * @throws GeneralError_Exception
     * @throws AccessForbidden_Exception
     */
    @WebMethod(operationName = "GetPerson")
    @WebResult(name = "person", targetNamespace = "")
    @RequestWrapper(localName = "GetPerson", targetNamespace = "http://template/", className = "homework.wsdl.GetPerson")
    @ResponseWrapper(localName = "GetPersonResponse", targetNamespace = "http://template/", className = "homework.wsdl.GetPersonResponse")
    @Action(input = "http://template/PersonServiceTemplate/GetPersonRequest", output = "http://template/PersonServiceTemplate/GetPersonResponse", fault = {
        @FaultAction(className = GeneralError_Exception.class, value = "http://template/PersonServiceTemplate/GetPerson/Fault/GeneralError"),
        @FaultAction(className = AccessForbidden_Exception.class, value = "http://template/PersonServiceTemplate/GetPerson/Fault/AccessForbidden"),
        @FaultAction(className = PersonNotFound_Exception.class, value = "http://template/PersonServiceTemplate/GetPerson/Fault/PersonNotFound")
    })
    public Person getPerson(
        @WebParam(name = "id", targetNamespace = "")
        String id)
        throws AccessForbidden_Exception, GeneralError_Exception, PersonNotFound_Exception
    ;

    /**
     * 
     * @return
     *     returns java.lang.Object
     * @throws GeneralError_Exception
     * @throws AccessForbidden_Exception
     */
    @WebMethod(operationName = "ListPersons")
    @WebResult(name = "ListPersonsResult", targetNamespace = "")
    @RequestWrapper(localName = "ListPersons", targetNamespace = "http://template/", className = "homework.wsdl.ListPersons")
    @ResponseWrapper(localName = "ListPersonsResponse", targetNamespace = "http://template/", className = "homework.wsdl.ListPersonsResponse")
    @Action(input = "http://template/PersonServiceTemplate/ListPersonsRequest", output = "http://template/PersonServiceTemplate/ListPersonsResponse", fault = {
        @FaultAction(className = GeneralError_Exception.class, value = "http://template/PersonServiceTemplate/ListPersons/Fault/GeneralError"),
        @FaultAction(className = AccessForbidden_Exception.class, value = "http://template/PersonServiceTemplate/ListPersons/Fault/AccessForbidden")
    })
    public Object listPersons()
        throws AccessForbidden_Exception, GeneralError_Exception
    ;

    /**
     * 
     * @param firstName
     * @param lastName
     * @param id
     * @param age
     * @return
     *     returns boolean
     * @throws GeneralError_Exception
     * @throws AccessForbidden_Exception
     * @throws PersonAlreadyExists_Exception
     */
    @WebMethod(operationName = "AddPerson")
    @WebResult(name = "AddPersonResult", targetNamespace = "")
    @RequestWrapper(localName = "AddPerson", targetNamespace = "http://template/", className = "homework.wsdl.AddPerson")
    @ResponseWrapper(localName = "AddPersonResponse", targetNamespace = "http://template/", className = "homework.wsdl.AddPersonResponse")
    @Action(input = "http://template/PersonServiceTemplate/AddPersonRequest", output = "http://template/PersonServiceTemplate/AddPersonResponse", fault = {
        @FaultAction(className = GeneralError_Exception.class, value = "http://template/PersonServiceTemplate/AddPerson/Fault/GeneralError"),
        @FaultAction(className = AccessForbidden_Exception.class, value = "http://template/PersonServiceTemplate/AddPerson/Fault/AccessForbidden"),
        @FaultAction(className = PersonAlreadyExists_Exception.class, value = "http://template/PersonServiceTemplate/AddPerson/Fault/PersonAlreadyExists")
    })
    public boolean addPerson(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "first-name", targetNamespace = "")
        String firstName,
        @WebParam(name = "last-name", targetNamespace = "")
        String lastName,
        @WebParam(name = "age", targetNamespace = "")
        int age)
        throws AccessForbidden_Exception, GeneralError_Exception, PersonAlreadyExists_Exception
    ;

    /**
     * 
     * @param firstName
     * @param lastName
     * @param id
     * @param age
     * @return
     *     returns boolean
     * @throws PersonNotFound_Exception
     * @throws GeneralError_Exception
     * @throws AccessForbidden_Exception
     */
    @WebMethod(operationName = "UpdatePerson")
    @WebResult(name = "UpdatePersonResult", targetNamespace = "")
    @RequestWrapper(localName = "UpdatePerson", targetNamespace = "http://template/", className = "homework.wsdl.UpdatePerson")
    @ResponseWrapper(localName = "UpdatePersonResponse", targetNamespace = "http://template/", className = "homework.wsdl.UpdatePersonResponse")
    @Action(input = "http://template/PersonServiceTemplate/UpdatePersonRequest", output = "http://template/PersonServiceTemplate/UpdatePersonResponse", fault = {
        @FaultAction(className = GeneralError_Exception.class, value = "http://template/PersonServiceTemplate/UpdatePerson/Fault/GeneralError"),
        @FaultAction(className = AccessForbidden_Exception.class, value = "http://template/PersonServiceTemplate/UpdatePerson/Fault/AccessForbidden"),
        @FaultAction(className = PersonNotFound_Exception.class, value = "http://template/PersonServiceTemplate/UpdatePerson/Fault/PersonNotFound")
    })
    public boolean updatePerson(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "first-name", targetNamespace = "")
        String firstName,
        @WebParam(name = "last-name", targetNamespace = "")
        String lastName,
        @WebParam(name = "age", targetNamespace = "")
        int age)
        throws AccessForbidden_Exception, GeneralError_Exception, PersonNotFound_Exception
    ;

    /**
     * 
     * @param id
     * @return
     *     returns boolean
     * @throws PersonNotFound_Exception
     * @throws GeneralError_Exception
     * @throws AccessForbidden_Exception
     */
    @WebMethod(operationName = "DeletePerson")
    @WebResult(name = "DeletePersonResult", targetNamespace = "")
    @RequestWrapper(localName = "DeletePerson", targetNamespace = "http://template/", className = "homework.wsdl.DeletePerson")
    @ResponseWrapper(localName = "DeletePersonResponse", targetNamespace = "http://template/", className = "homework.wsdl.DeletePersonResponse")
    @Action(input = "http://template/PersonServiceTemplate/DeletePersonRequest", output = "http://template/PersonServiceTemplate/DeletePersonResponse", fault = {
        @FaultAction(className = GeneralError_Exception.class, value = "http://template/PersonServiceTemplate/DeletePerson/Fault/GeneralError"),
        @FaultAction(className = AccessForbidden_Exception.class, value = "http://template/PersonServiceTemplate/DeletePerson/Fault/AccessForbidden"),
        @FaultAction(className = PersonNotFound_Exception.class, value = "http://template/PersonServiceTemplate/DeletePerson/Fault/PersonNotFound")
    })
    public boolean deletePerson(
        @WebParam(name = "id", targetNamespace = "")
        String id)
        throws AccessForbidden_Exception, GeneralError_Exception, PersonNotFound_Exception
    ;

}


package com.polarising.bootsecurity.soap.user.example.xmlns._1565108737830;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import com.polarising.bootsecurity.soap.user.tibco.schemas.user.ObjectFactory;
import com.polarising.bootsecurity.soap.user.tibco.schemas.user.Root;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PortType_GetAllUsers", targetNamespace = "http://xmlns.example.com/1565108737830")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PortTypeGetAllUsers {


    /**
     * 
     * @return
     *     returns com.tibco.schemas.tibco.schemas.schema.Root
     */
    @WebMethod(operationName = "Operation", action = "/User/Service.serviceagent/PortType_GetAllUsersEndpoint1/Operation")
    @WebResult(name = "root", targetNamespace = "http://www.tibco.com/schemas/tibco/Schemas/Schema.xsd", partName = "output")
    public Root operation();

}

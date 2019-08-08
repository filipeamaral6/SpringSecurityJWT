
package com.polarising.bootsecurity.soap.employee.example.xmlns._1564670906833;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.polarising.bootsecurity.soap.employee.tibco.schemas.getbyid.GetById;
import com.polarising.bootsecurity.soap.employee.tibco.schemas.getbyid.Root;



/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PortType_GetEmployee", targetNamespace = "http://xmlns.example.com/1564670906833")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
	com.polarising.bootsecurity.soap.employee.tibco.schemas.employee.ObjectFactory.class,
	com.polarising.bootsecurity.soap.employee.tibco.schemas.getbyid.ObjectFactory.class
})
public interface PortTypeGetEmployee {


    /**
     * 
     * @param input
     * @return
     *     returns com.tibco.schemas.bankrising.schemas.employee.Root
     */
    @WebMethod(operationName = "Operation", action = "/Employee/Service.serviceagent/PortType_GetEmployeeEndpoint1/Operation")
    @WebResult(name = "root", targetNamespace = "http://www.tibco.com/schemas/Bankrising/Schemas/Employee.xsd", partName = "output")
    public Root operation(
        @WebParam(name = "getById", targetNamespace = "http://www.tibco.com/schemas/Bankrising/Schemas/getById.xsd", partName = "input")
        GetById input);

}

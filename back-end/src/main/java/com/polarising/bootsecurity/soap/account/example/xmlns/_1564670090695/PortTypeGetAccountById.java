
package com.polarising.bootsecurity.soap.account.example.xmlns._1564670090695;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.polarising.bootsecurity.soap.account.tibco.schemas.account.Root;
import com.polarising.bootsecurity.soap.account.tibco.schemas.getbyid.GetById;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PortType_GetAccountById", targetNamespace = "http://xmlns.example.com/1564670090695")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
	com.polarising.bootsecurity.soap.account.tibco.schemas.account.ObjectFactory.class,
	com.polarising.bootsecurity.soap.account.tibco.schemas.getbyid.ObjectFactory.class,
	com.polarising.bootsecurity.soap.account.tibco.schemas.getbyiban.ObjectFactory.class
})
public interface PortTypeGetAccountById {


    /**
     * 
     * @param input
     * @return
     *     returns com.tibco.schemas.bankrising.schemas.account.Root
     */
    @WebMethod(operationName = "Operation_GetAccountById", action = "/Account/Service.serviceagent/PortType_GetAccountByIdEndpoint1/Operation_GetAccountById")
    @WebResult(name = "root", targetNamespace = "http://www.tibco.com/schemas/Bankrising/Schemas/Account.xsd", partName = "output")
    public Root operationGetAccountById(
        @WebParam(name = "getById", targetNamespace = "http://www.tibco.com/schemas/Bankrising/Schemas/getById.xsd", partName = "input")
        GetById input);

}

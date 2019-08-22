
package com.polarising.bootsecurity.soap.transaction.example.xmlns._1564747039855;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import com.polarising.bootsecurity.soap.transaction.tibco.schemas.transaction.Root;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PortType_GetAllTransactions", targetNamespace = "http://xmlns.example.com/1564747039855")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
	com.polarising.bootsecurity.soap.transaction.tibco.schemas.deposit.ObjectFactory.class,
	com.polarising.bootsecurity.soap.transaction.tibco.schemas.getbyid.ObjectFactory.class,
	com.polarising.bootsecurity.soap.transaction.tibco.schemas.payment.ObjectFactory.class,
	com.polarising.bootsecurity.soap.transaction.tibco.schemas.transaction.ObjectFactory.class,
	com.polarising.bootsecurity.soap.transaction.tibco.schemas.transfer.ObjectFactory.class,
	com.polarising.bootsecurity.soap.transaction.tibco.schemas.withdraw.ObjectFactory.class,
	com.polarising.bootsecurity.soap.transaction.tibco.schemas.getbyiban.ObjectFactory.class
})
public interface PortTypeGetAllTransactions {


    /**
     * 
     * @return
     *     returns com.tibco.schemas.bankrising.schemas.transaction.Root
     */
    @WebMethod(operationName = "Operation", action = "/Transactions/Service.serviceagent/PortType_GetAllTransactionsEndpoint1/Operation")
    @WebResult(name = "root", targetNamespace = "http://www.tibco.com/schemas/Bankrising/Schemas/Transaction.xsd", partName = "output")
    public Root operation();

}

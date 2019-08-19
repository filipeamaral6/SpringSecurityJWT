
package com.polarising.bootsecurity.soap.transaction.example.xmlns._1564747039855;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Service", targetNamespace = "http://xmlns.example.com/1564747039855", wsdlLocation = "http://localhost:8074/bankrising/ws/transaction.wsdl")
public class TransactionService
    extends javax.xml.ws.Service
{
	 private final static URL SERVICE_WSDL_LOCATION;
	 private final static WebServiceException SERVICE_EXCEPTION;
	 private final static QName SERVICE_QNAME = new QName("http://xmlns.example.com/1564747039855", "Service");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8074/bankrising/ws/transaction.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICE_WSDL_LOCATION = url;
        SERVICE_EXCEPTION = e;
    }

    public TransactionService() {
        super(__getWsdlLocation(), SERVICE_QNAME);
    }

    public TransactionService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICE_QNAME, features);
    }

    public TransactionService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE_QNAME);
    }

    public TransactionService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICE_QNAME, features);
    }

    public TransactionService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TransactionService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PortTypeTransfer
     */
    @WebEndpoint(name = "PortType_TransferEndpoint1")
    public PortTypeTransfer getPortTypeTransferEndpoint1() {
        return super.getPort(new QName("http://xmlns.example.com/1564747039855", "PortType_TransferEndpoint1"), PortTypeTransfer.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PortTypeTransfer
     */
    @WebEndpoint(name = "PortType_TransferEndpoint1")
    public PortTypeTransfer getPortTypeTransferEndpoint1(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.example.com/1564747039855", "PortType_TransferEndpoint1"), PortTypeTransfer.class, features);
    }

    /**
     * 
     * @return
     *     returns PortTypeGetTransactionsByIban
     */
    @WebEndpoint(name = "PortType_GetTransactionsByIbanEndpoint1")
    public PortTypeGetTransactionsByIban getPortTypeGetTransactionsByIbanEndpoint1() {
        return super.getPort(new QName("http://xmlns.example.com/1564747039855", "PortType_GetTransactionsByIbanEndpoint1"), PortTypeGetTransactionsByIban.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PortTypeGetTransactionsByIban
     */
    @WebEndpoint(name = "PortType_GetTransactionsByIbanEndpoint1")
    public PortTypeGetTransactionsByIban getPortTypeGetTransactionsByIbanEndpoint1(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.example.com/1564747039855", "PortType_GetTransactionsByIbanEndpoint1"), PortTypeGetTransactionsByIban.class, features);
    }

    /**
     * 
     * @return
     *     returns PortTypeGetAllTransactions
     */
    @WebEndpoint(name = "PortType_GetAllTransactionsEndpoint1")
    public PortTypeGetAllTransactions getPortTypeGetAllTransactionsEndpoint1() {
        return super.getPort(new QName("http://xmlns.example.com/1564747039855", "PortType_GetAllTransactionsEndpoint1"), PortTypeGetAllTransactions.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PortTypeGetAllTransactions
     */
    @WebEndpoint(name = "PortType_GetAllTransactionsEndpoint1")
    public PortTypeGetAllTransactions getPortTypeGetAllTransactionsEndpoint1(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.example.com/1564747039855", "PortType_GetAllTransactionsEndpoint1"), PortTypeGetAllTransactions.class, features);
    }

    /**
     * 
     * @return
     *     returns PortTypePayment
     */
    @WebEndpoint(name = "PortType_PaymentEndpoint1")
    public PortTypePayment getPortTypePaymentEndpoint1() {
        return super.getPort(new QName("http://xmlns.example.com/1564747039855", "PortType_PaymentEndpoint1"), PortTypePayment.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PortTypePayment
     */
    @WebEndpoint(name = "PortType_PaymentEndpoint1")
    public PortTypePayment getPortTypePaymentEndpoint1(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.example.com/1564747039855", "PortType_PaymentEndpoint1"), PortTypePayment.class, features);
    }

    /**
     * 
     * @return
     *     returns PortTypeWithdraw
     */
    @WebEndpoint(name = "PortType_WithdrawEndpoint1")
    public PortTypeWithdraw getPortTypeWithdrawEndpoint1() {
        return super.getPort(new QName("http://xmlns.example.com/1564747039855", "PortType_WithdrawEndpoint1"), PortTypeWithdraw.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PortTypeWithdraw
     */
    @WebEndpoint(name = "PortType_WithdrawEndpoint1")
    public PortTypeWithdraw getPortTypeWithdrawEndpoint1(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.example.com/1564747039855", "PortType_WithdrawEndpoint1"), PortTypeWithdraw.class, features);
    }

    /**
     * 
     * @return
     *     returns PortTypeTransactionById
     */
    @WebEndpoint(name = "PortType_TransactionByIdEndpoint1")
    public PortTypeTransactionById getPortTypeTransactionByIdEndpoint1() {
        return super.getPort(new QName("http://xmlns.example.com/1564747039855", "PortType_TransactionByIdEndpoint1"), PortTypeTransactionById.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PortTypeTransactionById
     */
    @WebEndpoint(name = "PortType_TransactionByIdEndpoint1")
    public PortTypeTransactionById getPortTypeTransactionByIdEndpoint1(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.example.com/1564747039855", "PortType_TransactionByIdEndpoint1"), PortTypeTransactionById.class, features);
    }

    /**
     * 
     * @return
     *     returns PortTypeDeposit
     */
    @WebEndpoint(name = "PortType_DepositEndpoint1")
    public PortTypeDeposit getPortTypeDepositEndpoint1() {
        return super.getPort(new QName("http://xmlns.example.com/1564747039855", "PortType_DepositEndpoint1"), PortTypeDeposit.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PortTypeDeposit
     */
    @WebEndpoint(name = "PortType_DepositEndpoint1")
    public PortTypeDeposit getPortTypeDepositEndpoint1(WebServiceFeature... features) {
        return super.getPort(new QName("http://xmlns.example.com/1564747039855", "PortType_DepositEndpoint1"), PortTypeDeposit.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICE_EXCEPTION!= null) {
            throw SERVICE_EXCEPTION;
        }
        return SERVICE_WSDL_LOCATION;
    }

}

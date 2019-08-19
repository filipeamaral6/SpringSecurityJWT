
package com.polarising.bootsecurity.soap.transaction.tibco.schemas.withdraw;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tibco.schemas.bankrising.schemas.withdraw package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tibco.schemas.bankrising.schemas.withdraw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OutputWithdraw }
     * 
     */
    public OutputWithdraw createOutputWithdraw() {
        return new OutputWithdraw();
    }

    /**
     * Create an instance of {@link InputWithdraw }
     * 
     */
    public InputWithdraw createInputWithdraw() {
        return new InputWithdraw();
    }

    /**
     * Create an instance of {@link Root }
     * 
     */
    public Root createRoot() {
        return new Root();
    }

}

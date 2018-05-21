//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.08.09 at 09:28:45 PM CST
//

package com.xdc.basic.tools.statemachine.xml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.huawei.jnjd.level3.statemachineframework.xml package.
 * <p>
 * An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups. Factory methods for each of these are
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory
{

    private final static QName _Nxtstate_QNAME = new QName("", "nxtstate");
    private final static QName _Name_QNAME     = new QName("", "name");
    private final static QName _Context_QNAME  = new QName("", "context");
    private final static QName _Argtype_QNAME  = new QName("", "argtype");
    private final static QName _Function_QNAME = new QName("", "function");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.huawei.jnjd.level3.statemachineframework.xml
     * 
     */
    public ObjectFactory()
    {
    }

    /**
     * Create an instance of {@link Root }
     * 
     */
    public Root createRoot()
    {
        return new Root();
    }

    /**
     * Create an instance of {@link States }
     * 
     */
    public States createStates()
    {
        return new States();
    }

    /**
     * Create an instance of {@link State }
     * 
     */
    public State createState()
    {
        return new State();
    }

    /**
     * Create an instance of {@link Handlers }
     * 
     */
    public Handlers createHandlers()
    {
        return new Handlers();
    }

    /**
     * Create an instance of {@link Handler }
     * 
     */
    public Handler createHandler()
    {
        return new Handler();
    }

    /**
     * Create an instance of {@link Rettype }
     * 
     */
    public Rettype createRettype()
    {
        return new Rettype();
    }

    /**
     * Create an instance of {@link Events }
     * 
     */
    public Events createEvents()
    {
        return new Events();
    }

    /**
     * Create an instance of {@link Event }
     * 
     */
    public Event createEvent()
    {
        return new Event();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "nxtstate")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNxtstate(String value)
    {
        return new JAXBElement<String>(_Nxtstate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createName(String value)
    {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "context")
    public JAXBElement<String> createContext(String value)
    {
        return new JAXBElement<String>(_Context_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "argtype")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createArgtype(String value)
    {
        return new JAXBElement<String>(_Argtype_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "function")
    public JAXBElement<String> createFunction(String value)
    {
        return new JAXBElement<String>(_Function_QNAME, String.class, null, value);
    }

}
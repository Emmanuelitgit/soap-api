//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.12.01 at 05:52:30 PM GMT 
//


package com.api.spring.soap;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.api.spring.soap package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.api.spring.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetScoreRequest }
     * 
     */
    public GetScoreRequest createGetScoreRequest() {
        return new GetScoreRequest();
    }

    /**
     * Create an instance of {@link GetScoreResponse }
     * 
     */
    public GetScoreResponse createGetScoreResponse() {
        return new GetScoreResponse();
    }

    /**
     * Create an instance of {@link Score }
     * 
     */
    public Score createScore() {
        return new Score();
    }

    /**
     * Create an instance of {@link CreateProductRequest }
     * 
     */
    public CreateProductRequest createCreateProductRequest() {
        return new CreateProductRequest();
    }

    /**
     * Create an instance of {@link CreateProductResponse }
     * 
     */
    public CreateProductResponse createCreateProductResponse() {
        return new CreateProductResponse();
    }

    /**
     * Create an instance of {@link ServiceStatus }
     * 
     */
    public ServiceStatus createServiceStatus() {
        return new ServiceStatus();
    }

}

package com.soapApi.soapApi.Configuration;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;

@Configuration
@EnableWs
public class Configurations extends WsConfigurerAdapter {

    // This is a key component that is responsible for dispatching incoming SOAP requests to the appropriate @Endpoint classes
    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext); // Set the application context so that the servlet can access beans and endpoints
        servlet.setTransformWsdlLocations(true); // Allow WSDL to be generated dynamically
        return new ServletRegistrationBean<>(servlet, "/ws/*"); // Map servlet to the /ws/* URL pattern
    }

    // This bean is responsible for generating the WSDL (Web Services Description Language) document
    @Bean(name = "scoreWsdl")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema scoreSchema) {
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setPortTypeName("ScorePort"); // The portType element in the WSDL
        definition.setLocationUri("/ws"); // The location where the service will be accessible
        definition.setTargetNamespace("http://soap.spring.api.com/"); // The target namespace of the service
        definition.setSchema(scoreSchema); // The XSD schema for the request and response structures
        return definition;
    }

    // Responsible for loading the xsd file
    @Bean
    public XsdSchema scoreSchema() {
        return new SimpleXsdSchema(new ClassPathResource("score.xsd"));
    }

/*
Summary of the Flow:
MessageDispatcherServlet: This servlet is responsible for handling all SOAP requests to the /ws/* URL pattern. It dispatches requests to the appropriate endpoint methods.
DefaultWsdl11Definition: This bean generates the WSDL document that describes the service, operations, and message formats. It uses the score.xsd schema to define the request/response structure.
scoreSchema: This is the XML schema file (score.xsd) that defines the structure of the SOAP messages, including the fields like user and score.
 */
}
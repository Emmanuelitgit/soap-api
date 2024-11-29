package com.soap.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapClientConfig{

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // Set the package where your generated JAXB classes (from WSDL) are located
        marshaller.setContextPath("com.api.spring.soap");
        return marshaller;
    }
}
package com.soap.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private Jaxb2Marshaller marshaller;

    private WebServiceTemplate webServiceTemplate;
}

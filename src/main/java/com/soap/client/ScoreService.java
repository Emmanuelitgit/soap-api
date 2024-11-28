package com.soap.client;

import com.api.spring.soap.GetScoreRequest;
import com.api.spring.soap.GetScoreResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class ScoreService {

    private final WebServiceTemplate webServiceTemplate;

    @Autowired
    public ScoreService(Jaxb2Marshaller marshaller) {
        this.webServiceTemplate = new WebServiceTemplate(marshaller);
    }

    public GetScoreResponse getScores(GetScoreRequest request) {
        String endpointUrl = "http://localhost:5000/ws"; // Correct endpoint
        return (GetScoreResponse) webServiceTemplate.marshalSendAndReceive(endpointUrl, request);
    }
}
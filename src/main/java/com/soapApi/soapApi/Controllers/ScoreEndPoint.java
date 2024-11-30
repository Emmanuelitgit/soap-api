package com.soapApi.soapApi.Controllers;

import com.api.spring.soap.GetScoreRequest;
import com.api.spring.soap.GetScoreResponse;
import com.api.spring.soap.Score;
import com.soapApi.soapApi.Services.ScoreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ScoreEndPoint {

    private static final Logger log = LoggerFactory.getLogger(ScoreEndPoint.class);
    private final ScoreService scoreService;

    @Autowired
    public ScoreEndPoint(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    /*
    @RequestPayload
     Role: This annotation is used to indicate that the method parameter will be populated with the incoming SOAP request body, converted from XML to a Java object.
     Purpose: It tells Spring-WS to automatically convert the incoming SOAP XML data into a Java object and pass it to the controller method as a parameter.
     */

    /*
    @ResponsePayload
     Role: This annotation is used to indicate that the method return value will be automatically converted into the SOAP response body, which is then sent back to the client in the form of XML.
     Purpose: It tells Spring-WS to take the returned Java object and convert it into a SOAP XML response to send back to the client.
     */

    @PayloadRoot(namespace = "http://soap.spring.api.com/", localPart = "GetScoreRequest")
    @ResponsePayload //
    public GetScoreResponse getScore(@RequestPayload GetScoreRequest request){
        log.info("in getScore controller method=========={}", request.getUser());
       return scoreService.getScore(request);
    }
}

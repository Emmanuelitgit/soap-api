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

    @PayloadRoot(namespace = "http://soap.spring.api.com/", localPart = "GetScoreRequest")
    @ResponsePayload
    public GetScoreResponse getScore(@RequestPayload GetScoreRequest request){
        log.info("in getScore controller method==========");
       return scoreService.getScore(request);
    }
}

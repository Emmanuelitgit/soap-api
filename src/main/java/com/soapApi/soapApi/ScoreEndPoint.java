package com.soapApi.soapApi;

import com.api.spring.soap.GetScoreRequest;
import com.api.spring.soap.GetScoreResponse;
import com.api.spring.soap.Score;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ScoreEndPoint {

    @PayloadRoot(namespace = "http://soap.spring.api.com/", localPart = "GetScoreRequest")
    @ResponsePayload
    public GetScoreResponse getScore(@RequestPayload GetScoreRequest request){
        Score score = new Score();

        if (request.getUser().equalsIgnoreCase("Emmanuel")){
            score.setWins(100);
        }else {
            score.setWins(99);
            score.setLosses(20);
        }

        GetScoreResponse response = new GetScoreResponse();
        response.setScore(score);
        return response;
    }
}

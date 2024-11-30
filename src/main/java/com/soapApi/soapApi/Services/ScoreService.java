package com.soapApi.soapApi.Services;

import com.api.spring.soap.GetScoreRequest;
import com.api.spring.soap.GetScoreResponse;
import com.api.spring.soap.Score;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ScoreService {

    private static final Logger log = LoggerFactory.getLogger(ScoreService.class);

    public GetScoreResponse getScore(GetScoreRequest request){
        Score score = new Score();

        if (request.getUser().equalsIgnoreCase("Emmanuel")){
            score.setWins(100);
            score.setLosses(0);
            score.setUser(request.getUser());
        }else {
            score.setWins(99);
            score.setLosses(20);
            score.setUser(request.getUser());
        }
        log.info("user:{}",request.getUser() );
        GetScoreResponse response = new GetScoreResponse();
        response.setScore(score);
        log.info("response:{}", response.getScore());
        return response;
    }
}

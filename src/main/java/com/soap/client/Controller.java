package com.soap.client;

import com.api.spring.soap.GetScoreRequest;
import com.api.spring.soap.GetScoreResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private ScoreService scoreService;

    @PostMapping("/score")
    public GetScoreResponse getScores(@RequestBody GetScoreRequest request){
        return scoreService.getScores(request);
    }
}

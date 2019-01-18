package com.felix.config.confixplay.service;

import com.felix.config.confixplay.model.ExampleObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Felix Porres on 14/01/2019.
 */
public class ExampleServiceImpl implements ExampleService  {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public ExampleObject[] getExampleDate(){
        ResponseEntity<ExampleObject[]> response = restTemplate
            .exchange("https://jsonplaceholder.typicode.com/posts",
                HttpMethod.GET, null, ExampleObject[].class);
        return response.getBody();
    }
}

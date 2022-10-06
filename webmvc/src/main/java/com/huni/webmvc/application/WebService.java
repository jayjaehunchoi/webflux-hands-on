package com.huni.webmvc.application;

import com.huni.webmvc.presentation.CrewResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class WebService {

    private final RestTemplate restTemplate;

    public CrewResponse[] getAll() {
        return restTemplate.getForEntity("/api/crews", CrewResponse[].class)
                .getBody();
    }
}

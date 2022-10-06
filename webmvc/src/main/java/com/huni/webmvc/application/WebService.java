package com.huni.webmvc.application;

import com.huni.webmvc.presentation.CrewResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
@Slf4j
public class WebService {

    private final RestTemplate restTemplate;

    public CrewResponse[] getAll() {
        log.info("MVC : getAll");
        return restTemplate.getForEntity("/api/crews", CrewResponse[].class)
                .getBody();
    }
}

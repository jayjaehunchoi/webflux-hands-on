package com.huni.webflux.application;

import com.huni.webflux.presentation.CrewResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
@Slf4j
public class WebService {

    private final WebClient webClient;

    public Flux<CrewResponse> getAll() {
        log.info("Flux : getAll");
        return webClient.get()
                .uri("/api/crews")
                .retrieve()
                .bodyToFlux(CrewResponse.class);
    }
}

package com.huni.webflux.presentation;

import com.huni.webflux.application.WebService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
public class WebController {

    private final WebService webService;

    @GetMapping("/api/flux")
    public Flux<CrewResponse> getAll() {
        return webService.getAll();
    }

}

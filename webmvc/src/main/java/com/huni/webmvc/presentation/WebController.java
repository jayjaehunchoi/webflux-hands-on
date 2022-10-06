package com.huni.webmvc.presentation;

import com.huni.webmvc.application.WebService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WebController {

    private final WebService webService;

    @GetMapping("/api/mvc")
    public ResponseEntity<CrewResponse[]> getAll() {
        return ResponseEntity.ok(webService.getAll());
    }
}

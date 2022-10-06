package com.huni.crewservice.presentation;

import com.huni.crewservice.application.CrewResponse;
import com.huni.crewservice.application.CrewService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CrewController {

    private final CrewService crewService;

    @GetMapping("/api/crews")
    public ResponseEntity<List<CrewResponse>> getAll() throws InterruptedException {
        Thread.sleep(2000);
        return ResponseEntity.ok(crewService.findAll());
    }
}

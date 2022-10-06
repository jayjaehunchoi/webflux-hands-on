package com.huni.crewservice;

import com.huni.crewservice.domain.Crew;
import com.huni.crewservice.domain.CrewRepository;
import com.huni.crewservice.domain.CrewType;
import javax.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class CrewServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrewServiceApplication.class, args);
    }


    @Component
    @RequiredArgsConstructor
    static class Initialize {

        private final CrewRepository crewRepository;

        @PostConstruct
        public void add() {
            crewRepository.save(new Crew("huni", CrewType.BACKEND));
            crewRepository.save(new Crew("hoho", CrewType.BACKEND));
            crewRepository.save(new Crew("lala", CrewType.BACKEND));
            crewRepository.save(new Crew("skull", CrewType.BACKEND));
            crewRepository.save(new Crew("hui", CrewType.FRONTEND));
            crewRepository.save(new Crew("binyeo", CrewType.FRONTEND));
        }

    }
}

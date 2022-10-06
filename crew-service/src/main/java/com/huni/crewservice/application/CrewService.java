package com.huni.crewservice.application;

import com.huni.crewservice.domain.CrewRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class CrewService {

    private final CrewRepository crewRepository;

    public List<CrewResponse> findAll() {
        return crewRepository.findAll()
                .stream()
                .map(crew -> new CrewResponse(crew.getId(), crew.getName(), crew.getCrewType().name()))
                .collect(Collectors.toList());
    }
}

package com.huni.crewservice.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "crew")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Crew {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(value = EnumType.STRING)
    private CrewType crewType;

    public Crew(final Long id, final String name, final CrewType crewType) {
        this.id = id;
        this.name = name;
        this.crewType = crewType;
    }

    public Crew(final String name, final CrewType crewType) {
        this(null, name, crewType);
    }
}

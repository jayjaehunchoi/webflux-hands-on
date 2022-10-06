package com.huni.webmvc.presentation;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class CrewResponse {

    private Long id;
    private String name;
    private String type;

    public CrewResponse(final Long id, final String name, final String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
}

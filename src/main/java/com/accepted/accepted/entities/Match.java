package com.accepted.accepted.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private LocalDate matchDate;
    private LocalTime matchTime;
    private String teamA;
    private String teamB;

    @Enumerated(EnumType.STRING)
    private Sport sport;
    @JsonIgnore
    @OneToMany(mappedBy = "match", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<MatchOdds> matchOdds;

    public Match(Long id, String description, LocalDate matchDate, LocalTime matchTime, String teamA, String teamB, Sport sport) {
        this.id = id;
        this.description = description;
        this.matchDate = matchDate;
        this.matchTime = matchTime;
        this.teamA = teamA;
        this.teamB = teamB;
        this.sport = sport;
    }

    public Match() {
    }
}

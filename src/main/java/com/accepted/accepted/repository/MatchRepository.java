package com.accepted.accepted.repository;

import com.accepted.accepted.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, Long> {
}
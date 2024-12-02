package com.accepted.accepted.controller;

import com.accepted.accepted.entities.Match;
import com.accepted.accepted.entities.MatchOdds;
import com.accepted.accepted.repository.MatchOddsRepository;
import com.accepted.accepted.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/matches")
public class MatchController {

    @Autowired
    private MatchRepository matchRepository;

    @Autowired
    private MatchOddsRepository matchOddsRepository;

    @PostMapping
    public Match createMatch(@RequestBody Match match) {
        return matchRepository.save(match);
    }

    @GetMapping
    public List<Match> getMatch() {
        return matchRepository.findAll();
    }

    @GetMapping("/{id}")
    public Match getMatch(@PathVariable Long id) {
        return matchRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public Match updateMatch(@PathVariable Long id, @RequestBody Match match) {
        match.setId(id);
        return matchRepository.save(match);
    }

    @DeleteMapping("/{id}")
    public void deleteMatch(@PathVariable Long id) {
        Match match = matchRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        matchRepository.deleteById(id);
    }


    @PostMapping("/{matchId}/odds")
    public MatchOdds createMatchOdds(@PathVariable Long matchId, @RequestBody MatchOdds matchOdds) {
        Match match = matchRepository.findById(matchId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        matchOdds.setMatch(match);
        return matchOddsRepository.save(matchOdds);
    }

    @GetMapping("/{matchId}/odds/{id}")
    public MatchOdds getMatchOdds(@PathVariable Long matchId, @PathVariable Long id) {
        return matchOddsRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}

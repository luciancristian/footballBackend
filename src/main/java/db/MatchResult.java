package db;

import java.util.Set;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Entity
@Component
public class MatchResult {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String team1;
    private String team2;
    private int goalsTeam1;
    private int goalsTeam2;

    @OneToMany(mappedBy = "matchResult")
    private Set<Pronostic> pronostics;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public int getGoalsTeam1() {
        return goalsTeam1;
    }

    public void setGoalsTeam1(int goalsTeam1) {
        this.goalsTeam1 = goalsTeam1;
    }

    public int getGoalsTeam2() {
        return goalsTeam2;
    }

    public void setGoalsTeam2(int goalsTeam2) {
        this.goalsTeam2 = goalsTeam2;
    }

    public Set<Pronostic> getPronostics() {
        return pronostics;
    }

    public void setPronostics(Set<Pronostic> pronostics) {
        this.pronostics = pronostics;
    }
}

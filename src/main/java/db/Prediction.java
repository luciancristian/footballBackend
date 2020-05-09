package db;

import javax.persistence.*;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Component
//@Table(uniqueConstraints={@UniqueConstraint(columnNames = {"user_id" , "matchResult_id"})})
public class Prediction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String team1;
    private String team2;

    private int goalsTeam1;
    private int goalsTeam2;

    @JsonIgnore
    @ManyToOne
    //@JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    //@JoinColumn(name="matchResult_id")
    private MatchResult matchResult;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public MatchResult getMatchResult() {
        return matchResult;
    }

    public void setMatchResult(MatchResult matchResult) {
        this.matchResult = matchResult;
    }
}

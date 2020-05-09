package db;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
@Component
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;

    private String email;

    private String password;


    @OneToMany(mappedBy="user", cascade = CascadeType.ALL)
    //@JoinColumn(name = "userPronostics_fk", referencedColumnName = "id")
    private Set<Prediction> predictions;

    private int points;
    
    public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Prediction> getPredictions() {
        return predictions;
    }

    public void setPredictions(Set<Prediction> predictions) {
        this.predictions = predictions;
    }
}

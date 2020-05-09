package interfaces;

import db.MatchResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IResultRepo extends JpaRepository <MatchResult, Integer>
{
}

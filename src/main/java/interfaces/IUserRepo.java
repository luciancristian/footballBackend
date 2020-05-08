package interfaces;

import db.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository <User, Integer>
{
}

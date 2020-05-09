package interfaces;

import db.Prediction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPredictionRepo extends JpaRepository <Prediction, Integer>
	{

}


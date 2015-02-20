package rock;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Repository
public class Dao {
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void saveBottle(Bottle bottle) {
		em.persist(bottle);
	}
}
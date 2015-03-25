package rock;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class Dao {
	
	public Dao() {
		// TODO Auto-generated constructor stub
	}
	
	public Dao(String a, int b) {
		System.out.println("a is " + a + ", b " + b);
	} 
	
	@PersistenceContext
	private EntityManager em;
	
	public void saveBottle(Bottle bottle) {
		em.persist(bottle);
	}
}
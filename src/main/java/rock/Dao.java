package rock;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class Dao {

	public Dao() {
		System.out.println("dao constructor");
	}

	public void init() {
		System.out.println("init stuff in dao");
	}
	
	public Dao(String a, int b) {
		System.out.println("a is " + a + ", b " + b);
	}

	@PersistenceContext
	private EntityManager em;

	public void saveBottle(Bottle bottle) throws Exception {
		em.persist(bottle);
		throw new Exception();
	}
}
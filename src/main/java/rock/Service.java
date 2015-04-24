package rock;

import javax.inject.Inject;

import org.springframework.transaction.annotation.Transactional;

public class Service {

	@Inject
	private Dao dao;

	@Transactional(rollbackFor = Exception.class)
	public void saveBottle(Bottle bottle) {
		try {
			dao.saveBottle(bottle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void init() {
		System.out.println("init method from service");
	}
	
	public Service() {
		System.out.println("Constructor from service");
	}
}

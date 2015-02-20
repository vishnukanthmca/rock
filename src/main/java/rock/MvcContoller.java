package rock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcContoller {

	@Autowired
	private Dao dao;
	
	@RequestMapping("/index")
	public String welcome() {

		Bottle bottle = new Bottle();
		bottle.setCompany("Mannar and Co");
		dao.saveBottle(bottle);
		
		return "hello";
	}
}

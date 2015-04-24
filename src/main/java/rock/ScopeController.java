package rock;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ScopeController {

	public ScopeController() {
		
	}
	
	@Inject
	private Dao dao;
	
	public ScopeController(String a, String b) {
		System.out.println("a is set " + a + " " + b);
	}

	@Autowired
	private Service service;

	@RequestMapping("/scope")
	public String welcome()  {

		Bottle bottle = new Bottle();
		bottle.setCompany("javax transaction");

		try {
			service.saveBottle(bottle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "hello";
	}
}

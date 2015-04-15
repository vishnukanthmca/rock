package rock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcContoller {

	public MvcContoller() {
		
	}
	
	public MvcContoller(String a, String b) {
		System.out.println("a is set " + a + " " + b);
	}

	@Autowired
	private Service service;

	@RequestMapping("/index")
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

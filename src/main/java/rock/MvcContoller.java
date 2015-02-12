package rock;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcContoller {

	@RequestMapping("/index")
	public String welcome() {

		return "hello";
	}
}

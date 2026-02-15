package royalbengalai.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String root() {
		return "redirect:/home";
	}

	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("storeName", "Royal Bengal AI Store");
		model.addAttribute("tagline", "Premium Tech & AI Solutions");
		return "index";
	}
}

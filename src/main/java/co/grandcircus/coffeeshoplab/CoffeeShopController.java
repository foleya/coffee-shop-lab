package co.grandcircus.coffeeshoplab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeShopController {

	@RequestMapping("/")
	public ModelAndView showHomePage() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	@RequestMapping("/register")
	public ModelAndView showFormPage() {
		ModelAndView mav = new ModelAndView("register");
		return mav;
	}

	@RequestMapping("/summary")
	public ModelAndView showSummaryPage(
			@RequestParam("first-name") String firstName,
			@RequestParam("last-name") String lastName,
			@RequestParam("email") String emailAddress,
			@RequestParam("phone") String phoneNumber,
			@RequestParam("password") String password
	) {
		ModelAndView mav = new ModelAndView("summary");
		mav.addObject("first_name", firstName);
		return mav;
	}
	
	
}

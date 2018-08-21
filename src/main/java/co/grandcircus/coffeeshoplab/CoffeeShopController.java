package co.grandcircus.coffeeshoplab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

	@RequestMapping(value="/summary", method=RequestMethod.POST)
	public ModelAndView showSummaryPage(User user) {
		ModelAndView mav = new ModelAndView("summary");
		mav.addObject("user", user);
		return mav;
	}
	
	
}

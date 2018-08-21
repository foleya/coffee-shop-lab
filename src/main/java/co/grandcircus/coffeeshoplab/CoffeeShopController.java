package co.grandcircus.coffeeshoplab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeShopController {
	
	@Autowired
	private UsersDao usersDao;
	
	@Autowired
	private ItemsDao itemsDao;

	@RequestMapping("/")
	public ModelAndView index() {
		List<Item> items = itemsDao.findAll();
		return new ModelAndView("index", "items", items);
	
	}
	
	@RequestMapping("/register")
	public ModelAndView showFormPage() {
		ModelAndView mav = new ModelAndView("register");
		return mav;
	}
	
	@RequestMapping("/create-user")
	public ModelAndView createUser(User user) {
		usersDao.createUser(user);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value="/summary")
	public ModelAndView showSummaryPage(User user) {
		ModelAndView mav = new ModelAndView("summary");
		mav.addObject("user", user);
		return mav;
	}
	
}

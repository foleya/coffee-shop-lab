package co.grandcircus.coffeeshoplab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.coffeeshoplab.dao.ItemDao;
import co.grandcircus.coffeeshoplab.dao.UserDao;
import co.grandcircus.coffeeshoplab.entity.Item;
import co.grandcircus.coffeeshoplab.entity.User;

@Controller
public class CoffeeShopController {

	@Autowired
	private UserDao userDao;

	@Autowired
	private ItemDao itemDao;

	@RequestMapping("/")
	public ModelAndView index(@RequestParam(value="keyword", required=false) String keyword) {
		ModelAndView mav = new ModelAndView("index");
		
		if (keyword != null && !keyword.isEmpty()) {
			mav.addObject("items", itemDao.findByKeyword(keyword));
		} else {
			mav.addObject("items", itemDao.findAll());
		}
		
		return mav;
	}

	// User Registration, ETC.
	// TODO: simplify using RequestMethod.POST
	@RequestMapping("/register")
	public ModelAndView showFormPage() {
		ModelAndView mav = new ModelAndView("register");
		return mav;
	}

	@RequestMapping("/create-user")
	public ModelAndView createUser(User user) {
		userDao.createUser(user);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value = "/summary")
	public ModelAndView showSummaryPage(User user) {
		ModelAndView mav = new ModelAndView("summary");
		mav.addObject("user", user);
		return mav;
	}
	
	// Creating Items
	@RequestMapping("/item/create")
	public ModelAndView showCreateForm() {
		return new ModelAndView("item-form", "title", "Add Item");
	}
	
	@RequestMapping(value = "/item/create", method = RequestMethod.POST)
	public ModelAndView submitCreateForm(Item item) {
		itemDao.createItem(item);
		return new ModelAndView("redirect:/");
	}

	// Editing Items
	@RequestMapping("/item/{itemId}/update")
	public ModelAndView showEditForm(@PathVariable("itemId") int itemId) {
		ModelAndView mav = new ModelAndView("item-form");
		mav.addObject("item", itemDao.findById(itemId));
		mav.addObject("title", "Edit Item");
		return mav;
	}

	@RequestMapping(value = "/item/{id}/update", method = RequestMethod.POST)
	public ModelAndView submitEditForm(Item item, @PathVariable("id") int itemId) {
		item.setItemId(itemId);
		itemDao.update(item);
		return new ModelAndView("redirect:/");
	}
	
	// Deleting Items
	@RequestMapping("/delete-item/{itemId}")
	public ModelAndView deleteItem(@PathVariable("itemId") int itemId) {
		itemDao.deleteItem(itemId);
		return new ModelAndView("redirect:/");
	}

}

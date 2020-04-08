package springmvc.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.model.User;

@Controller
public class RegisterController {

 @RequestMapping("/register")
		public ModelAndView register(  @ModelAttribute User UserObj) {
		
			System.out.println("name" +UserObj.getUserName());
			ModelAndView mv = new ModelAndView();
			return mv;

		}
}

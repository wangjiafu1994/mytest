package per.wjf.bibased.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import per.wjf.bibased.po.User;
import per.wjf.bibased.service.UserService;

@Controller
public class RegisterController {

	
	@Autowired 
	private UserService userService;

	 @RequestMapping(value="/registerpage")
	    public ModelAndView goRegister() throws Exception {
	        ModelAndView mv = new ModelAndView();
	        mv.setViewName("frontpage/register");
	        return mv;
	    }
	
	 @RequestMapping(value="/register")
	    public String register(	Model model, User user) throws Exception {
		 
	        userService.register(user);
	        return "frontpage/signin";
	        
	    }
}

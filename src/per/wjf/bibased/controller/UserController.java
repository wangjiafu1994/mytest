package per.wjf.bibased.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import per.wjf.bibased.po.User;
import per.wjf.bibased.service.UserService;

@Controller
public class UserController {


	@Autowired
	private UserService userService;
	
	@RequestMapping("/getuser")
	public String  getUser(HttpSession session,HttpServletRequest request,Model model,User user)throws Exception
	{
		user=(User) request.getSession().getAttribute("user");
		model.addAttribute("user", user);
		return "frontpage/user";
	}
	
	@RequestMapping("/modifyuser")
	public String  modifyUser(HttpSession session,HttpServletRequest request,Model model,Integer id,User user)throws Exception
	{
		userService.updateUser(user);
		session.setAttribute("user", user);
		return "frontpage/homepage";
	}
}

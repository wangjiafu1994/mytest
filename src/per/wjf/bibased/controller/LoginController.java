package per.wjf.bibased.controller;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import per.wjf.bibased.util.*;
import per.wjf.bibased.controller.*;
import per.wjf.bibased.service.UserService;
import per.wjf.bibased.po.*;


@Controller
public class LoginController {
	
	@Autowired 
	private UserService userService;

	
	//跳转到登录界面
	 @RequestMapping(value="/signin")
	    public ModelAndView goSigin() throws Exception {
	        ModelAndView mv = new ModelAndView();
	        mv.setViewName("frontpage/signin");
	        return mv;
	    }
	 
	 //登录
	 @RequestMapping(value="/login")
		public String login(HttpSession session,HttpServletRequest request, String  username, String password)
				throws Exception {
           username=request.getParameter("username");
           password=request.getParameter("password");
		   User user= (User) userService.checkLogin(username, password);
	         if(user!=null){
	        	 MyCart myCart =new MyCart();
	        	session.setAttribute("myCart", myCart);
	        	session.setAttribute("user", user);
	        	return "forward:goindex.action";           
	         }
			// return "success";
		  return "frontpage/signin";  
		}
	 
	 
	 //登出
	 @RequestMapping(value="/signout")
	    public String  goSigout(HttpSession session,User user) throws Exception {
		 if (session.getAttribute("user")==null) {
			 return "frontpage/homepage";
		}
		 session.removeAttribute("user");
		   session.invalidate();
	        return "frontpage/homepage";
	    }
	 
	    }
	 
		
	 
	 

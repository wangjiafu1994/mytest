package per.wjf.bibased.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import per.wjf.bibased.po.Admin;
import per.wjf.bibased.po.User;
import per.wjf.bibased.service.AdminService;
import per.wjf.bibased.service.UserService;

@Controller
public class BackloginController {

	
	@Autowired 
	private AdminService adminService;

	
	//跳转到登录界面
	 @RequestMapping(value="/backsigninpage")
	    public ModelAndView goSigin() throws Exception {
	        ModelAndView mv = new ModelAndView();
	        mv.setViewName("system/index/login");
	        return mv;
	    }
	 
	 //登录
	 @RequestMapping(value="/backlogin")
		public String backlogin(HttpSession session,HttpServletRequest request, String name, String password)
				throws Exception {
		   name=request.getParameter("name");
           password=request.getParameter("password");
		   Admin admin= adminService.checkBackLogin(name, password);
	         if(admin!=null){
	        	session.setAttribute("admin", admin);
	        	return "forward:main.action";           
	         }
			// return "success";
		  return "system/index/login";  
		}
	 
	 
	 //登出
//	 @RequestMapping(value="/signout")
//	    public String  goSigout(HttpSession session,User user) throws Exception {
//		 if (session.getAttribute("user")==null) {
//			 return "frontpage/homepage";
//		}
//		 session.removeAttribute("user");
//		   session.invalidate();
//	        return "frontpage/homepage";
//	    }
//	 
	 
	 
}

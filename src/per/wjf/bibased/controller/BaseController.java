package per.wjf.bibased.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import per.wjf.bibased.util.*;;

@Controller
public class BaseController {

	@RequestMapping(value="/goconnect")
	public ModelAndView goConnect() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("frontpage/connect");
		return mv;
	}
	
	@RequestMapping(value="/goshopping")
	public ModelAndView goShopping() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("frontpage/shopping");
		return mv;
	}
	
	//首页
		@RequestMapping(value="/goindex")
		public ModelAndView goIndex() throws Exception {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("frontpage/homepage");
			return mv;
		}
		
		//店铺简介
		 @RequestMapping(value="/introduction")
		    public ModelAndView goIntroduction() throws Exception {
		        ModelAndView mv = new ModelAndView();
		        mv.setViewName("frontpage/introduction");
		        return mv;
		    }
		 
		 @RequestMapping(value="/backcompany")
		    public ModelAndView backcompany() throws Exception {
		        ModelAndView mv = new ModelAndView();
		        mv.setViewName("system/index/company");
		        return mv;
		    }
		 
		 @RequestMapping(value="/backorder")
		    public ModelAndView backorder() throws Exception {
		        ModelAndView mv = new ModelAndView();
		        mv.setViewName("system/index/backorder");
		        return mv;
		    }
		 
		 @RequestMapping(value="/backrule")
		    public ModelAndView backrule() throws Exception {
		        ModelAndView mv = new ModelAndView();
		        mv.setViewName("system/index/rule");
		        return mv;
		    }
		 
		 @RequestMapping(value="/backpro")
		    public ModelAndView backpro() throws Exception {
		        ModelAndView mv = new ModelAndView();
		        mv.setViewName("system/index/pro");
		        return mv;
		    }
		 
		 
}

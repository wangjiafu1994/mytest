package per.wjf.bibased.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BackController {
	
	
	@RequestMapping("/main")
	public ModelAndView index(){
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("system/index/main");
		return mv;
	}
	
	
	

}

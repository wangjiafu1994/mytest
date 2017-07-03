package per.wjf.bibased.controller;

import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import per.wjf.bibased.po.GoodsCustom;
import per.wjf.bibased.po.Integraldetail;
import per.wjf.bibased.po.Myorder;
import per.wjf.bibased.po.Orderdetail;
import per.wjf.bibased.po.User;
import per.wjf.bibased.service.GoodsService;
import per.wjf.bibased.service.IntegralService;
import per.wjf.bibased.service.OrderService;
import per.wjf.bibased.service.UserService;

@Controller
public class IntegralContoller {

	@Autowired
	private OrderService orderService;
	
	@Autowired
	private IntegralService integralService;

	@Autowired
	private UserService userService;
	
	@Autowired
	private GoodsService goodsService;
	
	@RequestMapping("/integraldetail")
	public String integralDetail(Model model, HttpServletRequest request, HttpSession session, Integer id)
			throws Exception {

		User user = (User) request.getSession().getAttribute("user");
		List<Integraldetail> integraldetail = integralService.findIntegralByUserid(user.getId());

		model.addAttribute("integraldetail", integraldetail);

		return "frontpage/integral";
	}

	@RequestMapping("/exchange")
	public String exchange(Model model, HttpServletResponse response, HttpServletRequest request,
			HttpSession session, Integer integral,Integer id) throws Exception {

		User user = (User) request.getSession().getAttribute("user");
		GoodsCustom goodsCustom = goodsService.findGoodsById(id);
		model.addAttribute("goodsCustom", goodsCustom);
		
		return "frontpage/preexchange";
	}
	
	@RequestMapping("/outintegral")
	public String outIntegral(Model model, HttpServletResponse response, HttpServletRequest request,
			HttpSession session, Integer integral,GoodsCustom goodsCustom,Integer id) throws Exception {

		User user = (User) request.getSession().getAttribute("user");
		
		Myorder myorder = new Myorder();
		myorder.setUserid(user.getId());
		myorder.setSumprice(goodsCustom.getGoodsprice());
		myorder.setCreatetime(new Date());
		orderService.addOrder(myorder);
		
		myorder=orderService.findLastOrder();
		
		 Orderdetail orderdetail = new Orderdetail();
		 orderdetail.setGoodsid(id);
		 orderdetail.setOrderid(myorder.getId());
		 orderdetail.setNums(goodsCustom.getShoppingNum());
		 orderService.addOrderDetail(orderdetail);
		
		Integraldetail integraldetail = new Integraldetail();
		integraldetail.setUserid(user.getId());
		integraldetail.setIntegral(integral);
		integraldetail.setType("兑换扣除");
		integraldetail.setTime(new Date());
		integraldetail.setOrderid(myorder.getId());
		integralService.addIntegral(integraldetail);
		
			integral = user.getTotalintegral() - integral;
			user.setTotalintegral(integral);
			userService.updateUser(user);	
		return "forward:integralgoods.action";      
		
	}

}

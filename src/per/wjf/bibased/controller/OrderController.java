package per.wjf.bibased.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import per.wjf.bibased.po.Goods;
import per.wjf.bibased.po.GoodsCustom;
import per.wjf.bibased.po.GoodsVo;
import per.wjf.bibased.po.Integraldetail;
import per.wjf.bibased.po.Myorder;
import per.wjf.bibased.po.Order;
import per.wjf.bibased.po.OrderCustom;
import per.wjf.bibased.po.OrderVo;
import per.wjf.bibased.po.Orderdetail;
import per.wjf.bibased.po.User;
import per.wjf.bibased.service.IntegralService;
import per.wjf.bibased.service.OrderService;
import per.wjf.bibased.service.UserService;

@Controller
public class OrderController {

	@Autowired
	private OrderService orderService;

	@Autowired
	private UserService userService;
	
	@Autowired
	private IntegralService integralService;

	@RequestMapping("/preorder")
	public String goPreorder(Model model, HttpServletRequest request, HttpSession session, Integer id)
			throws Exception {

		User user = (User) request.getSession().getAttribute("user");
		MyCart myCart = (MyCart) request.getSession().getAttribute("myCart");
		model.addAttribute("user", user);
		model.addAttribute("goodsList", myCart.showMyCart());
		model.addAttribute("totalPrice", myCart.getTotalPrice());
		return "frontpage/preorder";
	}

	@RequestMapping("/showcart")
	public String showCart(Model model, HttpServletRequest request, HttpSession session, Integer id) throws Exception {

		User user = (User) request.getSession().getAttribute("user");
		MyCart myCart = (MyCart) request.getSession().getAttribute("myCart");
		model.addAttribute("user", user);
		model.addAttribute("goodsList", myCart.showMyCart());
		model.addAttribute("totalPrice", myCart.getTotalPrice());
		return "frontpage/goodscart";
	}

	@RequestMapping("/createorder")
	public String goOrder(Model model, HttpServletRequest request, HttpServletResponse response,HttpSession session, Integer id)
			throws Exception {
		
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		User user = (User) request.getSession().getAttribute("user");
		MyCart myCart = (MyCart) request.getSession().getAttribute("myCart");
		int totalPrice = myCart.getTotalPrice();

		Myorder myorder = new Myorder();
		myorder.setUserid(user.getId());
		myorder.setSumprice(totalPrice);
		myorder.setCreatetime(new Date());
		int integral = (int) (totalPrice * 0.2);
		myorder.setHavaintegral(integral);
		myorder.setIsorder("未接单");
		orderService.addOrder(myorder);
		
	
		myorder=orderService.findLastOrder();

		Integraldetail integraldetail = new Integraldetail();
		integraldetail.setUserid(user.getId());
		integraldetail.setIntegral(integral);
		integraldetail.setType("消费获得");
		integraldetail.setTime(new Date());
		integraldetail.setOrderid(myorder.getId());
		integralService.addIntegral(integraldetail);
		
		integral = integral + user.getTotalintegral();
		user.setTotalintegral(integral);
		userService.updateUser(user);
		

		List<GoodsCustom> goodsList = myCart.showMyCart();
		for (GoodsCustom goodsone : goodsList) {
			 Orderdetail orderdetail = new Orderdetail();
			 orderdetail.setGoodsid(goodsone.getId());
			 orderdetail.setNums(goodsone.getShoppingNum());
			 orderdetail.setOrderid(myorder.getId());
			 orderService.addOrderDetail(orderdetail);
		}

		model.addAttribute("user", user);
		model.addAttribute("totalPrice", totalPrice);
		model.addAttribute("myorder", myorder);
		return "frontpage/order";
	}

	@RequestMapping("/orderinfo")
	public String goOrderinfo(Model model, HttpServletRequest request, HttpSession session, Integer id) throws Exception {

		User user = (User) request.getSession().getAttribute("user");
		MyCart myCart = (MyCart) request.getSession().getAttribute("myCart");
		
		int totalPrice = myCart.getTotalPrice();
		Myorder myorder =orderService.findLastOrder();
		List<GoodsCustom> goodsList = myCart.showMyCart();

		model.addAttribute("user", user);
	    model.addAttribute("goodsList", goodsList);
		model.addAttribute("totalPrice", totalPrice);
		model.addAttribute("myorder", myorder);
		myCart.clearCart();
		return "frontpage/orderinfo";
	}
	
	@RequestMapping("/orderlist")
	public String OrderList(Model model, HttpServletRequest request, HttpSession session, Integer id) throws Exception {

		User user=(User) request.getSession().getAttribute("user");
		int userid=user.getId();
		OrderVo orderVo =new OrderVo();
		List<Myorder> orderlist=orderService.findOrderList(userid);
		model.addAttribute("orderlist", orderlist);
		model.addAttribute("user", user);
		return "frontpage/orderlist";
	}
	
	@RequestMapping("/orderlistinfo")
	public String OrderListInfo(Model model, HttpServletRequest request, HttpSession session, Integer orderid,String type) throws Exception {

		User user = (User) request.getSession().getAttribute("user");
		List<Goods> goodsList =(List<Goods>) orderService.findOrderInfo(orderid);
        Myorder myorder = orderService.findOrderById(orderid);
        List<GoodsCustom> goodsCustomslist=orderService.findOrderdetailInfo(orderid);
		model.addAttribute("user", user);
	    model.addAttribute("goodsList", goodsCustomslist);
		model.addAttribute("myorder", myorder);
		return "frontpage/orderlistinfo";
	}
	

	@RequestMapping("/backorderlist")
	public String backorderlist(Model model, HttpServletRequest request, HttpSession session, Integer orderid,String type) throws Exception {

		List<OrderCustom> orderCustoms=orderService.findorder();
       
		model.addAttribute("orderCustoms", orderCustoms);
		
		return "system/index/backorder";
	}
	
	@RequestMapping("/editorder")
	public String editOrder(Model model,@RequestParam(value="id") Integer id) throws Exception{
		return "forward:backorderlist.action";
		
		
	}
	
	
	
}

package per.wjf.bibased.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import per.wjf.bibased.po.GoodsCustom;
import per.wjf.bibased.service.GoodsService;

@Controller
public class CartController {

	@Autowired
	private GoodsService goodsService;

	@RequestMapping("/mycart.action")
	public String getMycart(Model model, HttpServletRequest request, HttpServletResponse response,HttpSession session, Integer id) throws Exception {

		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
        if(request.getSession().getAttribute("user")==null){
		
	response.getWriter().write("<script>alert('请先登录');location.href='signin.action';</script>");

		}
        
		MyCart myCart = (MyCart) request.getSession().getAttribute("myCart");
		GoodsCustom goodsCustom = goodsService.findGoodsById(id);
		// model.addAttribute("goodsCustom",goodsCustom);
		myCart.addBook(id, goodsCustom);
		List<GoodsCustom> goodsList = myCart.showMyCart();
		int totalPrice = myCart.getTotalPrice();
		model.addAttribute("goodsList", goodsList);
		model.addAttribute("totalPrice", totalPrice);
		return "frontpage/goodscart";
	}

	@RequestMapping("/delgoods.action")
	public String delGoods(Model model, HttpServletRequest request, HttpSession session, Integer id) throws Exception {

		MyCart myCart = (MyCart) request.getSession().getAttribute("myCart");
		myCart.del(id);
		List<GoodsCustom> goodsList = myCart.showMyCart();
		int totalPrice = myCart.getTotalPrice();
		model.addAttribute("goodsList", goodsList);
		model.addAttribute("totalPrice", totalPrice);
		return "frontpage/goodscart";

	}

	@RequestMapping("/cleargoods.action")
	public String clearGoods(Model model, HttpServletRequest request, HttpSession session, Integer id,Integer num) throws Exception {

		MyCart myCart = (MyCart) request.getSession().getAttribute("myCart");
		myCart.del(id);
		List<GoodsCustom> goodsList = myCart.showMyCart();
		int totalPrice = myCart.getTotalPrice();
		model.addAttribute("goodsList", goodsList);
		model.addAttribute("totalPrice", totalPrice);
		return "frontpage/goodscart";

	}
	
	
	@RequestMapping("/updategoods.action")
	public String updateGoods(Model model, HttpServletRequest request, HttpSession session, Integer id) throws Exception {

		MyCart myCart = (MyCart) request.getSession().getAttribute("myCart");
		myCart.del(id);
		List<GoodsCustom> goodsList = myCart.showMyCart();
		int totalPrice = myCart.getTotalPrice();
		model.addAttribute("goodsList", goodsList);
		model.addAttribute("totalPrice", totalPrice);
		return "frontpage/goodscart";

	}
}

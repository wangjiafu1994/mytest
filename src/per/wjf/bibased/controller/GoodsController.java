package per.wjf.bibased.controller;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.sun.org.apache.xpath.internal.operations.Mod;

import per.wjf.bibased.po.Goods;
import per.wjf.bibased.po.GoodsCustom;
import per.wjf.bibased.po.GoodsVo;
import per.wjf.bibased.service.GoodsService;

@Controller
public class GoodsController {
	
	@Autowired
	private GoodsService goodsService;

	@RequestMapping("/backgoodslist")
	public ModelAndView goBackgoodslist(HttpServletRequest request,GoodsVo goodsVo) throws Exception {

		//System.out.println(request.getParameter("id"));

		List<GoodsCustom> goodsList = goodsService.findGoodsList(goodsVo);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("goodsList", goodsList);

		// modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		modelAndView.setViewName("system/index/backgoods");

		return modelAndView;

	}
	
	@RequestMapping("/goodslist")
	public ModelAndView goGoodslist(HttpServletRequest request,HttpSession session,GoodsVo goodsVo) throws Exception {

		//System.out.println(request.getParameter("id"));
		

		List<GoodsCustom> goodsList = goodsService.findGoodsList(goodsVo);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("goodsList", goodsList);

		// modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		modelAndView.setViewName("frontpage/goods");
		
		return modelAndView;
	}
	
	@RequestMapping("/integralgoods")
	public ModelAndView goIntegralgoods(HttpServletRequest request,GoodsVo goodsVo) throws Exception {

		//System.out.println(request.getParameter("id"));

		List<GoodsCustom> goodsList = goodsService.findGoodsList(goodsVo);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("goodsList", goodsList);

		// modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		modelAndView.setViewName("frontpage/integralgoods");

		return modelAndView;

	}
	
	@RequestMapping("/editgoods")
	public String editGoods(Model model,@RequestParam(value="id") Integer id) throws Exception{
		
		GoodsCustom goodsCustom = goodsService.findGoodsById(id);
		model.addAttribute("goodsCustom",goodsCustom);
		return "system/index/goods_edit";
	}
	
	
	@RequestMapping("/editgoodssubmit")
	public String editGoodsSubmit(HttpServletRequest request,Integer id,GoodsCustom goodsCustom,MultipartFile goods_pic) throws  Exception
	{
		
		String originalFilename = goods_pic.getOriginalFilename();
           if(goods_pic!=null && originalFilename!=null && originalFilename.length()>0){
			
			String pic_path = "E:\\bibased\\upload\\goods\\";
			
			
			String newFileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
			File newFile = new File(pic_path+newFileName);
			
			goods_pic.transferTo(newFile);
			
			goodsCustom.setPic(newFileName);
			
		}
		goodsService.updateGoods(id, goodsCustom);
		return "forward:backgoodslist.action";
	}
	

	
	@RequestMapping("/deletegoods")
	public String deleteGoods(Integer id) throws Exception {

		goodsService.deletGoods(id);
		return "forward:backgoodslist.action";

	}
	
	@RequestMapping("/addgoods")
	public String addeGoods(Integer id,Goods goods) throws Exception {

	
		return "system/index/goods_add";
		
	}
	
	@RequestMapping("/addgoodssubmit")
	public String addeGoodsSubmit(Integer id,Goods goods,MultipartFile goods_pic) throws Exception {

		String originalFilename = goods_pic.getOriginalFilename();
        if(goods_pic!=null && originalFilename!=null && originalFilename.length()>0){
			
			String pic_path = "E:\\bibased\\upload\\goods\\";
			
			
			String newFileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
			File newFile = new File(pic_path+newFileName);
			
			goods_pic.transferTo(newFile);
			
			goods.setPic(newFileName);
			}
		goodsService.addGoods(goods);;
		return "forward:backgoodslist.action";

	}
	
	
	
	@RequestMapping("/editgoodsquery")
	public ModelAndView editGoodsQuery(HttpServletRequest request,
			GoodsVo goodsVo) throws Exception {

		List<GoodsCustom> goodsList = goodsService.findGoodsList(goodsVo);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("goodsList", goodsList);

		modelAndView.setViewName("frontpage/editgoodsquery");

		return modelAndView;

	}
	
	
	@RequestMapping("/editgoodsallsubmit")
	public String editGoodsAllSubmit(GoodsVo GoodsVo)
			throws Exception {

		return "success";
	}
	
	@ModelAttribute("goodstypes")
	public Map<String, String> getItemTypes() {

		Map<String, String> goodstypes = new HashMap<String, String>();
		goodstypes.put("101", "鏁扮爜");
		goodstypes.put("102", "姣嶅┐");

		return goodstypes;
	}
	

	
	@RequestMapping("/cart")
	public String goCart(GoodsVo GoodsVo)
			throws Exception {

		//return "system/index/model";
		//return "system/index/pro";
		//return "system/index/rule";
		//return"frontpage/shop_line";
		return"frontpage/cart";
	}
	
	@RequestMapping("/querygoods")
	public ModelAndView queryGoods(HttpServletRequest request,
			GoodsVo goodsVo) throws Exception {
		// 测试forward后request是否可以共享

		//System.out.println(request.getParameter("id"));

		// 调用service查找 数据库，查询商品列表
		List<GoodsCustom> goodsList = goodsService.findGoodsList(goodsVo);

		// 返回ModelAndView 
		ModelAndView modelAndView = new ModelAndView();
		// 相当 于request的setAttribut，在jsp页面中通过itemsList取数据
		modelAndView.addObject("goodsList", goodsList);

		// 指定视图
		// 下边的路径，如果在视图解析器中配置jsp路径的前缀和jsp路径的后缀，修改为
		// modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		// 上边的路径配置可以不在程序中指定jsp路径的前缀和jsp路径的后缀
		modelAndView.setViewName("frontpage/goods");
		return modelAndView;

	}
	
	
	
}

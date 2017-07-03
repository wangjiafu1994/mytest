package per.wjf.bibased.controller;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

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
import com.sun.org.glassfish.gmbal.ManagedAttribute;

import per.wjf.bibased.po.Goods;
import per.wjf.bibased.po.GoodsCustom;
import per.wjf.bibased.po.GoodsVo;
import per.wjf.bibased.service.GoodsService;

@Controller
public class OdlController {
	
	@Autowired
	private GoodsService goodsService;

	
//	@RequestMapping("/querygoods")
//	public ModelAndView queryGoods(HttpServletRequest request,
//			GoodsVo goodsVo) throws Exception {
//		// 测试forward后request是否可以共享
//
//		//System.out.println(request.getParameter("id"));
//
//		// 调用service查找 数据库，查询商品列表
//		List<GoodsCustom> goodsList = goodsService.findGoodsList(null);
//
//		// 返回ModelAndView 
//		ModelAndView modelAndView = new ModelAndView();
//		// 相当 于request的setAttribut，在jsp页面中通过itemsList取数据
//		modelAndView.addObject("goodsList", goodsList);
//
//		// 指定视图
//		// 下边的路径，如果在视图解析器中配置jsp路径的前缀和jsp路径的后缀，修改为
//		// modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
//		// 上边的路径配置可以不在程序中指定jsp路径的前缀和jsp路径的后缀
//		modelAndView.setViewName("frontpage/goodsList");
//
//		return modelAndView;
//
//	}
//	
//	
//	@RequestMapping("/editgoods")
//	public ModelAndView editGoods() throws Exception{
//		
//		GoodsCustom goodsCustom = goodsService.findGoodsById(1);
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.addObject("goodsCustom",goodsCustom);
//		modelAndView.setViewName("frontpage/editgoods");
//		return modelAndView;
//	}
//	
//	@RequestMapping("/editgoodssubmit")
//	public ModelAndView editGoodsSubmit() throws  Exception
//	{
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("success");
//		
//		return modelAndView;
//
//	}
//	
//	@RequestMapping("/editgoods")
//	public String editGoods(Model model,@RequestParam(value="id") Integer id) throws Exception{
//		
//		GoodsCustom goodsCustom = goodsService.findGoodsById(id);
//		model.addAttribute("goodsCustom",goodsCustom);
//		return "frontpage/editgoods";
//	}
//	
//	@RequestMapping("/editgoodssubmit")
//	public String editGoodsSubmit(HttpServletRequest request,Integer id,GoodsCustom goodsCustom,MultipartFile goods_pic) throws  Exception
//	{
//		
//		String originalFilename = goods_pic.getOriginalFilename();
//           if(goods_pic!=null && originalFilename!=null && originalFilename.length()>0){
//			
//			//存储图片的物理路径
//			String pic_path = "E:\\bibased\\upload\\goods\\";
//			
//			
//			//新的图片名称
//			String newFileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
//			//新图片
//			File newFile = new File(pic_path+newFileName);
//			
//			//将内存中的数据写入磁盘
//			goods_pic.transferTo(newFile);
//			
//			//将新图片名称写到goodsCustom中
//			goodsCustom.setPic(newFileName);
//			
//		}
//		goodsService.updateGoods(id, goodsCustom);
//		return "success";
//	}
//	
//	
//	@RequestMapping("/deletegoods")
//	public String deleteItems(Integer[] goods_id) throws Exception {
//
//		// 调用service批量删除商品
//		// ...
//
//		return "success";
//
//	}
//	
//	
//	@RequestMapping("/editgoodsquery")
//	public ModelAndView editGoodsQuery(HttpServletRequest request,
//			GoodsVo goodsVo) throws Exception {
//
//		// 调用service查找 数据库，查询商品列表
//		List<GoodsCustom> goodsList = goodsService.findGoodsList(goodsVo);
//
//		// 返回ModelAndView
//		ModelAndView modelAndView = new ModelAndView();
//		// 相当 于request的setAttribut，在jsp页面中通过itemsList取数据
//		modelAndView.addObject("goodsList", goodsList);
//
//		modelAndView.setViewName("frontpage/editgoodsquery");
//
//		return modelAndView;
//
//	}
//	
//	
//	@RequestMapping("/editgoodsallsubmit")
//	public String editGoodsAllSubmit(GoodsVo GoodsVo)
//			throws Exception {
//
//		return "success";
//	}
//	
//	@ModelAttribute("goodstypes")
//	public Map<String, String> getItemTypes() {
//
//		Map<String, String> goodstypes = new HashMap<String, String>();
//		goodstypes.put("101", "数码");
//		goodstypes.put("102", "母婴");
//
//		return goodstypes;
//	}
	
//	//删除商品
//	@RequestMapping("/deleteItems")
//	public String deleteItems(Integer[] goods_id) throws Exception {
//
//		// 调用service批量删除商品
//		// ...
//
//		return "success";
//
//	}

	
}

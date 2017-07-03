package per.wjf.bibased.service;

import java.util.List;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

import per.wjf.bibased.po.Goods;
import per.wjf.bibased.po.GoodsCustom;
import per.wjf.bibased.po.GoodsVo;

public interface GoodsService {

	 public List<GoodsCustom> findGoodsList(GoodsVo goodsVo) throws Exception;
	 
	 public GoodsCustom findGoodsById(Integer id) throws Exception;
	 
	 public void updateGoods(Integer id ,GoodsCustom goodsCustom) throws  Exception; 
	 
	 public void deletGoods(Integer id) throws Exception;
	 
	 public void addGoods(Goods goods) throws Exception;
	 
}

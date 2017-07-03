package per.wjf.bibased.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import per.wjf.bibased.po.Goods;
import per.wjf.bibased.po.GoodsCustom;
import sun.net.www.content.image.gif;



public class MyCart {
	
	HashMap<Integer, GoodsCustom> hm=new HashMap<Integer, GoodsCustom>();
	public void addBook(Integer goodsid,GoodsCustom goodsone){
		if (hm.containsKey(goodsid)) {
			GoodsCustom goodsCustom=hm.get(goodsid);
			goodsCustom.setShoppingNum(goodsCustom.getShoppingNum()+1);
		}else{
			hm.put(goodsid, goodsone);
		}		
	}
	
	public List<GoodsCustom> showMyCart(){
		List<GoodsCustom> goodslist=new ArrayList();
		Iterator itertor=hm.keySet().iterator();
		while(itertor.hasNext()){
			Integer key=(Integer) itertor.next();
			GoodsCustom goodsone=hm.get(key);
			goodslist.add(goodsone);
		}
		return goodslist;
	}
	
	public int getTotalPrice()
	{
		int toltalPrice=0;
		Iterator iterator=hm.keySet().iterator();
		while(iterator.hasNext()){
			Integer goodsid=(Integer) iterator.next();
			GoodsCustom goodsone=hm.get(goodsid);
			
			toltalPrice+=goodsone.getGoodsprice()*goodsone.getShoppingNum();
		}
		return toltalPrice;
	}
	
	public void del(Integer goodsid){
		hm.remove(goodsid);
	}
	
	public void clearCart(){
		hm.clear();
	}
}

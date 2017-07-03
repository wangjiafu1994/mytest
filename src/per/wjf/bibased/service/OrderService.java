package per.wjf.bibased.service;


import java.util.List;

import per.wjf.bibased.po.Goods;
import per.wjf.bibased.po.GoodsCustom;
import per.wjf.bibased.po.Myorder;
import per.wjf.bibased.po.OrderCustom;
import per.wjf.bibased.po.OrderVo;
import per.wjf.bibased.po.Orderdetail;

public interface OrderService {
	
	public void  addOrderDetail(Orderdetail orderdetail) throws Exception;
	
	public void addOrder (Myorder myorder)throws Exception;
	
	public Myorder findLastOrder() throws Exception;
	
	public List<Myorder> findOrderList(int userid)throws Exception;

	public List<Goods> findOrderInfo(int orderid)throws Exception;
	
	public Myorder findOrderById(int orderid)throws Exception;
	
	public List<GoodsCustom> findOrderdetailInfo(int orderid)throws Exception;
	
	public List<OrderCustom> findorder() throws Exception;
		
}

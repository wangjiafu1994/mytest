package per.wjf.bibased.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

import per.wjf.bibased.po.Goods;
import per.wjf.bibased.po.GoodsCustom;
import per.wjf.bibased.po.Myorder;
import per.wjf.bibased.po.Order;
import per.wjf.bibased.po.OrderCustom;
import per.wjf.bibased.po.OrderExample;
import per.wjf.bibased.po.OrderVo;

public interface OrderMapperCustom {
   
	public Myorder findLastOrder()throws Exception;
	
	public List<Myorder> findOrderList(int userid)throws Exception;
	
	public List<Goods> findOrderInfo(int orderid)throws Exception;
	
	public List<GoodsCustom> findOrderdetailInfo(int orderid)throws Exception;
	
	public List<OrderCustom> findOrder() throws Exception;
}
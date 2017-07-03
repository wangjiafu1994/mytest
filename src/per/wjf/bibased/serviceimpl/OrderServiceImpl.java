package per.wjf.bibased.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import per.wjf.bibased.mapper.MyorderMapper;
import per.wjf.bibased.mapper.OrderMapper;
import per.wjf.bibased.mapper.OrderMapperCustom;
import per.wjf.bibased.mapper.OrderdetailMapper;
import per.wjf.bibased.po.Goods;
import per.wjf.bibased.po.GoodsCustom;
import per.wjf.bibased.po.Myorder;
import per.wjf.bibased.po.Order;
import per.wjf.bibased.po.OrderCustom;
import per.wjf.bibased.po.OrderVo;
import per.wjf.bibased.po.Orderdetail;
import per.wjf.bibased.service.OrderService;

public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderdetailMapper orderdetailMapper;

	@Autowired
	private MyorderMapper myorderMapper;

	@Autowired
	private OrderMapperCustom orderMapperCustom;

	@Override
	public void addOrderDetail(Orderdetail orderdetail) throws Exception {
		// TODO Auto-generated method stub
		orderdetailMapper.insert(orderdetail);

	}

	@Override
	public void addOrder(Myorder myorder) throws Exception {
		// TODO Auto-generated method stub
		myorderMapper.insert(myorder);

	}

	
	@Override
	public Myorder findLastOrder() throws Exception {
		return orderMapperCustom.findLastOrder();
		// TODO Auto-generated method stub
		

	}

	@Override
	public List<Myorder> findOrderList(int userid) throws Exception {
		// TODO Auto-generated method stub
		return orderMapperCustom.findOrderList(userid);
	}

	@Override
	public List<Goods> findOrderInfo(int orderid) throws Exception {
		// TODO Auto-generated method stub
		return orderMapperCustom.findOrderInfo(orderid);
	}

	@Override
	public Myorder findOrderById(int orderid) throws Exception {
		// TODO Auto-generated method stub
		return myorderMapper.selectByPrimaryKey(orderid);
	}

	@Override
	public List<GoodsCustom> findOrderdetailInfo(int orderid) throws Exception {
		// TODO Auto-generated method stub
		return orderMapperCustom.findOrderdetailInfo(orderid);
	}

	@Override
	public List<OrderCustom> findorder() throws Exception {
		// TODO Auto-generated method stub
		return orderMapperCustom.findOrder();
	}
	


	
	
		
	

}

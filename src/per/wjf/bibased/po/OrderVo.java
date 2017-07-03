package per.wjf.bibased.po;

public class OrderVo {
	
	private Myorder myorder;
	private Orderdetail orderdetail;
	private User user;
	private Goods goods;
	
	public Myorder getMyorder() {
		return myorder;
	}
	public void setMyorder(Myorder myorder) {
		this.myorder = myorder;
	}
	public Orderdetail getOrderdetail() {
		return orderdetail;
	}
	public void setOrderdetail(Orderdetail orderdetail) {
		this.orderdetail = orderdetail;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	
	
}

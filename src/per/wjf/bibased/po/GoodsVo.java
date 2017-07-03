package per.wjf.bibased.po;

import java.util.List;

public class GoodsVo {

	private Goods goods;
	private GoodsCustom goodsCustom;
	private List<GoodsCustom> goodsList;
	
	public List<GoodsCustom> getGoodsList() {
		return goodsList;
	}
	public void setGoodsList(List<GoodsCustom> goodsList) {
		this.goodsList = goodsList;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public GoodsCustom getGoodsCustom() {
		return goodsCustom;
	}
	public void setGoodsCustom(GoodsCustom goodsCustom) {
		this.goodsCustom = goodsCustom;
	}
	
	
}

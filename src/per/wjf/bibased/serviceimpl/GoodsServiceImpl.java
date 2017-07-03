package per.wjf.bibased.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.util.BeanUtil;

import net.sf.ehcache.hibernate.management.impl.BeanUtils;
import per.wjf.bibased.mapper.GoodsMapper;
import per.wjf.bibased.mapper.GoodsMapperCustom;
import per.wjf.bibased.po.Goods;
import per.wjf.bibased.po.GoodsCustom;
import per.wjf.bibased.po.GoodsVo;
import per.wjf.bibased.service.GoodsService;

public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private GoodsMapperCustom goodsMapperCustom;
	
	@Autowired
	private GoodsMapper goodsMapper;
	
	
	@Override
	public List<GoodsCustom> findGoodsList(GoodsVo goodsVo) throws Exception {
		// TODO Auto-generated method stub
		return goodsMapperCustom.findGoodsList(goodsVo);
	}
	@Override
	public GoodsCustom findGoodsById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		Goods goods = goodsMapper.selectByPrimaryKey(id);
		
		GoodsCustom goodsCustom = new GoodsCustom();
		
		org.springframework.beans.BeanUtils.copyProperties(goods, goodsCustom);
		
		return goodsCustom;
	}
	
	@Override
	public void updateGoods(Integer id, GoodsCustom goodsCustom) throws Exception {
		// TODO Auto-generated method stub
		goodsCustom.setId(id);
		goodsMapper.updateByPrimaryKey(goodsCustom);
		
	}
	@Override
	public void deletGoods(Integer id) throws Exception {
		goodsMapper.deleteByPrimaryKey(id);
		
	}
	@Override
	public void addGoods(Goods goods) throws Exception {
		
		goodsMapper.insert(goods);
	}

}

package per.wjf.bibased.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import per.wjf.bibased.po.GoodsCustom;
import per.wjf.bibased.po.GoodsVo;
import per.wjf.bibased.po.User;
import per.wjf.bibased.po.UserExample;

public interface GoodsMapperCustom {
    
	 public List<GoodsCustom> findGoodsList(GoodsVo goodsVo) throws Exception;
	 
}
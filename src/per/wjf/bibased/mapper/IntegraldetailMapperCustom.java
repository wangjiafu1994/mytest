package per.wjf.bibased.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import per.wjf.bibased.po.Integraldetail;
import per.wjf.bibased.po.IntegraldetailExample;

public interface IntegraldetailMapperCustom {
	
	public List<Integraldetail> findIntegralByUserid(int userid) throws Exception;
}
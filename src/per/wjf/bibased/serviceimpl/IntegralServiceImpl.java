package per.wjf.bibased.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import per.wjf.bibased.mapper.IntegraldetailMapper;
import per.wjf.bibased.mapper.IntegraldetailMapperCustom;
import per.wjf.bibased.po.Integraldetail;
import per.wjf.bibased.po.Myorder;
import per.wjf.bibased.service.IntegralService;

public class IntegralServiceImpl implements IntegralService{

	
	@Autowired
	private IntegraldetailMapper integraldetailMapper;
	
	@Autowired
	private IntegraldetailMapperCustom integraldetailMapperCustom;
	
	@Override
	public void addIntegral(Integraldetail integraldetail) throws Exception {
		// TODO Auto-generated method stub
		integraldetailMapper.insert(integraldetail);
	}
	@Override
	public List<Integraldetail> findIntegralByUserid(int userid) throws Exception {
		// TODO Auto-generated method stub
		return integraldetailMapperCustom.findIntegralByUserid(userid);
	}


}

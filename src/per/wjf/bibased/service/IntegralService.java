package per.wjf.bibased.service;

import java.util.List;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

import per.wjf.bibased.po.Integraldetail;

public interface IntegralService {

	public void addIntegral(Integraldetail integraldetail)throws Exception;
	
 	public List<Integraldetail> findIntegralByUserid(int userid) throws Exception;
}

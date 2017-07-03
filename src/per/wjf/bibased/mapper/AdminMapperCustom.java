package per.wjf.bibased.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import per.wjf.bibased.po.Admin;
import per.wjf.bibased.po.AdminExample;
import per.wjf.bibased.po.User;

public interface AdminMapperCustom {
	
	public Admin findUserByName(String name) throws Exception;
}
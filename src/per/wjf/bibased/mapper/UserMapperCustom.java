package per.wjf.bibased.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import per.wjf.bibased.po.User;
import per.wjf.bibased.po.UserExample;

public interface UserMapperCustom {
    
	 public User findUserByName(String username) throws Exception;
	 
}
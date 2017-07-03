package per.wjf.bibased.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import per.wjf.bibased.mapper.UserMapper;
import per.wjf.bibased.mapper.UserMapperCustom;
import per.wjf.bibased.po.User;
import per.wjf.bibased.service.UserService;

public class UserServiceImpl implements UserService{
   
	@Autowired
    private UserMapperCustom userMapperCustom;
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User checkLogin(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		User user = userMapperCustom.findUserByName(username);
		 if (user != null && user.getPassword().equals(password)) {
	            return user;
	        }
		return null;
	}

	@Override
	public void register(User user) throws Exception {
		// TODO Auto-generated method stub
		user.setTotalintegral(50);
		user.setCreatetime(new Date());
		user.setUpdatetime(new Date()); 
		userMapper.insert(user);
		
	}

	@Override
	public void updateUser(User user) throws Exception {
		// TODO Auto-generated method stub
		userMapper.updateByPrimaryKey(user);
		
		
	}

	


	

}

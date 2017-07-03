package per.wjf.bibased.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import per.wjf.bibased.mapper.AdminMapperCustom;
import per.wjf.bibased.mapper.UserMapper;
import per.wjf.bibased.mapper.UserMapperCustom;
import per.wjf.bibased.po.Admin;
import per.wjf.bibased.po.User;
import per.wjf.bibased.service.AdminService;
import per.wjf.bibased.service.UserService;

public class AdminServiceImpl implements AdminService{
   
	@Autowired
    private AdminMapperCustom adminMapperCustom;
	

	@Override
	public Admin checkBackLogin(String name, String password) throws Exception {
		// TODO Auto-generated method stub
		Admin admin = adminMapperCustom.findUserByName(name);
		 if (admin != null && admin.getPassword().equals(password)) {
	            return admin;
	        }
		return null;
	}
	


	

}
	

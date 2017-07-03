package per.wjf.bibased.service;

import java.util.List;

import per.wjf.bibased.po.User;


public interface UserService {
	
	 public User checkLogin(String username,String password)throws Exception;
	 
	 public  void register(User user) throws Exception;
	 
	 public  void updateUser(User user) throws Exception;

}

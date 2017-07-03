package per.wjf.bibased.service;

import java.util.List;

import per.wjf.bibased.po.Admin;
import per.wjf.bibased.po.User;


public interface AdminService {
	
	 public Admin checkBackLogin(String name,String password)throws Exception;
	 
}

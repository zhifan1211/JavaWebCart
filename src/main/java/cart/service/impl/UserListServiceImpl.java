package cart.service.impl;

import cart.dao.UserListDAO;
import cart.dao.UserRegisterDAO;
import cart.dao.impl.UserRegisterDAOImpl;
import cart.service.UserListService;

public class UserListServiceImpl implements UserListService {
	
	// 取得 UserListDAO 物件實體
	private UserListDAO userListDAO = new UserListDAOImpl();
	
}

package cz.uhk.fim.guitarchords.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cz.uhk.fim.guitarchords.dao.UserDAO;
import cz.uhk.fim.guitarchords.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	@Transactional
	public void addUser(User user) {
		userDAO.addUser(user);
	}

	@Transactional
	public List<User> listUsers() {
		return userDAO.listUsers();
	}

	@Transactional
	public void removeUser(Integer id) {
		userDAO.removeUser(id);
	}

}

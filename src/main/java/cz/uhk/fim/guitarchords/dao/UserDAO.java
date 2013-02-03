package cz.uhk.fim.guitarchords.dao;

import java.util.List;

import cz.uhk.fim.guitarchords.entity.User;

public interface UserDAO {

	public void addUser(User user);

	public List<User> listUsers();

	public void removeUser(Integer id);
}

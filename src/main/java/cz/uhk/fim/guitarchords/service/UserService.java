package cz.uhk.fim.guitarchords.service;

import java.util.List;

import cz.uhk.fim.guitarchords.entity.User;

public interface UserService {
	public void addUser(User user);

	public List<User> listUsers();

	public void removeUser(Integer id);
}

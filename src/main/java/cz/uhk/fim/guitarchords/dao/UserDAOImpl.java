package cz.uhk.fim.guitarchords.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cz.uhk.fim.guitarchords.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addUser(User user) {
		sessionFactory.getCurrentSession().save(user);

	}

	public List<User> listUsers() {
		return sessionFactory.getCurrentSession().createQuery("from User")
				.list();
	}

	public void removeUser(Integer id) {
		User contact = (User) sessionFactory.getCurrentSession().load(
				User.class, id);
		if (null != contact) {
			sessionFactory.getCurrentSession().delete(contact);
		}
	}

}

package com.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UsersDao;
import com.entities.Users;


@Repository
@Transactional
public class UsersDaoImpl implements UsersDao{
	
	@Autowired
	SessionFactory session;
	
	
	
	public List<Users> list() {
        return session.getCurrentSession().createQuery("from Users").list();
    }

	public boolean delete(Users users) {
		try {
			session.getCurrentSession().delete(users);
		} catch (Exception ex) {
			return false;
		}
		return true;
	}
	
	public boolean saveOrUpdate(Users users) {
		
		session.getCurrentSession().saveOrUpdate(users);
		return true;
	}
	
	
}

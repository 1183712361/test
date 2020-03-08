package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IDeptDao;
import com.woniu.pojo.Dept;
@Repository
public class DeptDaoImpl implements IDeptDao {
	@Autowired
	private SessionFactory sf;
	public Session getSession() {
		return sf.getCurrentSession();
	}
	@Override
	public void save(Dept obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Dept obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Dept obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public Dept findOne(Integer deptno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dept> findAll() {
		// TODO Auto-generated method stub
		List<Dept> deptList = getSession().createQuery("from Dept").list();
		return deptList;
	}

}

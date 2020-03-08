package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Dept;

public interface IDeptDao {
	void save(Dept obj);
	void update(Dept obj);
	void delete(Dept obj);
	Dept findOne(Integer deptno);
	List<Dept> findAll();
}

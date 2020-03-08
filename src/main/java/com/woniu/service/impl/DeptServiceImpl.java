package com.woniu.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniu.dao.IDeptDao;
import com.woniu.pojo.Dept;
import com.woniu.service.IDeptService;
@Service
@Transactional
public class DeptServiceImpl implements IDeptService {
	@Autowired
	private IDeptDao dd;
	@Override
	public List<Dept> findAll() {
		// TODO Auto-generated method stub
		return dd.findAll();
	}

}

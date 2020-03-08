package com.woniu.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.Dept;
import com.woniu.service.IDeptService;
@Controller
public class DeptAction {
	@Autowired
	private IDeptService ds;
	private List<Dept> deptList;
	public List<Dept> getDeptList() {
		return deptList;
	}
	public void setDeptList(List<Dept> deptList) {
		this.deptList = deptList;
	}
	public String list() {
		deptList = ds.findAll();
		return "success";
	}
}

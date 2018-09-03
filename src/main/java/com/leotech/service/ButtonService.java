package com.leotech.service;

import com.leotech.dao.ButtonDao;
import com.leotech.entity.Button;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ButtonService {
	@Autowired
	public ButtonDao dao;

	public List<Button> getAll() {
		return dao.getAll();
	}
	public List<Button> getAll_3d() {
		return dao.getAll();
	}
}
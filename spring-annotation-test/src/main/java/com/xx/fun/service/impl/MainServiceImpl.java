package com.xx.fun.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xx.fun.domain.IMainDOM;
import com.xx.fun.service.IMainService;
@Service
public class MainServiceImpl implements IMainService{
	@Autowired
	private IMainDOM mainDOM;

}

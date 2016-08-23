package com.xx.fun.domain.impl;

import org.springframework.stereotype.Component;

import com.xx.fun.dao.IMainMDAO;
import com.xx.fun.domain.IMainDOM;
@Component
public class MainDOMImpl implements IMainDOM{

	private IMainMDAO mainMDAO;
}

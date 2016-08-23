package com.xx.fun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.xx.fun.service.IMainService;
@Controller
public class MainController {
	
	@Autowired
	private IMainService mainService;

}

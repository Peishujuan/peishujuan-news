package com.peishujuan.zhoukao2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.peishujuan.zhoukao2.domain.News;
import com.peishujuan.zhoukao2.domain.Vo;
import com.peishujuan.zhoukao2.service.NewsService;

@Controller
public class NewsController {

	@Autowired
	private NewsService service;
	
	@RequestMapping("list")
	public String list(Model m,Vo vo,@RequestParam(defaultValue = "1")int pageNum) {
		PageInfo<News> info = service.getNewsList(vo,pageNum);
		m.addAttribute("vo", vo);
		m.addAttribute("info", info);
		return "list";
		
	}
}

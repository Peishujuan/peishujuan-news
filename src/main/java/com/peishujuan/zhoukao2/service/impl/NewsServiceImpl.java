package com.peishujuan.zhoukao2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.peishujuan.zhoukao2.dao.NewsMapper;
import com.peishujuan.zhoukao2.domain.News;
import com.peishujuan.zhoukao2.domain.Vo;
import com.peishujuan.zhoukao2.service.NewsService;
@Service
public class NewsServiceImpl implements NewsService{

	@Autowired
	private NewsMapper mapper;

	public PageInfo<News> getNewsList(Vo vo, int pageNum) {
		PageHelper.startPage(pageNum, 3);
		List<News> news = mapper.getNewsList(vo);
		PageInfo<News> info = new PageInfo<News>(news);
		return info;
	}

	public int insertBatch(List<News> list) {
		
		return mapper.insertBatch(list);
	}
}

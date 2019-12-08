package com.peishujuan.zhoukao2.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.peishujuan.zhoukao2.domain.News;
import com.peishujuan.zhoukao2.domain.Vo;

public interface NewsService {

	PageInfo<News> getNewsList(Vo vo, int pageNum);

	int insertBatch(List<News> list);
}

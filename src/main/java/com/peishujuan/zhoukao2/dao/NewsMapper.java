package com.peishujuan.zhoukao2.dao;

import java.util.List;

import com.peishujuan.zhoukao2.domain.News;
import com.peishujuan.zhoukao2.domain.Vo;

public interface NewsMapper {

	List<News> getNewsList(Vo vo);

	int insertBatch(List<News> list);

}

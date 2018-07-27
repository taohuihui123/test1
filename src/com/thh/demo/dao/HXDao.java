package com.thh.demo.dao;

import java.util.List;

import com.thh.demo.vo.HXInfo;

public interface HXDao {
	
	List<HXInfo> hList();
	
	void hinsert(HXInfo hxInfo);	

}

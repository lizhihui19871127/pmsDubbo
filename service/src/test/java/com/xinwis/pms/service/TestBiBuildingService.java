package com.xinwis.pms.service;

import com.github.pagehelper.PageHelper;
import com.xinwis.pms.exceptions.BiException;
import com.xinwis.pms.model.Bi_building;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * 文件功能描述
 * 2017/5/8 0008 下午 2:34
 * Copyright (c) 2017 保利芯智慧2.0
 * All Rights Reserved.
 *
 * @author wisdom
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/testapplicationcontext.xml"})
public class TestBiBuildingService {
	@Resource
	private BiBuildingService biBuildingService;
	@Test
	public void testGetBiBuildingById(){
		BigDecimal id = new BigDecimal("51602");
		Bi_building bi_building = biBuildingService.getBiBuilding(id);
		System.out.println(bi_building);
	}

	@Test
	public void testGetAllBiBuildings(){
		List<Bi_building> biBuildings = biBuildingService.getAllBiBuildings(2,5);
		for (Bi_building bi_building:biBuildings){
			System.out.println(bi_building);
		}
	}

	@Test
	public void testUpdateBibuilding(){
		//礼苑
		Bi_building bi_building = biBuildingService.getBiBuilding(new BigDecimal(51602));
		bi_building.setName("礼苑");
		try {
			biBuildingService.updateBuilding(bi_building);
		} catch (BiException e) {
			System.out.println("修改楼栋信息数据出现错误，错误原因："+e.getMessage());
			e.printStackTrace();
		}
	}

}

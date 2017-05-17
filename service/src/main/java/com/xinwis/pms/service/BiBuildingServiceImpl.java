package com.xinwis.pms.service;

import com.github.pagehelper.PageHelper;
import com.xinwis.pms.dao.Bi_buildingMapper;
import com.xinwis.pms.exceptions.BiException;
import com.xinwis.pms.model.Bi_building;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * 文件功能描述
 * 2017/5/8 0008 下午 2:12
 * Copyright (c) 2017 保利芯智慧2.0
 * All Rights Reserved.
 *
 * @author wisdom
 * @version 1.0
 */
@Service
public class BiBuildingServiceImpl implements BiBuildingService{
	private static final Logger logger = LogManager.getLogger();
	@Resource
	private Bi_buildingMapper bi_buildingMapper;
	@Override
	public Bi_building getBiBuilding(BigDecimal id) {
		logger.info("获取楼栋信息数据，传入参数id:[{}]",id);
		Bi_building bi_building = bi_buildingMapper.selectByPrimaryKey(id);
		logger.info("获取楼栋信息数据，传入参数id:[{}],返回结果:[{}]",id,bi_building);
		return bi_building;
	}

	@Override
	public List<Bi_building> getAllBiBuildings(int pageNum,int pageSize) {
		logger.info("获取楼栋信息数据，传入参数pageNum:[{}],pageSize:[{}]",pageNum,pageSize);
		PageHelper.startPage(pageNum,pageSize);
		List<Bi_building> bi_buildings = bi_buildingMapper.selectByExample(null);
		logger.info("获取楼栋信息数据，传入参数pageNum:[{}],pageSize:[{}],返回结果：[{}]",pageNum,pageSize,bi_buildings);
		return bi_buildings;
	}

	@Override
	public void saveBuilding(Bi_building bi_building) {
		bi_buildingMapper.insert(bi_building);
	}

	@Override
	public void updateBuilding(Bi_building bi_building) throws BiException{
		try{
			logger.info("修改楼栋信息数据，传入参数bi_building:[{}]",bi_building);
			bi_buildingMapper.updateByPrimaryKey(bi_building);
		}catch (Exception ex){
			logger.error(ex);
			throw new BiException("10001","修改楼栋信息数据失败，失败原因："+ex.getMessage());
		}
	}

	@Override
	public void deleteBuilding(BigDecimal id) {
		bi_buildingMapper.deleteByPrimaryKey(id);
	}
}

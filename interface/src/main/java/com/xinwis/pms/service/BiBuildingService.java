package com.xinwis.pms.service;

import com.xinwis.pms.exceptions.BiException;
import com.xinwis.pms.model.Bi_building;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * 文件功能描述
 * 2017/5/8 0008 下午 2:05
 * Copyright (c) 2017 保利芯智慧2.0
 * All Rights Reserved.
 *
 * @author wisdom
 * @version 1.0
 */
public interface BiBuildingService {
	public Bi_building getBiBuilding(BigDecimal id);
	public List<Bi_building> getAllBiBuildings(int pageNum,int pageSize);
	public void saveBuilding(Bi_building bi_building);
	public void updateBuilding(Bi_building bi_building) throws BiException;
	public void deleteBuilding(BigDecimal id);
}

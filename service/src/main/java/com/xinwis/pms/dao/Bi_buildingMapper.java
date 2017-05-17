package com.xinwis.pms.dao;

import com.xinwis.pms.model.Bi_building;
import com.xinwis.pms.model.Bi_buildingExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Bi_buildingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BI_BUILDING
     *
     * @mbggenerated
     */
    int countByExample(Bi_buildingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BI_BUILDING
     *
     * @mbggenerated
     */
    int deleteByExample(Bi_buildingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BI_BUILDING
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BI_BUILDING
     *
     * @mbggenerated
     */
    int insert(Bi_building record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BI_BUILDING
     *
     * @mbggenerated
     */
    int insertSelective(Bi_building record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BI_BUILDING
     *
     * @mbggenerated
     */
    List<Bi_building> selectByExample(Bi_buildingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BI_BUILDING
     *
     * @mbggenerated
     */
    Bi_building selectByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BI_BUILDING
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Bi_building record, @Param("example") Bi_buildingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BI_BUILDING
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Bi_building record, @Param("example") Bi_buildingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BI_BUILDING
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Bi_building record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BI_BUILDING
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Bi_building record);
}
package com.xinwis.pms.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Bi_building implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BI_BUILDING.ID
     *
     * @mbggenerated
     */
    private BigDecimal id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BI_BUILDING.CODE
     *
     * @mbggenerated
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BI_BUILDING.NAME
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BI_BUILDING.BUILD_UNIT
     *
     * @mbggenerated
     */
    private String buildUnit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BI_BUILDING.GENERALIZE_NAME
     *
     * @mbggenerated
     */
    private String generalizeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BI_BUILDING.APPLICATION
     *
     * @mbggenerated
     */
    private String application;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BI_BUILDING.COMMERCIAL_ACTIVITIES
     *
     * @mbggenerated
     */
    private String commercialActivities;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BI_BUILDING.BUILD_SPACE
     *
     * @mbggenerated
     */
    private BigDecimal buildSpace;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BI_BUILDING.SULT_SPACE
     *
     * @mbggenerated
     */
    private BigDecimal sultSpace;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BI_BUILDING.SEAT_TOTAL
     *
     * @mbggenerated
     */
    private BigDecimal seatTotal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BI_BUILDING.FLOOR_TOTAL
     *
     * @mbggenerated
     */
    private BigDecimal floorTotal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BI_BUILDING.BUILD_HEIGHT
     *
     * @mbggenerated
     */
    private BigDecimal buildHeight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BI_BUILDING.PROPERTY_TOTAL
     *
     * @mbggenerated
     */
    private BigDecimal propertyTotal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BI_BUILDING.COMPLETED_DATE
     *
     * @mbggenerated
     */
    private Date completedDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BI_BUILDING.REPOSSESSION_DATE
     *
     * @mbggenerated
     */
    private Date repossessionDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BI_BUILDING.SPRUCE_STATUS
     *
     * @mbggenerated
     */
    private BigDecimal spruceStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BI_BUILDING.CONSTRUT_UNIT
     *
     * @mbggenerated
     */
    private String construtUnit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BI_BUILDING.SUPERVISOR_UNIT
     *
     * @mbggenerated
     */
    private String supervisorUnit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BI_BUILDING.IN_RATE
     *
     * @mbggenerated
     */
    private String inRate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BI_BUILDING.PROPERTY_FEE_STANDARD
     *
     * @mbggenerated
     */
    private String propertyFeeStandard;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BI_BUILDING.LIFT_FIRM
     *
     * @mbggenerated
     */
    private String liftFirm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BI_BUILDING.MORTGATE_BANK
     *
     * @mbggenerated
     */
    private String mortgateBank;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BI_BUILDING.DEL
     *
     * @mbggenerated
     */
    private BigDecimal del;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BI_BUILDING.ATTA_ID
     *
     * @mbggenerated
     */
    private String attaId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BI_BUILDING.REMARK
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BI_BUILDING.CREATE_ID
     *
     * @mbggenerated
     */
    private BigDecimal createId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BI_BUILDING.UPDATE_ID
     *
     * @mbggenerated
     */
    private BigDecimal updateId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BI_BUILDING.CREATE_TIME
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column BI_BUILDING.UPDATE_TIME
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BI_BUILDING
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BI_BUILDING.ID
     *
     * @return the value of BI_BUILDING.ID
     *
     * @mbggenerated
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BI_BUILDING.ID
     *
     * @param id the value for BI_BUILDING.ID
     *
     * @mbggenerated
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BI_BUILDING.CODE
     *
     * @return the value of BI_BUILDING.CODE
     *
     * @mbggenerated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BI_BUILDING.CODE
     *
     * @param code the value for BI_BUILDING.CODE
     *
     * @mbggenerated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BI_BUILDING.NAME
     *
     * @return the value of BI_BUILDING.NAME
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BI_BUILDING.NAME
     *
     * @param name the value for BI_BUILDING.NAME
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BI_BUILDING.BUILD_UNIT
     *
     * @return the value of BI_BUILDING.BUILD_UNIT
     *
     * @mbggenerated
     */
    public String getBuildUnit() {
        return buildUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BI_BUILDING.BUILD_UNIT
     *
     * @param buildUnit the value for BI_BUILDING.BUILD_UNIT
     *
     * @mbggenerated
     */
    public void setBuildUnit(String buildUnit) {
        this.buildUnit = buildUnit == null ? null : buildUnit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BI_BUILDING.GENERALIZE_NAME
     *
     * @return the value of BI_BUILDING.GENERALIZE_NAME
     *
     * @mbggenerated
     */
    public String getGeneralizeName() {
        return generalizeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BI_BUILDING.GENERALIZE_NAME
     *
     * @param generalizeName the value for BI_BUILDING.GENERALIZE_NAME
     *
     * @mbggenerated
     */
    public void setGeneralizeName(String generalizeName) {
        this.generalizeName = generalizeName == null ? null : generalizeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BI_BUILDING.APPLICATION
     *
     * @return the value of BI_BUILDING.APPLICATION
     *
     * @mbggenerated
     */
    public String getApplication() {
        return application;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BI_BUILDING.APPLICATION
     *
     * @param application the value for BI_BUILDING.APPLICATION
     *
     * @mbggenerated
     */
    public void setApplication(String application) {
        this.application = application == null ? null : application.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BI_BUILDING.COMMERCIAL_ACTIVITIES
     *
     * @return the value of BI_BUILDING.COMMERCIAL_ACTIVITIES
     *
     * @mbggenerated
     */
    public String getCommercialActivities() {
        return commercialActivities;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BI_BUILDING.COMMERCIAL_ACTIVITIES
     *
     * @param commercialActivities the value for BI_BUILDING.COMMERCIAL_ACTIVITIES
     *
     * @mbggenerated
     */
    public void setCommercialActivities(String commercialActivities) {
        this.commercialActivities = commercialActivities == null ? null : commercialActivities.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BI_BUILDING.BUILD_SPACE
     *
     * @return the value of BI_BUILDING.BUILD_SPACE
     *
     * @mbggenerated
     */
    public BigDecimal getBuildSpace() {
        return buildSpace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BI_BUILDING.BUILD_SPACE
     *
     * @param buildSpace the value for BI_BUILDING.BUILD_SPACE
     *
     * @mbggenerated
     */
    public void setBuildSpace(BigDecimal buildSpace) {
        this.buildSpace = buildSpace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BI_BUILDING.SULT_SPACE
     *
     * @return the value of BI_BUILDING.SULT_SPACE
     *
     * @mbggenerated
     */
    public BigDecimal getSultSpace() {
        return sultSpace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BI_BUILDING.SULT_SPACE
     *
     * @param sultSpace the value for BI_BUILDING.SULT_SPACE
     *
     * @mbggenerated
     */
    public void setSultSpace(BigDecimal sultSpace) {
        this.sultSpace = sultSpace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BI_BUILDING.SEAT_TOTAL
     *
     * @return the value of BI_BUILDING.SEAT_TOTAL
     *
     * @mbggenerated
     */
    public BigDecimal getSeatTotal() {
        return seatTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BI_BUILDING.SEAT_TOTAL
     *
     * @param seatTotal the value for BI_BUILDING.SEAT_TOTAL
     *
     * @mbggenerated
     */
    public void setSeatTotal(BigDecimal seatTotal) {
        this.seatTotal = seatTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BI_BUILDING.FLOOR_TOTAL
     *
     * @return the value of BI_BUILDING.FLOOR_TOTAL
     *
     * @mbggenerated
     */
    public BigDecimal getFloorTotal() {
        return floorTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BI_BUILDING.FLOOR_TOTAL
     *
     * @param floorTotal the value for BI_BUILDING.FLOOR_TOTAL
     *
     * @mbggenerated
     */
    public void setFloorTotal(BigDecimal floorTotal) {
        this.floorTotal = floorTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BI_BUILDING.BUILD_HEIGHT
     *
     * @return the value of BI_BUILDING.BUILD_HEIGHT
     *
     * @mbggenerated
     */
    public BigDecimal getBuildHeight() {
        return buildHeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BI_BUILDING.BUILD_HEIGHT
     *
     * @param buildHeight the value for BI_BUILDING.BUILD_HEIGHT
     *
     * @mbggenerated
     */
    public void setBuildHeight(BigDecimal buildHeight) {
        this.buildHeight = buildHeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BI_BUILDING.PROPERTY_TOTAL
     *
     * @return the value of BI_BUILDING.PROPERTY_TOTAL
     *
     * @mbggenerated
     */
    public BigDecimal getPropertyTotal() {
        return propertyTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BI_BUILDING.PROPERTY_TOTAL
     *
     * @param propertyTotal the value for BI_BUILDING.PROPERTY_TOTAL
     *
     * @mbggenerated
     */
    public void setPropertyTotal(BigDecimal propertyTotal) {
        this.propertyTotal = propertyTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BI_BUILDING.COMPLETED_DATE
     *
     * @return the value of BI_BUILDING.COMPLETED_DATE
     *
     * @mbggenerated
     */
    public Date getCompletedDate() {
        return completedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BI_BUILDING.COMPLETED_DATE
     *
     * @param completedDate the value for BI_BUILDING.COMPLETED_DATE
     *
     * @mbggenerated
     */
    public void setCompletedDate(Date completedDate) {
        this.completedDate = completedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BI_BUILDING.REPOSSESSION_DATE
     *
     * @return the value of BI_BUILDING.REPOSSESSION_DATE
     *
     * @mbggenerated
     */
    public Date getRepossessionDate() {
        return repossessionDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BI_BUILDING.REPOSSESSION_DATE
     *
     * @param repossessionDate the value for BI_BUILDING.REPOSSESSION_DATE
     *
     * @mbggenerated
     */
    public void setRepossessionDate(Date repossessionDate) {
        this.repossessionDate = repossessionDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BI_BUILDING.SPRUCE_STATUS
     *
     * @return the value of BI_BUILDING.SPRUCE_STATUS
     *
     * @mbggenerated
     */
    public BigDecimal getSpruceStatus() {
        return spruceStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BI_BUILDING.SPRUCE_STATUS
     *
     * @param spruceStatus the value for BI_BUILDING.SPRUCE_STATUS
     *
     * @mbggenerated
     */
    public void setSpruceStatus(BigDecimal spruceStatus) {
        this.spruceStatus = spruceStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BI_BUILDING.CONSTRUT_UNIT
     *
     * @return the value of BI_BUILDING.CONSTRUT_UNIT
     *
     * @mbggenerated
     */
    public String getConstrutUnit() {
        return construtUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BI_BUILDING.CONSTRUT_UNIT
     *
     * @param construtUnit the value for BI_BUILDING.CONSTRUT_UNIT
     *
     * @mbggenerated
     */
    public void setConstrutUnit(String construtUnit) {
        this.construtUnit = construtUnit == null ? null : construtUnit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BI_BUILDING.SUPERVISOR_UNIT
     *
     * @return the value of BI_BUILDING.SUPERVISOR_UNIT
     *
     * @mbggenerated
     */
    public String getSupervisorUnit() {
        return supervisorUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BI_BUILDING.SUPERVISOR_UNIT
     *
     * @param supervisorUnit the value for BI_BUILDING.SUPERVISOR_UNIT
     *
     * @mbggenerated
     */
    public void setSupervisorUnit(String supervisorUnit) {
        this.supervisorUnit = supervisorUnit == null ? null : supervisorUnit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BI_BUILDING.IN_RATE
     *
     * @return the value of BI_BUILDING.IN_RATE
     *
     * @mbggenerated
     */
    public String getInRate() {
        return inRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BI_BUILDING.IN_RATE
     *
     * @param inRate the value for BI_BUILDING.IN_RATE
     *
     * @mbggenerated
     */
    public void setInRate(String inRate) {
        this.inRate = inRate == null ? null : inRate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BI_BUILDING.PROPERTY_FEE_STANDARD
     *
     * @return the value of BI_BUILDING.PROPERTY_FEE_STANDARD
     *
     * @mbggenerated
     */
    public String getPropertyFeeStandard() {
        return propertyFeeStandard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BI_BUILDING.PROPERTY_FEE_STANDARD
     *
     * @param propertyFeeStandard the value for BI_BUILDING.PROPERTY_FEE_STANDARD
     *
     * @mbggenerated
     */
    public void setPropertyFeeStandard(String propertyFeeStandard) {
        this.propertyFeeStandard = propertyFeeStandard == null ? null : propertyFeeStandard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BI_BUILDING.LIFT_FIRM
     *
     * @return the value of BI_BUILDING.LIFT_FIRM
     *
     * @mbggenerated
     */
    public String getLiftFirm() {
        return liftFirm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BI_BUILDING.LIFT_FIRM
     *
     * @param liftFirm the value for BI_BUILDING.LIFT_FIRM
     *
     * @mbggenerated
     */
    public void setLiftFirm(String liftFirm) {
        this.liftFirm = liftFirm == null ? null : liftFirm.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BI_BUILDING.MORTGATE_BANK
     *
     * @return the value of BI_BUILDING.MORTGATE_BANK
     *
     * @mbggenerated
     */
    public String getMortgateBank() {
        return mortgateBank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BI_BUILDING.MORTGATE_BANK
     *
     * @param mortgateBank the value for BI_BUILDING.MORTGATE_BANK
     *
     * @mbggenerated
     */
    public void setMortgateBank(String mortgateBank) {
        this.mortgateBank = mortgateBank == null ? null : mortgateBank.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BI_BUILDING.DEL
     *
     * @return the value of BI_BUILDING.DEL
     *
     * @mbggenerated
     */
    public BigDecimal getDel() {
        return del;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BI_BUILDING.DEL
     *
     * @param del the value for BI_BUILDING.DEL
     *
     * @mbggenerated
     */
    public void setDel(BigDecimal del) {
        this.del = del;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BI_BUILDING.ATTA_ID
     *
     * @return the value of BI_BUILDING.ATTA_ID
     *
     * @mbggenerated
     */
    public String getAttaId() {
        return attaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BI_BUILDING.ATTA_ID
     *
     * @param attaId the value for BI_BUILDING.ATTA_ID
     *
     * @mbggenerated
     */
    public void setAttaId(String attaId) {
        this.attaId = attaId == null ? null : attaId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BI_BUILDING.REMARK
     *
     * @return the value of BI_BUILDING.REMARK
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BI_BUILDING.REMARK
     *
     * @param remark the value for BI_BUILDING.REMARK
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BI_BUILDING.CREATE_ID
     *
     * @return the value of BI_BUILDING.CREATE_ID
     *
     * @mbggenerated
     */
    public BigDecimal getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BI_BUILDING.CREATE_ID
     *
     * @param createId the value for BI_BUILDING.CREATE_ID
     *
     * @mbggenerated
     */
    public void setCreateId(BigDecimal createId) {
        this.createId = createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BI_BUILDING.UPDATE_ID
     *
     * @return the value of BI_BUILDING.UPDATE_ID
     *
     * @mbggenerated
     */
    public BigDecimal getUpdateId() {
        return updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BI_BUILDING.UPDATE_ID
     *
     * @param updateId the value for BI_BUILDING.UPDATE_ID
     *
     * @mbggenerated
     */
    public void setUpdateId(BigDecimal updateId) {
        this.updateId = updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BI_BUILDING.CREATE_TIME
     *
     * @return the value of BI_BUILDING.CREATE_TIME
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BI_BUILDING.CREATE_TIME
     *
     * @param createTime the value for BI_BUILDING.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BI_BUILDING.UPDATE_TIME
     *
     * @return the value of BI_BUILDING.UPDATE_TIME
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BI_BUILDING.UPDATE_TIME
     *
     * @param updateTime the value for BI_BUILDING.UPDATE_TIME
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Bi_building{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", buildUnit='" + buildUnit + '\'' +
                ", generalizeName='" + generalizeName + '\'' +
                ", application='" + application + '\'' +
                ", commercialActivities='" + commercialActivities + '\'' +
                ", buildSpace=" + buildSpace +
                ", sultSpace=" + sultSpace +
                ", seatTotal=" + seatTotal +
                ", floorTotal=" + floorTotal +
                ", buildHeight=" + buildHeight +
                ", propertyTotal=" + propertyTotal +
                ", completedDate=" + completedDate +
                ", repossessionDate=" + repossessionDate +
                ", spruceStatus=" + spruceStatus +
                ", construtUnit='" + construtUnit + '\'' +
                ", supervisorUnit='" + supervisorUnit + '\'' +
                ", inRate='" + inRate + '\'' +
                ", propertyFeeStandard='" + propertyFeeStandard + '\'' +
                ", liftFirm='" + liftFirm + '\'' +
                ", mortgateBank='" + mortgateBank + '\'' +
                ", del=" + del +
                ", attaId='" + attaId + '\'' +
                ", remark='" + remark + '\'' +
                ", createId=" + createId +
                ", updateId=" + updateId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
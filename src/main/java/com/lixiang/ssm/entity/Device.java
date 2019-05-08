package com.lixiang.ssm.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Device {
    private Integer id;

    private String devName;

    private String machCode;

    private String deviceBrand;

    private String unitType;

    private String deviceBound;

    private String deviceType;

    private String outputSpec;

    private String esNumber;

    private String contractNo;

    private String custArea;

    private String serviceArea;

    private String department;

    private String serviceLevel;

    private String custLinkman;

    private String linkmanPhone;

    private String responsibleEngineer;

    private String responsibleEngineerId;

    private String reserveEnginner;

    private String reserveEnginnerId;

    private String bwReader;

    private String colorReader;

    private Date installedTime;

    private String assetAttr;

    private String assetNumber;

    private String changeType;

    private String location;

    private String holdMan;

    private String holdDepartment;

    private String sercet;

    private String sercetLevel;

    private String assetClass;

    private String specifications;

    private String ip;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName == null ? null : devName.trim();
    }

    public String getMachCode() {
        return machCode;
    }

    public void setMachCode(String machCode) {
        this.machCode = machCode == null ? null : machCode.trim();
    }

    public String getDeviceBrand() {
        return deviceBrand;
    }

    public void setDeviceBrand(String deviceBrand) {
        this.deviceBrand = deviceBrand == null ? null : deviceBrand.trim();
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType == null ? null : unitType.trim();
    }

    public String getDeviceBound() {
        return deviceBound;
    }

    public void setDeviceBound(String deviceBound) {
        this.deviceBound = deviceBound == null ? null : deviceBound.trim();
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public String getOutputSpec() {
        return outputSpec;
    }

    public void setOutputSpec(String outputSpec) {
        this.outputSpec = outputSpec == null ? null : outputSpec.trim();
    }

    public String getEsNumber() {
        return esNumber;
    }

    public void setEsNumber(String esNumber) {
        this.esNumber = esNumber == null ? null : esNumber.trim();
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    public String getCustArea() {
        return custArea;
    }

    public void setCustArea(String custArea) {
        this.custArea = custArea == null ? null : custArea.trim();
    }

    public String getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea == null ? null : serviceArea.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(String serviceLevel) {
        this.serviceLevel = serviceLevel == null ? null : serviceLevel.trim();
    }

    public String getCustLinkman() {
        return custLinkman;
    }

    public void setCustLinkman(String custLinkman) {
        this.custLinkman = custLinkman == null ? null : custLinkman.trim();
    }

    public String getLinkmanPhone() {
        return linkmanPhone;
    }

    public void setLinkmanPhone(String linkmanPhone) {
        this.linkmanPhone = linkmanPhone == null ? null : linkmanPhone.trim();
    }

    public String getResponsibleEngineer() {
        return responsibleEngineer;
    }

    public void setResponsibleEngineer(String responsibleEngineer) {
        this.responsibleEngineer = responsibleEngineer == null ? null : responsibleEngineer.trim();
    }

    public String getResponsibleEngineerId() {
        return responsibleEngineerId;
    }

    public void setResponsibleEngineerId(String responsibleEngineerId) {
        this.responsibleEngineerId = responsibleEngineerId == null ? null : responsibleEngineerId.trim();
    }

    public String getReserveEnginner() {
        return reserveEnginner;
    }

    public void setReserveEnginner(String reserveEnginner) {
        this.reserveEnginner = reserveEnginner == null ? null : reserveEnginner.trim();
    }

    public String getReserveEnginnerId() {
        return reserveEnginnerId;
    }

    public void setReserveEnginnerId(String reserveEnginnerId) {
        this.reserveEnginnerId = reserveEnginnerId == null ? null : reserveEnginnerId.trim();
    }

    public String getBwReader() {
        return bwReader;
    }

    public void setBwReader(String bwReader) {
        this.bwReader = bwReader == null ? null : bwReader.trim();
    }

    public String getColorReader() {
        return colorReader;
    }

    public void setColorReader(String colorReader) {
        this.colorReader = colorReader == null ? null : colorReader.trim();
    }

    public Date getInstalledTime() {
        return installedTime;
    }

    public void setInstalledTime(Date installedTime) {
        this.installedTime = installedTime;
    }

    public String getAssetAttr() {
        return assetAttr;
    }

    public void setAssetAttr(String assetAttr) {
        this.assetAttr = assetAttr == null ? null : assetAttr.trim();
    }

    public String getAssetNumber() {
        return assetNumber;
    }

    public void setAssetNumber(String assetNumber) {
        this.assetNumber = assetNumber == null ? null : assetNumber.trim();
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType == null ? null : changeType.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getHoldMan() {
        return holdMan;
    }

    public void setHoldMan(String holdMan) {
        this.holdMan = holdMan == null ? null : holdMan.trim();
    }

    public String getHoldDepartment() {
        return holdDepartment;
    }

    public void setHoldDepartment(String holdDepartment) {
        this.holdDepartment = holdDepartment == null ? null : holdDepartment.trim();
    }

    public String getSercet() {
        return sercet;
    }

    public void setSercet(String sercet) {
        this.sercet = sercet == null ? null : sercet.trim();
    }

    public String getSercetLevel() {
        return sercetLevel;
    }

    public void setSercetLevel(String sercetLevel) {
        this.sercetLevel = sercetLevel == null ? null : sercetLevel.trim();
    }

    public String getAssetClass() {
        return assetClass;
    }

    public void setAssetClass(String assetClass) {
        this.assetClass = assetClass == null ? null : assetClass.trim();
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications == null ? null : specifications.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	@Override
	public String toString() {
		return "Device [id=" + id + ", devName=" + devName + ", machCode=" + machCode + ", deviceBrand=" + deviceBrand
				+ ", unitType=" + unitType + ", deviceBound=" + deviceBound + ", deviceType=" + deviceType
				+ ", outputSpec=" + outputSpec + ", esNumber=" + esNumber + ", contractNo=" + contractNo + ", custArea="
				+ custArea + ", serviceArea=" + serviceArea + ", department=" + department + ", serviceLevel="
				+ serviceLevel + ", custLinkman=" + custLinkman + ", linkmanPhone=" + linkmanPhone
				+ ", responsibleEngineer=" + responsibleEngineer + ", responsibleEngineerId=" + responsibleEngineerId
				+ ", reserveEnginner=" + reserveEnginner + ", reserveEnginnerId=" + reserveEnginnerId + ", bwReader="
				+ bwReader + ", colorReader=" + colorReader + ", installedTime=" + installedTime + ", assetAttr="
				+ assetAttr + ", assetNumber=" + assetNumber + ", changeType=" + changeType + ", location=" + location
				+ ", holdMan=" + holdMan + ", holdDepartment=" + holdDepartment + ", sercet=" + sercet
				+ ", sercetLevel=" + sercetLevel + ", assetClass=" + assetClass + ", specifications=" + specifications
				+ ", ip=" + ip + ", createTime=" + createTime + "]";
	}

	public Device() {
		super();
	}
    
}
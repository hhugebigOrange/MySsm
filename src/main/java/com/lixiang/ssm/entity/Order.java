package com.lixiang.ssm.entity;

import java.util.Date;

public class Order {
    private String woNumber;

    private Integer priority;

    private String faultType;

    private String esNumber;

    private String custName;

    private Integer custId;

    private String devName;

    private String machCode;

    private String repairMan;

    private String repairService;

    private String custAddr;

    private String treatmentState;

    private String treatmentMeasure;

    private Date repairTime;

    private Date acceptTime;

    private Date sendTime;

    private Date getorderTime;

    private Date colseTime;

    private Date turnorderTime;

    private String turnorderReson;

    private String woStatus;

    private String woProgress;

    private String remark;

    private String repairType;

    private String accidentType;

    private String distributeMan;

    private String serviceType;

    private String macdType;

    private String maintenanceFeedback;

    private String faultClass;

    private String faultNo;

    private String partsTypeNumber;

    private String orderAccount;

    public String getWoNumber() {
        return woNumber;
    }

    public void setWoNumber(String woNumber) {
        this.woNumber = woNumber == null ? null : woNumber.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getFaultType() {
        return faultType;
    }

    public void setFaultType(String faultType) {
        this.faultType = faultType == null ? null : faultType.trim();
    }

    public String getEsNumber() {
        return esNumber;
    }

    public void setEsNumber(String esNumber) {
        this.esNumber = esNumber == null ? null : esNumber.trim();
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
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

    public String getRepairMan() {
        return repairMan;
    }

    public void setRepairMan(String repairMan) {
        this.repairMan = repairMan == null ? null : repairMan.trim();
    }

    public String getRepairService() {
        return repairService;
    }

    public void setRepairService(String repairService) {
        this.repairService = repairService == null ? null : repairService.trim();
    }

    public String getCustAddr() {
        return custAddr;
    }

    public void setCustAddr(String custAddr) {
        this.custAddr = custAddr == null ? null : custAddr.trim();
    }

    public String getTreatmentState() {
        return treatmentState;
    }

    public void setTreatmentState(String treatmentState) {
        this.treatmentState = treatmentState == null ? null : treatmentState.trim();
    }

    public String getTreatmentMeasure() {
        return treatmentMeasure;
    }

    public void setTreatmentMeasure(String treatmentMeasure) {
        this.treatmentMeasure = treatmentMeasure == null ? null : treatmentMeasure.trim();
    }

    public Date getRepairTime() {
        return repairTime;
    }

    public void setRepairTime(Date repairTime) {
        this.repairTime = repairTime;
    }

    public Date getAcceptTime() {
        return acceptTime;
    }

    public void setAcceptTime(Date acceptTime) {
        this.acceptTime = acceptTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getGetorderTime() {
        return getorderTime;
    }

    public void setGetorderTime(Date getorderTime) {
        this.getorderTime = getorderTime;
    }

    public Date getColseTime() {
        return colseTime;
    }

    public void setColseTime(Date colseTime) {
        this.colseTime = colseTime;
    }

    public Date getTurnorderTime() {
        return turnorderTime;
    }

    public void setTurnorderTime(Date turnorderTime) {
        this.turnorderTime = turnorderTime;
    }

    public String getTurnorderReson() {
        return turnorderReson;
    }

    public void setTurnorderReson(String turnorderReson) {
        this.turnorderReson = turnorderReson == null ? null : turnorderReson.trim();
    }

    public String getWoStatus() {
        return woStatus;
    }

    public void setWoStatus(String woStatus) {
        this.woStatus = woStatus == null ? null : woStatus.trim();
    }

    public String getWoProgress() {
        return woProgress;
    }

    public void setWoProgress(String woProgress) {
        this.woProgress = woProgress == null ? null : woProgress.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRepairType() {
        return repairType;
    }

    public void setRepairType(String repairType) {
        this.repairType = repairType == null ? null : repairType.trim();
    }

    public String getAccidentType() {
        return accidentType;
    }

    public void setAccidentType(String accidentType) {
        this.accidentType = accidentType == null ? null : accidentType.trim();
    }

    public String getDistributeMan() {
        return distributeMan;
    }

    public void setDistributeMan(String distributeMan) {
        this.distributeMan = distributeMan == null ? null : distributeMan.trim();
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType == null ? null : serviceType.trim();
    }

    public String getMacdType() {
        return macdType;
    }

    public void setMacdType(String macdType) {
        this.macdType = macdType == null ? null : macdType.trim();
    }

    public String getMaintenanceFeedback() {
        return maintenanceFeedback;
    }

    public void setMaintenanceFeedback(String maintenanceFeedback) {
        this.maintenanceFeedback = maintenanceFeedback == null ? null : maintenanceFeedback.trim();
    }

    public String getFaultClass() {
        return faultClass;
    }

    public void setFaultClass(String faultClass) {
        this.faultClass = faultClass == null ? null : faultClass.trim();
    }

    public String getFaultNo() {
        return faultNo;
    }

    public void setFaultNo(String faultNo) {
        this.faultNo = faultNo == null ? null : faultNo.trim();
    }

    public String getPartsTypeNumber() {
        return partsTypeNumber;
    }

    public void setPartsTypeNumber(String partsTypeNumber) {
        this.partsTypeNumber = partsTypeNumber == null ? null : partsTypeNumber.trim();
    }

    public String getOrderAccount() {
        return orderAccount;
    }

    public void setOrderAccount(String orderAccount) {
        this.orderAccount = orderAccount == null ? null : orderAccount.trim();
    }
}
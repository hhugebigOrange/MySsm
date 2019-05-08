package com.lixiang.ssm.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Service {
	
	private Order order;
	
    private String woNumber;

    private String staffId;

    private Integer arrivalTime;

    private String mainResults;

    private String serviceMode;

    private Date telRepon;

    private Date arrTime;

    private Date probSolve;

    private String docType;

    private Integer custScore;

    private String custComp;

    private String custPrai;

    private String custEva;

    private String custSat;

    private String state;
    
    public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getWoNumber() {
        return woNumber;
    }

    public void setWoNumber(String woNumber) {
        this.woNumber = woNumber == null ? null : woNumber.trim();
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    public Integer getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Integer arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getMainResults() {
        return mainResults;
    }

    public void setMainResults(String mainResults) {
        this.mainResults = mainResults == null ? null : mainResults.trim();
    }

    public String getServiceMode() {
        return serviceMode;
    }

    public void setServiceMode(String serviceMode) {
        this.serviceMode = serviceMode == null ? null : serviceMode.trim();
    }

    public Date getTelRepon() {
        return telRepon;
    }

    public void setTelRepon(Date telRepon) {
        this.telRepon = telRepon;
    }

    public Date getArrTime() {
        return arrTime;
    }

    public void setArrTime(Date arrTime) {
        this.arrTime = arrTime;
    }

    public Date getProbSolve() {
        return probSolve;
    }

    public void setProbSolve(Date probSolve) {
        this.probSolve = probSolve;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType == null ? null : docType.trim();
    }

    public Integer getCustScore() {
        return custScore;
    }

    public void setCustScore(Integer custScore) {
        this.custScore = custScore;
    }

    public String getCustComp() {
        return custComp;
    }

    public void setCustComp(String custComp) {
        this.custComp = custComp == null ? null : custComp.trim();
    }

    public String getCustPrai() {
        return custPrai;
    }

    public void setCustPrai(String custPrai) {
        this.custPrai = custPrai == null ? null : custPrai.trim();
    }

    public String getCustEva() {
        return custEva;
    }

    public void setCustEva(String custEva) {
        this.custEva = custEva == null ? null : custEva.trim();
    }

    public String getCustSat() {
        return custSat;
    }

    public void setCustSat(String custSat) {
        this.custSat = custSat == null ? null : custSat.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

	@Override
	public String toString() {
		return "Service [order=" + order + ", woNumber=" + woNumber + ", staffId=" + staffId + ", arrivalTime="
				+ arrivalTime + ", mainResults=" + mainResults + ", serviceMode=" + serviceMode + ", telRepon="
				+ telRepon + ", arrTime=" + arrTime + ", probSolve=" + probSolve + ", docType=" + docType
				+ ", custScore=" + custScore + ", custComp=" + custComp + ", custPrai=" + custPrai + ", custEva="
				+ custEva + ", custSat=" + custSat + ", state=" + state + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((woNumber == null) ? 0 : woNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Service other = (Service) obj;
		if (woNumber == null) {
			if (other.woNumber != null)
				return false;
		} else if (!woNumber.equals(other.woNumber))
			return false;
		return true;
	}
    
}
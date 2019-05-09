package com.lixiang.ssm.entity;

import java.util.List;

public class Company {
    private String companyId;

    private String abbreviation;

    private String companyName;

    private String linkMan;

    private String phone;

    private String telephone;

    private String eMail;

    private String address;
    
    private List<Employee> employees;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation == null ? null : abbreviation.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan == null ? null : linkMan.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail == null ? null : eMail.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", abbreviation=" + abbreviation + ", companyName=" + companyName
				+ ", linkMan=" + linkMan + ", phone=" + phone + ", telephone=" + telephone + ", eMail=" + eMail
				+ ", address=" + address + ", employees=" + employees + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyId == null) ? 0 : companyId.hashCode());
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
		Company other = (Company) obj;
		if (companyId == null) {
			if (other.companyId != null)
				return false;
		} else if (!companyId.equals(other.companyId))
			return false;
		return true;
	}

	public Company(String companyId, String abbreviation, String companyName, String linkMan, String phone,
			String telephone, String eMail, String address, List<Employee> employees) {
		super();
		this.companyId = companyId;
		this.abbreviation = abbreviation;
		this.companyName = companyName;
		this.linkMan = linkMan;
		this.phone = phone;
		this.telephone = telephone;
		this.eMail = eMail;
		this.address = address;
		this.employees = employees;
	}

	public Company() {
		super();
	}
	
}
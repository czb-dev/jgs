package cn.kgc.bean;


import java.util.Date;

public class Provider {
	private Integer id;
	private String proCode;
	public Provider(Integer id, String proName) {
		super();
		this.id = id;
		this.proName = proName;
	}
	private String proName;
	private String proDesc;
	private String proContact;
	private String proPhone;
	private String proAddress;
	private String proFax;
	//创建者
	private Integer createdBy;
	private Date creationDate;
	private Date modifyDate;
	//更新者
	private Integer modifyBy;
	//啥都没
	public Provider() {
		super();
	}
	
	//修改
	public Provider(Integer id, String proCode, String proName, String proDesc, String proContact, String proPhone,
			String proAddress, String proFax, Date modifyDate, Integer modifyBy) {
		super();
		this.id = id;
		this.proCode = proCode;
		this.proName = proName;
		this.proDesc = proDesc;
		this.proContact = proContact;
		this.proPhone = proPhone;
		this.proAddress = proAddress;
		this.proFax = proFax;
		this.modifyDate = modifyDate;
		this.modifyBy = modifyBy;
	}


	//查询构造
	public Provider(Integer id, String proCode, String proName, String proDesc, String proContact, String proPhone,
			String proAddress, String proFax, Date creationDate) {
		super();
		this.id = id;
		this.proCode = proCode;
		this.proName = proName;
		this.proDesc = proDesc;
		this.proContact = proContact;
		this.proPhone = proPhone;
		this.proAddress = proAddress;
		this.proFax = proFax;
		this.creationDate = creationDate;
	}
	//增加
	public Provider(String proCode, String proName, String proDesc, String proContact, String proPhone,
			String proAddress, String proFax, Integer createdBy, Date creationDate) {
		super();
		this.proCode = proCode;
		this.proName = proName;
		this.proDesc = proDesc;
		this.proContact = proContact;
		this.proPhone = proPhone;
		this.proAddress = proAddress;
		this.proFax = proFax;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
	}
	//无id
	public Provider(String proCode, String proName, String proDesc, String proContact, String proPhone,
			String proAddress, String proFax, Integer createdBy, Date creationDate, Date modifyDate,
			Integer modifyBy) {
		super();
		this.proCode = proCode;
		this.proName = proName;
		this.proDesc = proDesc;
		this.proContact = proContact;
		this.proPhone = proPhone;
		this.proAddress = proAddress;
		this.proFax = proFax;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.modifyDate = modifyDate;
		this.modifyBy = modifyBy;
	}
	//有id
	public Provider(Integer id, String proCode, String proName, String proDesc, String proContact, String proPhone,
			String proAddress, String proFax, Integer createdBy, Date creationDate, Date modifyDate,
			Integer modifyBy) {
		super();
		this.id = id;
		this.proCode = proCode;
		this.proName = proName;
		this.proDesc = proDesc;
		this.proContact = proContact;
		this.proPhone = proPhone;
		this.proAddress = proAddress;
		this.proFax = proFax;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.modifyDate = modifyDate;
		this.modifyBy = modifyBy;
	}
	@Override
	public String toString() {
		return "provider [id=" + id + ", proCode=" + proCode + ", proName=" + proName + ", proDesc=" + proDesc
				+ ", proContact=" + proContact + ", proPhone=" + proPhone + ", proAddress=" + proAddress + ", proFax="
				+ proFax + ", createdBy=" + createdBy + ", creationDate=" + creationDate + ", modifyDate=" + modifyDate
				+ ", modifyBy=" + modifyBy + "]";
	}
	//set/get方法
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProCode() {
		return proCode;
	}
	public void setProCode(String proCode) {
		this.proCode = proCode;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getProDesc() {
		return proDesc;
	}
	public void setProDesc(String proDesc) {
		this.proDesc = proDesc;
	}
	public String getProContact() {
		return proContact;
	}
	public void setProContact(String proContact) {
		this.proContact = proContact;
	}
	public String getProPhone() {
		return proPhone;
	}
	public void setProPhone(String proPhone) {
		this.proPhone = proPhone;
	}
	public String getProAddress() {
		return proAddress;
	}
	public void setProAddress(String proAddress) {
		this.proAddress = proAddress;
	}
	public String getProFax() {
		return proFax;
	}
	public void setProFax(String proFax) {
		this.proFax = proFax;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public Integer getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}
	
 
}

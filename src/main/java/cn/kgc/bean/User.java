package cn.kgc.bean;

import java.util.Date;

public class User {

	private Integer id;
	private String userCode;
	private String userName;
	private String userPassword;
	private Integer gender;
	private Date birthday;
	private String phone;
	private String address;
	private Integer userType;
	//创建者
	private Integer createdBy;
	private Date creationDate;
	//更新者
    private Integer modifyBy;
	private Date modifyDate;
	
	
	
	
	
	public User(Integer id, String userPassword) {
		super();
		this.id = id;
		this.userPassword = userPassword;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", userCode=" + userCode + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", gender=" + gender + ", birthday=" + birthday + ", phone=" + phone + ", address=" + address
				+ ", userType=" + userType + ", createdBy=" + createdBy + ", creationDate=" + creationDate
				+ ", modifyBy=" + modifyBy + ", modifyDate=" + modifyDate + "]";
	}
	
	public User(Integer id, String userName, Integer gender, Date birthday, String phone, String address,
			Integer userType, Integer modifyBy, Date modifyDate) {
		super();
		this.id = id;
		this.userName = userName;
		this.gender = gender;
		this.birthday = birthday;
		this.phone = phone;
		this.address = address;
		this.userType = userType;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
	}
	public User(String userName, Integer gender, Date birthday, String phone, String address, Integer userType,
			Integer modifyBy, Date modifyDate) {
		super();
		this.userName = userName;
		this.gender = gender;
		this.birthday = birthday;
		this.phone = phone;
		this.address = address;
		this.userType = userType;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
	}
	//啥都没
	public User() {
		super();
	}
	//无id
	public User(String userCode, String userName, String userPassword, Integer gender, Date birthday, String phone,
			String address, Integer userType, Integer createdBy, Date creationDate, Integer modifyBy,
			Date modifyDate) {
		super();
		this.userCode = userCode;
		this.userName = userName;
		this.userPassword = userPassword;
		this.gender = gender;
		this.birthday = birthday;
		this.phone = phone;
		this.address = address;
		this.userType = userType;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
	}
	//有id
	public User(Integer id, String userCode, String userName, String userPassword, Integer gender, Date birthday,
			String phone, String address, Integer userType, Integer createdBy, Date creationDate,
			Integer modifyBy, Date modifyDate) {
		super();
		this.id = id;
		this.userCode = userCode;
		this.userName = userName;
		this.userPassword = userPassword;
		this.gender = gender;
		this.birthday = birthday;
		this.phone = phone;
		this.address = address;
		this.userType = userType;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
	}
	public User(String userName, String userPassword,Integer userType) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
		this.userType=userType;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getUserType() {
		return userType;
	}
	public void setUserType(Integer userType) {
		this.userType = userType;
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
	public Integer getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	
}

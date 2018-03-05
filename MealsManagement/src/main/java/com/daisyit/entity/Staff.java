package com.daisyit.entity;// Generated Mar 6, 2018 1:19:04 AM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Staff generated by hbm2java
 */
@Entity
@Table(name="STAFF"
    ,catalog="NSRP_CATER"
)
public class Staff  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String staffId;
     private String staffCode;
     private String type;
     private String grpId;
     private String nodeId;
     private String name;
     private String title;
     private String address;
     private String address2;
     private String country;
     private String plcId;
     private String phone;
     private String fax;
     private String mobi;
     private String mobi2;
     private String email;
     private String skype;
     private String facebook;
     private String bankAcc;
     private String accHolder;
     private String bank;
     private String bankAddr;
     private String deptId;
     private String stkId;
     private String depCode;
     private String personId;
     private Date issDate;
     private char sex;
     private Date birthday;
     private Short userId;
     private String cardId;
     private String zoneSymb;
     private String mealType;
     private String contrNum;
     private Date contrDt;
     private String regNum;
     private String contrBr;
     private Date dueDate;
     private String remark;
     private Date openDate;
     private Date modiDate;
     private Date lastDate;
     private boolean status;

    public Staff() {
    }

	
    public Staff(String staffId, String name, String deptId, String personId, char sex, String cardId, boolean status) {
        this.staffId = staffId;
        this.name = name;
        this.deptId = deptId;
        this.personId = personId;
        this.sex = sex;
        this.cardId = cardId;
        this.status = status;
    }
    public Staff(String staffId, String staffCode, String type, String grpId, String nodeId, String name, String title, String address, String address2, String country, String plcId, String phone, String fax, String mobi, String mobi2, String email, String skype, String facebook, String bankAcc, String accHolder, String bank, String bankAddr, String deptId, String stkId, String depCode, String personId, Date issDate, char sex, Date birthday, Short userId, String cardId, String zoneSymb, String mealType, String contrNum, Date contrDt, String regNum, String contrBr, Date dueDate, String remark, Date openDate, Date modiDate, Date lastDate, boolean status) {
       this.staffId = staffId;
       this.staffCode = staffCode;
       this.type = type;
       this.grpId = grpId;
       this.nodeId = nodeId;
       this.name = name;
       this.title = title;
       this.address = address;
       this.address2 = address2;
       this.country = country;
       this.plcId = plcId;
       this.phone = phone;
       this.fax = fax;
       this.mobi = mobi;
       this.mobi2 = mobi2;
       this.email = email;
       this.skype = skype;
       this.facebook = facebook;
       this.bankAcc = bankAcc;
       this.accHolder = accHolder;
       this.bank = bank;
       this.bankAddr = bankAddr;
       this.deptId = deptId;
       this.stkId = stkId;
       this.depCode = depCode;
       this.personId = personId;
       this.issDate = issDate;
       this.sex = sex;
       this.birthday = birthday;
       this.userId = userId;
       this.cardId = cardId;
       this.zoneSymb = zoneSymb;
       this.mealType = mealType;
       this.contrNum = contrNum;
       this.contrDt = contrDt;
       this.regNum = regNum;
       this.contrBr = contrBr;
       this.dueDate = dueDate;
       this.remark = remark;
       this.openDate = openDate;
       this.modiDate = modiDate;
       this.lastDate = lastDate;
       this.status = status;
    }
   
     @Id 

    
    @Column(name="STAFF_ID", unique=true, nullable=false, length=12)
    public String getStaffId() {
        return this.staffId;
    }
    
    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    
    @Column(name="STAFF_CODE", length=20)
    public String getStaffCode() {
        return this.staffCode;
    }
    
    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    
    @Column(name="TYPE", length=2)
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    
    @Column(name="GRP_ID", length=4)
    public String getGrpId() {
        return this.grpId;
    }
    
    public void setGrpId(String grpId) {
        this.grpId = grpId;
    }

    
    @Column(name="NODE_ID", length=3)
    public String getNodeId() {
        return this.nodeId;
    }
    
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    
    @Column(name="NAME", nullable=false, length=50)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="TITLE", length=2)
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    
    @Column(name="ADDRESS", length=120)
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    
    @Column(name="ADDRESS2", length=120)
    public String getAddress2() {
        return this.address2;
    }
    
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    
    @Column(name="COUNTRY", length=2)
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }

    
    @Column(name="PLC_ID", length=9)
    public String getPlcId() {
        return this.plcId;
    }
    
    public void setPlcId(String plcId) {
        this.plcId = plcId;
    }

    
    @Column(name="PHONE", length=50)
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    @Column(name="FAX", length=24)
    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }

    
    @Column(name="MOBI", length=24)
    public String getMobi() {
        return this.mobi;
    }
    
    public void setMobi(String mobi) {
        this.mobi = mobi;
    }

    
    @Column(name="MOBI2", length=24)
    public String getMobi2() {
        return this.mobi2;
    }
    
    public void setMobi2(String mobi2) {
        this.mobi2 = mobi2;
    }

    
    @Column(name="EMAIL", length=50)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="SKYPE", length=60)
    public String getSkype() {
        return this.skype;
    }
    
    public void setSkype(String skype) {
        this.skype = skype;
    }

    
    @Column(name="FACEBOOK", length=60)
    public String getFacebook() {
        return this.facebook;
    }
    
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    
    @Column(name="BANK_ACC", length=50)
    public String getBankAcc() {
        return this.bankAcc;
    }
    
    public void setBankAcc(String bankAcc) {
        this.bankAcc = bankAcc;
    }

    
    @Column(name="ACC_HOLDER", length=120)
    public String getAccHolder() {
        return this.accHolder;
    }
    
    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }

    
    @Column(name="BANK", length=120)
    public String getBank() {
        return this.bank;
    }
    
    public void setBank(String bank) {
        this.bank = bank;
    }

    
    @Column(name="BANK_ADDR", length=120)
    public String getBankAddr() {
        return this.bankAddr;
    }
    
    public void setBankAddr(String bankAddr) {
        this.bankAddr = bankAddr;
    }

    
    @Column(name="DEPT_ID", nullable=false, length=4)
    public String getDeptId() {
        return this.deptId;
    }
    
    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    
    @Column(name="STK_ID", length=12)
    public String getStkId() {
        return this.stkId;
    }
    
    public void setStkId(String stkId) {
        this.stkId = stkId;
    }

    
    @Column(name="DEP_CODE", length=2)
    public String getDepCode() {
        return this.depCode;
    }
    
    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }

    
    @Column(name="PERSON_ID", nullable=false, length=20)
    public String getPersonId() {
        return this.personId;
    }
    
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ISS_DATE", length=19)
    public Date getIssDate() {
        return this.issDate;
    }
    
    public void setIssDate(Date issDate) {
        this.issDate = issDate;
    }

    
    @Column(name="SEX", nullable=false, length=1)
    public char getSex() {
        return this.sex;
    }
    
    public void setSex(char sex) {
        this.sex = sex;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="BIRTHDAY", length=19)
    public Date getBirthday() {
        return this.birthday;
    }
    
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    
    @Column(name="USER_ID", precision=3, scale=0)
    public Short getUserId() {
        return this.userId;
    }
    
    public void setUserId(Short userId) {
        this.userId = userId;
    }

    
    @Column(name="CARD_ID", nullable=false, length=12)
    public String getCardId() {
        return this.cardId;
    }
    
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    
    @Column(name="ZONE_SYMB", length=4)
    public String getZoneSymb() {
        return this.zoneSymb;
    }
    
    public void setZoneSymb(String zoneSymb) {
        this.zoneSymb = zoneSymb;
    }

    
    @Column(name="MEAL_TYPE", length=2)
    public String getMealType() {
        return this.mealType;
    }
    
    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    
    @Column(name="CONTR_NUM", length=25)
    public String getContrNum() {
        return this.contrNum;
    }
    
    public void setContrNum(String contrNum) {
        this.contrNum = contrNum;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CONTR_DT", length=19)
    public Date getContrDt() {
        return this.contrDt;
    }
    
    public void setContrDt(Date contrDt) {
        this.contrDt = contrDt;
    }

    
    @Column(name="REG_NUM", length=25)
    public String getRegNum() {
        return this.regNum;
    }
    
    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    
    @Column(name="CONTR_BR", length=120)
    public String getContrBr() {
        return this.contrBr;
    }
    
    public void setContrBr(String contrBr) {
        this.contrBr = contrBr;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="DUE_DATE", length=19)
    public Date getDueDate() {
        return this.dueDate;
    }
    
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    
    @Column(name="REMARK", length=120)
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="OPEN_DATE", length=19)
    public Date getOpenDate() {
        return this.openDate;
    }
    
    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="MODI_DATE", length=19)
    public Date getModiDate() {
        return this.modiDate;
    }
    
    public void setModiDate(Date modiDate) {
        this.modiDate = modiDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="LAST_DATE", length=19)
    public Date getLastDate() {
        return this.lastDate;
    }
    
    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    
    @Column(name="STATUS", nullable=false)
    public boolean isStatus() {
        return this.status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }




}



package com.daisyit.entity;
// Generated Mar 7, 2018 1:04:56 AM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name="USER"
    ,catalog="NSRP_CATER"
)
public class User  implements java.io.Serializable {


     private Integer id;
     private String username;
     private String fullname;
     private String password;
     private String restoreCode;
     private String staffId;
     private String stations;
     private String trans;
     private Date lastUpdate;
     private String MDepts;
     private String smtpemail;
     private boolean status;
     private String langType;

    public User() {
    }

	
    public User(String username, String fullname, String password, String staffId, String smtpemail, boolean status) {
        this.username = username;
        this.fullname = fullname;
        this.password = password;
        this.staffId = staffId;
        this.smtpemail = smtpemail;
        this.status = status;
    }
    public User(String username, String fullname, String password, String restoreCode, String staffId, String stations, String trans, Date lastUpdate, String MDepts, String smtpemail, boolean status, String langType) {
       this.username = username;
       this.fullname = fullname;
       this.password = password;
       this.restoreCode = restoreCode;
       this.staffId = staffId;
       this.stations = stations;
       this.trans = trans;
       this.lastUpdate = lastUpdate;
       this.MDepts = MDepts;
       this.smtpemail = smtpemail;
       this.status = status;
       this.langType = langType;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="ID", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="USERNAME", nullable=false, length=50)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    
    @Column(name="FULLNAME", nullable=false, length=60)
    public String getFullname() {
        return this.fullname;
    }
    
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    
    @Column(name="PASSWORD", nullable=false, length=50)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="RESTORE_CODE", length=16)
    public String getRestoreCode() {
        return this.restoreCode;
    }
    
    public void setRestoreCode(String restoreCode) {
        this.restoreCode = restoreCode;
    }

    
    @Column(name="STAFF_ID", nullable=false, length=12)
    public String getStaffId() {
        return this.staffId;
    }
    
    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    
    @Column(name="STATIONS", length=128)
    public String getStations() {
        return this.stations;
    }
    
    public void setStations(String stations) {
        this.stations = stations;
    }

    
    @Column(name="TRANS", length=128)
    public String getTrans() {
        return this.trans;
    }
    
    public void setTrans(String trans) {
        this.trans = trans;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="LAST_UPDATE", length=19)
    public Date getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    
    @Column(name="M_DEPTS", length=128)
    public String getMDepts() {
        return this.MDepts;
    }
    
    public void setMDepts(String MDepts) {
        this.MDepts = MDepts;
    }

    
    @Column(name="SMTPEMAIL", nullable=false, length=50)
    public String getSmtpemail() {
        return this.smtpemail;
    }
    
    public void setSmtpemail(String smtpemail) {
        this.smtpemail = smtpemail;
    }

    
    @Column(name="STATUS", nullable=false)
    public boolean isStatus() {
        return this.status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }

    
    @Column(name="LANG_TYPE", length=2)
    public String getLangType() {
        return this.langType;
    }
    
    public void setLangType(String langType) {
        this.langType = langType;
    }




}



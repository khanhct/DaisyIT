package com.daisyit.entity;
// Generated Mar 5, 2018 8:54:59 PM by Hibernate Tools 4.3.1


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
 * Translation generated by hbm2java
 */
@Entity
@Table(name="TRANSLATION"
    ,catalog="NSRP_CATER"
)
public class Translation  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer translationId;
     private String objectClass;
     private String objectProperty;
     private Integer objectId;
     private String objectUid;
     private String code;
     private String locale;
     private String value;
     private Date lastUpdate;
     private Date creation;

    public Translation() {
    }

	
    public Translation(String objectClass, String locale, String value) {
        this.objectClass = objectClass;
        this.locale = locale;
        this.value = value;
    }
    public Translation(String objectClass, String objectProperty, Integer objectId, String objectUid, String code, String locale, String value, Date lastUpdate, Date creation) {
       this.objectClass = objectClass;
       this.objectProperty = objectProperty;
       this.objectId = objectId;
       this.objectUid = objectUid;
       this.code = code;
       this.locale = locale;
       this.value = value;
       this.lastUpdate = lastUpdate;
       this.creation = creation;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="TRANSLATION_ID", unique=true, nullable=false)
    public Integer getTranslationId() {
        return this.translationId;
    }
    
    public void setTranslationId(Integer translationId) {
        this.translationId = translationId;
    }

    
    @Column(name="OBJECT_CLASS", nullable=false, length=63)
    public String getObjectClass() {
        return this.objectClass;
    }
    
    public void setObjectClass(String objectClass) {
        this.objectClass = objectClass;
    }

    
    @Column(name="OBJECT_PROPERTY", length=150)
    public String getObjectProperty() {
        return this.objectProperty;
    }
    
    public void setObjectProperty(String objectProperty) {
        this.objectProperty = objectProperty;
    }

    
    @Column(name="OBJECT_ID")
    public Integer getObjectId() {
        return this.objectId;
    }
    
    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    
    @Column(name="OBJECT_UID", length=11)
    public String getObjectUid() {
        return this.objectUid;
    }
    
    public void setObjectUid(String objectUid) {
        this.objectUid = objectUid;
    }

    
    @Column(name="CODE", length=50)
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    
    @Column(name="LOCALE", nullable=false, length=15)
    public String getLocale() {
        return this.locale;
    }
    
    public void setLocale(String locale) {
        this.locale = locale;
    }

    
    @Column(name="VALUE", nullable=false, length=65535)
    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="LAST_UPDATE", length=19)
    public Date getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CREATION", length=19)
    public Date getCreation() {
        return this.creation;
    }
    
    public void setCreation(Date creation) {
        this.creation = creation;
    }




}


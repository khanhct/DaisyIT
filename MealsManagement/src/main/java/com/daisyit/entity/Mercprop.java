package com.daisyit.entity;
// Generated Mar 4, 2018 1:44:52 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Mercprop generated by hbm2java
 */
@Entity
@Table(name="MERCPROP"
    ,catalog="NSRP_CATER"
)
public class Mercprop  implements java.io.Serializable {


     private MercpropId id;
     private String descript;
     private char dataType;
     private byte dataLen;
     private String format;
     private String inputmask;
     private byte status;

    public Mercprop() {
    }

    public Mercprop(MercpropId id, String descript, char dataType, byte dataLen, String format, String inputmask, byte status) {
       this.id = id;
       this.descript = descript;
       this.dataType = dataType;
       this.dataLen = dataLen;
       this.format = format;
       this.inputmask = inputmask;
       this.status = status;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="type", column=@Column(name="TYPE", nullable=false, length=2) ), 
        @AttributeOverride(name="code", column=@Column(name="CODE", nullable=false, length=16) ) } )
    public MercpropId getId() {
        return this.id;
    }
    
    public void setId(MercpropId id) {
        this.id = id;
    }

    
    @Column(name="DESCRIPT", nullable=false, length=120)
    public String getDescript() {
        return this.descript;
    }
    
    public void setDescript(String descript) {
        this.descript = descript;
    }

    
    @Column(name="DATA_TYPE", nullable=false, length=1)
    public char getDataType() {
        return this.dataType;
    }
    
    public void setDataType(char dataType) {
        this.dataType = dataType;
    }

    
    @Column(name="DATA_LEN", nullable=false, precision=2, scale=0)
    public byte getDataLen() {
        return this.dataLen;
    }
    
    public void setDataLen(byte dataLen) {
        this.dataLen = dataLen;
    }

    
    @Column(name="FORMAT", nullable=false, length=16)
    public String getFormat() {
        return this.format;
    }
    
    public void setFormat(String format) {
        this.format = format;
    }

    
    @Column(name="INPUTMASK", nullable=false, length=16)
    public String getInputmask() {
        return this.inputmask;
    }
    
    public void setInputmask(String inputmask) {
        this.inputmask = inputmask;
    }

    
    @Column(name="STATUS", nullable=false)
    public byte getStatus() {
        return this.status;
    }
    
    public void setStatus(byte status) {
        this.status = status;
    }




}



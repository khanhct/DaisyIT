package com.daisyit.entity;
// Generated Mar 7, 2018 6:20:40 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Allcode generated by hbm2java
 */
@Entity
@Table(name="ALLCODE"
    ,catalog="NSRP_CATER"
)
public class Allcode  implements java.io.Serializable {


     private AllcodeId id;
     private short idx;
     private String typeName;
     private String contents;
     private byte modify;
     private byte isdefault;
     private int rsrId;

    public Allcode() {
    }

    public Allcode(AllcodeId id, short idx, String typeName, String contents, byte modify, byte isdefault, int rsrId) {
       this.id = id;
       this.idx = idx;
       this.typeName = typeName;
       this.contents = contents;
       this.modify = modify;
       this.isdefault = isdefault;
       this.rsrId = rsrId;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="codeName", column=@Column(name="CODE_NAME", nullable=false, length=10) ), 
        @AttributeOverride(name="depCode", column=@Column(name="DEP_CODE", nullable=false, length=1) ), 
        @AttributeOverride(name="codeVal", column=@Column(name="CODE_VAL", nullable=false, length=2) ) } )
    public AllcodeId getId() {
        return this.id;
    }
    
    public void setId(AllcodeId id) {
        this.id = id;
    }

    
    @Column(name="IDX", nullable=false, precision=3, scale=0)
    public short getIdx() {
        return this.idx;
    }
    
    public void setIdx(short idx) {
        this.idx = idx;
    }

    
    @Column(name="TYPE_NAME", nullable=false, length=60)
    public String getTypeName() {
        return this.typeName;
    }
    
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    
    @Column(name="CONTENTS", nullable=false, length=120)
    public String getContents() {
        return this.contents;
    }
    
    public void setContents(String contents) {
        this.contents = contents;
    }

    
    @Column(name="MODIFY", nullable=false)
    public byte getModify() {
        return this.modify;
    }
    
    public void setModify(byte modify) {
        this.modify = modify;
    }

    
    @Column(name="ISDEFAULT", nullable=false)
    public byte getIsdefault() {
        return this.isdefault;
    }
    
    public void setIsdefault(byte isdefault) {
        this.isdefault = isdefault;
    }

    
    @Column(name="RSR_ID", nullable=false)
    public int getRsrId() {
        return this.rsrId;
    }
    
    public void setRsrId(int rsrId) {
        this.rsrId = rsrId;
    }




}



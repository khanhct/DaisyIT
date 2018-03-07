package com.daisyit.entity;
// Generated Mar 7, 2018 6:20:40 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CateringId generated by hbm2java
 */
@Embeddable
public class CateringId  implements java.io.Serializable {


     private String staffId;
     private String mealTtme;
     private Date caterDate;

    public CateringId() {
    }

    public CateringId(String staffId, String mealTtme, Date caterDate) {
       this.staffId = staffId;
       this.mealTtme = mealTtme;
       this.caterDate = caterDate;
    }
   


    @Column(name="STAFF_ID", nullable=false, length=12)
    public String getStaffId() {
        return this.staffId;
    }
    
    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }


    @Column(name="MEAL_TTME", nullable=false, length=10)
    public String getMealTtme() {
        return this.mealTtme;
    }
    
    public void setMealTtme(String mealTtme) {
        this.mealTtme = mealTtme;
    }


    @Column(name="CATER_DATE", nullable=false, length=10)
    public Date getCaterDate() {
        return this.caterDate;
    }
    
    public void setCaterDate(Date caterDate) {
        this.caterDate = caterDate;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CateringId) ) return false;
		 CateringId castOther = ( CateringId ) other; 
         
		 return ( (this.getStaffId()==castOther.getStaffId()) || ( this.getStaffId()!=null && castOther.getStaffId()!=null && this.getStaffId().equals(castOther.getStaffId()) ) )
 && ( (this.getMealTtme()==castOther.getMealTtme()) || ( this.getMealTtme()!=null && castOther.getMealTtme()!=null && this.getMealTtme().equals(castOther.getMealTtme()) ) )
 && ( (this.getCaterDate()==castOther.getCaterDate()) || ( this.getCaterDate()!=null && castOther.getCaterDate()!=null && this.getCaterDate().equals(castOther.getCaterDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getStaffId() == null ? 0 : this.getStaffId().hashCode() );
         result = 37 * result + ( getMealTtme() == null ? 0 : this.getMealTtme().hashCode() );
         result = 37 * result + ( getCaterDate() == null ? 0 : this.getCaterDate().hashCode() );
         return result;
   }   


}



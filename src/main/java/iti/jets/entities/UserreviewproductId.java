// default package
// Generated Mar 4, 2023, 11:48:59 PM by Hibernate Tools 6.0.0.Alpha3
package iti.jets.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * UserreviewproductId generated by hbm2java
 */
@Embeddable
public class UserreviewproductId  implements java.io.Serializable {


     private int userId;
     private int productId;

    public UserreviewproductId() {
    }

    public UserreviewproductId(int userId, int productId) {
       this.userId = userId;
       this.productId = productId;
    }
   


    @Column(name="userId", nullable=false)
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }


    @Column(name="productId", nullable=false)
    public int getProductId() {
        return this.productId;
    }
    
    public void setProductId(int productId) {
        this.productId = productId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof UserreviewproductId) ) return false;
		 UserreviewproductId castOther = ( UserreviewproductId ) other; 
         
		 return (this.getUserId()==castOther.getUserId())
 && (this.getProductId()==castOther.getProductId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getUserId();
         result = 37 * result + this.getProductId();
         return result;
   }   


}



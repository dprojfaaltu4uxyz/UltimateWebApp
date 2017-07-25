package com.webapp.project.modules.masters.model;
// Generated Jul 9, 2017 5:31:29 PM by Hibernate Tools 4.3.1.Final


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Taxmaster generated by hbm2java
 */
@Entity
@Table(name="taxmaster"
    ,catalog="websystique"
)
public class Tax  implements java.io.Serializable {


     private long taxId;
     private String taxCode;
     private String taxName;
     private String taxDescription;
     private Set<Vendor> vendors = new HashSet<Vendor>(0);

    public Tax() {
    }

	
    public Tax(long taxId) {
        this.taxId = taxId;
    }
    public Tax(long taxId, String taxCode, String taxName, String taxDescription, Set<Vendor> vendors) {
       this.taxId = taxId;
       this.taxCode = taxCode;
       this.taxName = taxName;
       this.taxDescription = taxDescription;
       this.vendors = vendors;
    }
   
     @Id 

    
    @Column(name="taxId", unique=true, nullable=false)
    public long getTaxId() {
        return this.taxId;
    }
    
    public void setTaxId(long taxId) {
        this.taxId = taxId;
    }

    
    @Column(name="taxCode", length=65)
    public String getTaxCode() {
        return this.taxCode;
    }
    
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    
    @Column(name="taxName", length=200)
    public String getTaxName() {
        return this.taxName;
    }
    
    public void setTaxName(String taxName) {
        this.taxName = taxName;
    }

    
    @Column(name="taxDescription", length=200)
    public String getTaxDescription() {
        return this.taxDescription;
    }
    
    public void setTaxDescription(String taxDescription) {
        this.taxDescription = taxDescription;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tax")
    public Set<Vendor> getVendors() {
        return this.vendors;
    }
    
    public void setVendors(Set<Vendor> vendors) {
        this.vendors = vendors;
    }




}



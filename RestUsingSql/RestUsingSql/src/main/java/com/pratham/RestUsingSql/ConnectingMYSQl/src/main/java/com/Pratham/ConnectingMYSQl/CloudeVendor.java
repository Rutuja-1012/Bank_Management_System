package com.Pratham.ConnectingMYSQl;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Cloud_Vendor_Project)")
public class CloudeVendor {

    @Id
    private String vendorId;
    private String vendorName;

    //Unparamitorized Constructor
    public CloudeVendor(){

    }
    //Paramitarized Constructcor
    public CloudeVendor(String vendorId, String vendorName) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
    }


    //Creating Getters and Setters

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }


}


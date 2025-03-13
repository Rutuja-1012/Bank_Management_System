package com.Pratham.ConnectingMYSQl.Service;

import com.Pratham.ConnectingMYSQl.CloudeVendor;

import java.util.List;

public interface CloudeVendorService {

    public String createVendor(CloudeVendor cloudeVendor);
    public String updateVendor(CloudeVendor cloudeVendor);
    public String deleteVendor(String vendorId);
    public CloudeVendor getVndorDeatails(String vendorId);
    public List<CloudeVendor> getAllVendors();
}

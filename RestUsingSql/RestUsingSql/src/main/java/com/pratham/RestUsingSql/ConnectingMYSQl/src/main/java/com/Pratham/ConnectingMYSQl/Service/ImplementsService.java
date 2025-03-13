package com.Pratham.ConnectingMYSQl.Service;

import com.Pratham.ConnectingMYSQl.CloudeVendor;
import com.Pratham.ConnectingMYSQl.Repo.CloudeVendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ImplementsService implements CloudeVendorService{
    @Autowired
  private   CloudeVendorRepository cloudeVendorRepository;

    @Override
    public String createVendor(CloudeVendor cloudeVendor) {
        cloudeVendorRepository.save(cloudeVendor);
        return "Vendor Created";
    }

    @Override
    public String updateVendor(CloudeVendor cloudeVendor) {
        cloudeVendorRepository.save(cloudeVendor);

        return "Updated";
    }

    @Override
    public String deleteVendor(String vendorId) {
      cloudeVendorRepository.deleteById(vendorId);
        return "Deleted";
    }

    @Override
    public CloudeVendor getVndorDeatails(String vendorId) {
        return  cloudeVendorRepository.findById(vendorId).get();

    }

    @Override
    public List<CloudeVendor> getAllVendors() {
        return cloudeVendorRepository.findAll();
    }
}

package com.Pratham.ConnectingMYSQl.Controller;

import com.Pratham.ConnectingMYSQl.CloudeVendor;
import com.Pratham.ConnectingMYSQl.Service.CloudeVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudVendor")
public class CloudeVendorController {

    @Autowired
    CloudeVendorService cloudeVendorService;

    @GetMapping("{vendorId}")
    private CloudeVendor getVendors ( @PathVariable("vendorId") String vendorId){
       return cloudeVendorService.getVndorDeatails(vendorId);

    }

    @GetMapping
    private List<CloudeVendor> getAllVendors ( ){
        return  cloudeVendorService.getAllVendors();

    }

    @PostMapping
    private String createVendor(@RequestBody CloudeVendor cloudeVendor){
       cloudeVendorService.createVendor(cloudeVendor);
       return "vendors is Created";
    }

    @PutMapping
    private String updateVendor(@RequestBody CloudeVendor cloudeVendor){
       cloudeVendorService.updateVendor(cloudeVendor);
       return "Vendor Updated";
    }

    @DeleteMapping("{vendorId}")
    private String deleteVendor(@PathVariable("vendorId") String vendorId){
       cloudeVendorService.deleteVendor(vendorId);
       return "Vendor deleted Succesfully";
    }





}

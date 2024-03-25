package com.thinkconstructive.prerestdemo.controller;


import com.thinkconstructive.prerestdemo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController //How spring will know if this is Controller class GET
@RequestMapping("/cloudVendor") //context path with link
public class CloudVendorAPIService
{

    CloudVendor cloudVendors;


    //how does spring know that this is the GET METHOD API
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId)
    {
        return cloudVendors;

                /*new CloudVendor("A1", "Mortimers", "14 Highcross Street", "0775601578");*/
    }


    //creatuing
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendors)
    {
        this.cloudVendors = cloudVendors;
        return "Cloud Vendor Created Successfully";
    }



    //updated
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendors)
    {
        this.cloudVendors = cloudVendors;
        return "Cloud Vendor Updated Successfully";
    }


    //deletion of data
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId)
    {
        this.cloudVendors = null;
        return "Cloud Vendor Deleted Successfully";
    }

}

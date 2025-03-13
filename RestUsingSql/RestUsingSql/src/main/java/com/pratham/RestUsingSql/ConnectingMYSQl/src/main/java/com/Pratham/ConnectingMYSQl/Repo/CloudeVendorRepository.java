package com.Pratham.ConnectingMYSQl.Repo;

import com.Pratham.ConnectingMYSQl.CloudeVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudeVendorRepository extends JpaRepository<CloudeVendor,String> {

}

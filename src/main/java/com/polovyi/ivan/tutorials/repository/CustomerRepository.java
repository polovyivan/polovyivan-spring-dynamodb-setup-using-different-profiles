package com.polovyi.ivan.tutorials.repository;

import com.polovyi.ivan.tutorials.entity.CustomerEntity;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface CustomerRepository extends CrudRepository<CustomerEntity, String> {

}

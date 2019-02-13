package com.srmasset.api.repository;

import com.srmasset.api.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomersRepository extends MongoRepository<Customer, String> {

}
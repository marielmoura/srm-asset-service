package com.srmasset.api.business;

import com.srmasset.api.model.Customer;

import java.util.List;


public interface CustomersBusiness {

    List<Customer> getAll();

    Customer save(Customer customer);

    void delete(String clientId);

}

package com.srmasset.api.controller;

import com.srmasset.api.business.CustomersBusiness;
import com.srmasset.api.model.Customer;
import com.srmasset.api.model.Risk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("customers")
public class CustomersController {

    private final CustomersBusiness customersBusiness;

    @Autowired
    public CustomersController(CustomersBusiness customersBusiness) {
        this.customersBusiness = customersBusiness;
    }

    @GetMapping()
    public List<CustomerResponse> getAll() {
        return customersBusiness.getAll().stream()
                .map(customer -> new CustomerResponse(customer))
                .collect(Collectors.toList());
    }

    @PostMapping()
    public CustomerResponse post(@RequestBody CustomerRequest customerRequest) {
        Customer customer = customerRequest.toCustomer();
        Customer savedCustomer = customersBusiness.save(customer);
        return new CustomerResponse(savedCustomer);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") String id) {
        customersBusiness.delete(id);
        return String.format("Customer %s successfully deleted", id);
    }

    public static class CustomerRequest {

        private String name;
        private Double creditLimit;
        private Risk risk;

        public void setName(String name) {
            this.name = name;
        }

        public void setCreditLimit(Double creditLimit) {
            this.creditLimit = creditLimit;
        }

        public void setRisk(Risk risk) {
            this.risk = risk;
        }

        public Customer toCustomer() {
            return new Customer(name, creditLimit, risk);
        }

    }

    public static class CustomerResponse {

        private String id;
        private String name;
        private Double creditLimit;
        private Risk risk;
        private Double interestRate;

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public Double getCreditLimit() {
            return creditLimit;
        }

        public Risk getRisk() {
            return risk;
        }

        public Double getInterestRate() {
            return interestRate;
        }

        public CustomerResponse(Customer customer) {
            this.id = customer.getId();
            this.creditLimit = customer.getCreditLimit();
            this.interestRate = customer.getInterestRate();
            this.name = customer.getName();
            this.risk = customer.getRisk();
        }

    }

}

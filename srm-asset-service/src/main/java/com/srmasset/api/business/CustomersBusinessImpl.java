package com.srmasset.api.business;
import com.srmasset.api.model.Customer;
import com.srmasset.api.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class CustomersBusinessImpl implements CustomersBusiness {

    @Autowired
    private CustomersRepository customersRepository;

    @Override
    public List<Customer> getAll() {
        return customersRepository.findAll();
    }

    @Override
    public Customer save(Customer customer) {
        customer.setInterestRate();
        return customersRepository.save(customer);
    }

    @Override
    public void delete(String clientId) {
        customersRepository.deleteById(clientId);
    }

}

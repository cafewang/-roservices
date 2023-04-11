package org.wangyang.customer.applicationservice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.wangyang.customer.domain.model.Customer;
import org.wangyang.customer.inputport.CustomerApplicationService;
import org.wangyang.customer.outputport.CustomerRepository;

@Component
@RequiredArgsConstructor
public class CustomerApplicationServiceImpl implements CustomerApplicationService {
    private final CustomerRepository customerRepository;

    @Transactional(rollbackFor = Exception.class)
    public Long createCustomer(String name) {
        Customer customer = Customer.create(name);
        return customerRepository.add(customer);
    }
}

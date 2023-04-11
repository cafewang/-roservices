package org.wangyang.customer.dataaccess.outputadatper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.wangyang.customer.dataaccess.repo.CustomerRepo;
import org.wangyang.customer.domain.model.Customer;
import org.wangyang.customer.outputport.CustomerRepository;

import static org.wangyang.customer.dataaccess.mapper.CustomerMapper.CUSTOMER_MAPPER;

@Component
@RequiredArgsConstructor
public class CustomerRepositoryImpl implements CustomerRepository {
    private final CustomerRepo customerRepo;

    @Override
    public Long add(Customer customer) {
        return customerRepo.save(CUSTOMER_MAPPER.toCustomerEntity(customer)).getId();
    }
}

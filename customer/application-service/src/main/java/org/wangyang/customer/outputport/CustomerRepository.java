package org.wangyang.customer.outputport;

import org.wangyang.customer.domain.model.Customer;

public interface CustomerRepository {
    Long add(Customer customer);
}

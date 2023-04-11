package org.wangyang.customer.dataaccess.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import org.wangyang.customer.dataaccess.entity.CustomerEntity;
import org.wangyang.customer.domain.model.Customer;

@Mapper(
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface CustomerMapper {
    CustomerMapper CUSTOMER_MAPPER = Mappers.getMapper(CustomerMapper.class);

    CustomerEntity toCustomerEntity(Customer customer);
}

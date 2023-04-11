package org.wangyang.customer.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.wangyang.customer.api.dto.CustomerCreateRequest;
import org.wangyang.customer.inputport.CustomerApplicationService;

@RestController
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerApplicationService customerApplicationService;

    @PostMapping("customer")
    public Long createCustomer(@RequestBody CustomerCreateRequest customerCreateRequest) {
        return customerApplicationService.createCustomer(customerCreateRequest.getName());
    }
}

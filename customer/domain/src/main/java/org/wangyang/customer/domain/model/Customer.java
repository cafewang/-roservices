package org.wangyang.customer.domain.model;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

@Getter
public class Customer {
    private Long id;
    private Boolean active;
    private String name;

    private Customer(Boolean active, String name) {
        this.active = active;
        this.name = name;
    }

    public static Customer create(String name) {
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("name must not be blank");
        }
        return new Customer(true, name);
    }
}

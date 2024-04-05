package vn.codegym.service;

import vn.codegym.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceFactory implements CustomerService {
    private static CustomerService instance;

    private CustomerServiceFactory() {

    }

    public static CustomerService getInstance() {
        if (instance == null) {
            instance = new CustomerServiceFactory();
            return instance;
        } else {
            return instance;
        }
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> customersLis = new ArrayList<>();
        customersLis.add(new Customer(1,
                "Nguyen Khac Nhat"));
        customersLis.add(new Customer(2,
                "Dang Thuy Hoa"));

        return customersLis;
    }
}

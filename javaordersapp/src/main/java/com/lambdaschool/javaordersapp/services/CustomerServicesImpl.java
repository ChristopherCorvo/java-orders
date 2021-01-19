package com.lambdaschool.javaordersapp.services;


import com.lambdaschool.javaordersapp.models.Customers;
import com.lambdaschool.javaordersapp.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "customersservices")
public class CustomerServicesImpl implements CustomersServices
{
    // We use @Autowire to wire in the customers repository
    @Autowired
    private CustomersRepository customersRepository;

    @Transactional // this entire save method needs to work all the way through and
                    // if there is a single place that fails then cancel the entire thing

    @Override
    public Customers save(Customers customers)
    {
        return customersRepository.save(customers);
    }

}

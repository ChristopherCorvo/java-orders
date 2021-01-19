package com.lambdaschool.javaordersapp.services;


import com.lambdaschool.javaordersapp.models.Orders;
import com.lambdaschool.javaordersapp.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional // if you have a method that is tagged as transactional then you
                // want to tag the entire class as transactional
@Service(value = "ordersservices")
public class OrdersServicesImpl implements OrdersServices
{
    // we use autowire to wire in the orders repository
    @Autowired
    private OrdersRepository ordersRepository;

    @Transactional
    @Override
    public Orders save(Orders orders)
    {
        return ordersRepository.save(orders);
    }
}

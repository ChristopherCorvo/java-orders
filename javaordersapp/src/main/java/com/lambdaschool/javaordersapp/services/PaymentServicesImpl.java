package com.lambdaschool.javaordersapp.services;

import com.lambdaschool.javaordersapp.models.Payments;
import com.lambdaschool.javaordersapp.repositories.PaymentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional // if you have a method that is tagged as transactional then you want
                // to tage the entire class as transactional
@Service(value = "paymentsservices")

public class PaymentServicesImpl implements PaymentsServices
{
    // We use autowire to wire in the restaurant repository
    @Autowired
    private PaymentsRepository paymentsRepository;

    @Transactional // this entire save method needs to work all the way through
                    // if it fails for one then cancel for all

    @Override
    public Payments save(Payments payments)
    {
        return paymentsRepository.save(payments);
    }

}

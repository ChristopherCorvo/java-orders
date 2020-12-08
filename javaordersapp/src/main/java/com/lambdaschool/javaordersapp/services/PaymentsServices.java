package com.lambdaschool.javaordersapp.services;

import com.lambdaschool.javaordersapp.models.Payments;

public interface PaymentsServices
{
    // save is a crud method
    Payments save(Payments payments);
}

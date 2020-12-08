package com.lambdaschool.javaordersapp.repositories;

import com.lambdaschool.javaordersapp.models.Payments;
import org.springframework.data.repository.CrudRepository;

public interface PaymentsRepository extends CrudRepository<Payments, Long>
{
}

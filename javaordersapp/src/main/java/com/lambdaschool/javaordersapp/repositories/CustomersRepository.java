package com.lambdaschool.javaordersapp.repositories;

import com.lambdaschool.javaordersapp.models.Customers;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customers, Long>
{
}

package com.lambdaschool.javaordersapp.repositories;

import com.lambdaschool.javaordersapp.models.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<Orders, Long>
{
}

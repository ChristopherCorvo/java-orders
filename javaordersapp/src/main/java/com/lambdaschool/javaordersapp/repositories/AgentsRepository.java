package com.lambdaschool.javaordersapp.repositories;

import com.lambdaschool.javaordersapp.models.Agents;
import org.springframework.data.repository.CrudRepository;

public interface AgentsRepository extends CrudRepository<Agents, Long>
{
}

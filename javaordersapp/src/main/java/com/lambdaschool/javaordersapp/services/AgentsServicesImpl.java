package com.lambdaschool.javaordersapp.services;

import com.lambdaschool.javaordersapp.models.Agents;
import com.lambdaschool.javaordersapp.repositories.AgentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "agentsservices")
public class AgentsServicesImpl implements AgentsServices
{
    // we use autowire to wire in the agents repository
    @Autowired
    private AgentsRepository agentsRepository;

    @Transactional
    @Override
    public Agents save(Agents agents)
    {
        return agentsRepository.save(agents);
    }
}

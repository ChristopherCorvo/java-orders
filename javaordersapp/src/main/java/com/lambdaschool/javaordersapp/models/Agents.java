// Note: This is the driver table i.e parent table

package com.lambdaschool.javaordersapp.models;
// ---- Auto Imports ------


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "names")
public class Agents
{
    // @Id and @GeneratedValue help set the primary key
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // this is standard code
    // table fields
    private long agentcode; //primary key not null
    private String agentname;
    private String workingarea;
    private double commission;
    private String phone;
    private String country;


    // ---------- Associations -----------
    // We are declaring associations between the children tables and the driver table
    // we will call these joining tables a combination of both tables names

    // declares the relationship between Agents table && Customers
    @OneToMany(mappedBy = "agents",
                cascade = CascadeType.ALL,
                orphanRemoval = true)
    private List<Customers> customers = new ArrayList<>();

    // Constructors
    public Agents()
    {
        // default constructor for JPA
    }

    // constructor with parameters
    public Agents(
        String agentname,
        String workingarea,
        double commission,
        String phone,
        String country
        )
    {
        this.workingarea = workingarea;
        this.phone = phone;
        this.country = country;
        this.commission = commission;
    }

    // ---- Getter and Setters
    public long getAgentcode()
    {
        return agentcode;
    }

    public void setAgentcode(long agentcode)
    {
        this.agentcode = agentcode;
    }

    public String getAgentname()
    {
        return agentname;
    }

    public void setAgentname(String agentname)
    {
        this.agentname = agentname;
    }

    public String getWorkingarea()
    {
        return workingarea;
    }

    public void setWorkingarea(String workingarea)
    {
        this.workingarea = workingarea;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public double getCommission()
    {
        return commission;
    }

    public void setCommission(double commission)
    {
        this.commission = commission;
    }
}

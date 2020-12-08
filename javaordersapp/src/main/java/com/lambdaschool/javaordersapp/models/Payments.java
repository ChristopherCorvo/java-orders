package com.lambdaschool.javaordersapp.models;

import javax.persistence.*;

@Entity
@Table(name = "payments")
public class Payments
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long paymentid;

    private String type;

    public Payments()
    {
        // Default constructor for JPA
    }

    // Constructor with parameters

    public Payments(String type)
    {
        this.type = type;
    }

    // ------- Getter and Setter -----

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }
}

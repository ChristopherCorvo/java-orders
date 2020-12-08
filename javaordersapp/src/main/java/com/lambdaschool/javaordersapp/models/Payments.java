package com.lambdaschool.javaordersapp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "payments")
public class Payments
{
    // Create primary key
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // table fields
    private long paymentid; // primary key

    @Column(nullable = false,
            unique = true)
    private String type;

    // ------ Associations --------
    @ManyToMany(mappedBy = "payments")
    @JsonIgnoreProperties("payments")
    private Set<Orders> orders = new HashSet<>();

    // ----- Constructors -----

    public Payments()
    {
        // default constructor for JPA
    }

    // constructor with parameters
    public Payments(String type)
    {
        this.type = type;
    }

    // ------- Getters and Setters -----

    public long getPaymentid()
    {
        return paymentid;
    }

    public void setPaymentid(long paymentid)
    {
        this.paymentid = paymentid;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public Set<Orders> getOrders()
    {
        return orders;
    }

    public void setOrders(Set<Orders> orders)
    {
        this.orders = orders;
    }
}

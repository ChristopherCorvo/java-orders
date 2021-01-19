package com.lambdaschool.javaordersapp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Orders
{
    //create primary key
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ordnum; // primary key, not null

    private double ordamount;

    private double advanceamount;

    private String orderdescription;


    // ------ Association Fields ------
    @ManyToMany()
    @JoinTable(name = "orderspayments",
        joinColumns = @JoinColumn(name = "ordnum"),
        inverseJoinColumns = @JoinColumn(name = "paymentid"))
    private Set<Payments> payments = new HashSet<>();

    // this connects Orders to Customers
    @ManyToOne()
    @JoinColumn(name = "custcode",
        nullable = false)
    @JsonIgnoreProperties(value = "orders",
        allowSetters = true)
    private Customers customers;

    // ----- Constructors ------
    public Orders()
    {
        // default constructor for JPA

    }

    // constructor with parameters
    public Orders(
        double ordamount,
        double advanceamount,
        Customers customers,
        String orderdescription)
    {
        this.ordamount = ordamount;
        this.advanceamount = advanceamount;
        this.customers = customers;
        this.orderdescription = orderdescription;
    }

    // ------ Getters and Setters -------
    public long getOrdnum()
    {
        return ordnum;
    }

    public void setOrdnum(long ordnum)
    {
        this.ordnum = ordnum;
    }

    public double getOrdamount()
    {
        return ordamount;
    }

    public void setOrdamount(double ordamount)
    {
        this.ordamount = ordamount;
    }

    public double getAdvanceamount()
    {
        return advanceamount;
    }

    public void setAdvanceamount(double advanceamount)
    {
        this.advanceamount = advanceamount;
    }

    public String getOrderdescription()
    {
        return orderdescription;
    }

    public void setOrderdescription(String orderdescription)
    {
        this.orderdescription = orderdescription;
    }


    // ------ Association Getters and Setters -------
    public Set<Payments> getPayments()
    {
        return payments;
    }

    public void setPayments(Set<Payments> payments)
    {
        this.payments = payments;
    }

    public Customers getCustomers()
    {
        return customers;
    }

    public void setCustomers(Customers customers)
    {
        this.customers = customers;
    }
}

package com.lambdaschool.javaordersapp.models;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customers
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long custcode;

    private String custname;
    private String custcity;
    private String workingarea;
    private String custcountry;
    private String Grade;

    private double openingamt;
    private double receiveamt;
    private double paymentamt;
    private double outstandingamt;

    private String phone;

    @OneToMany(mappedBy = "customer",
                cascade = CascadeType.ALL,
                orphanRemoval = true)
}

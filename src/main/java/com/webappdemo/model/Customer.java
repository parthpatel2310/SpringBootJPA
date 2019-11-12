package com.webappdemo.model;

import javax.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "customerid")
    private int customerId;

    @Column(name = "customername")
    private String customerName;

    @Column(name = "customermobile")
    private String customerMobile;

    @Column(name = "customerbalance")
    private double customerBalance;

    @Column(name = "customerpassword")
    private String customerPassword;

    @ManyToOne
    @JoinColumn(name = "cityid")
    private City customerCity;

    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerMobile="
                + customerMobile + ", customerBalance=" + customerBalance + ", customerPassword=" + customerPassword
                + ", customerCity=" + customerCity + "]";
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile;
    }

    public double getCustomerBalance() {
        return customerBalance;
    }

    public void setCustomerBalance(double customerBalance) {
        this.customerBalance = customerBalance;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public City getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(City customerCity) {
        this.customerCity = customerCity;
    }


}

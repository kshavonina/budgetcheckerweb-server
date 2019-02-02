package com.budgetcheckerweb.model;

import java.math.BigDecimal;

public class User {

    private String name;
    private String surname;
    private String email;
    private String password;
    private BigDecimal moneyAmount;

    public User() {

    }

    public User(String email, String password) {
        this("", "", email, password, BigDecimal.ZERO);
    }

    public User(String name, String surname, String email, String password, BigDecimal moneyAmount) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.moneyAmount = moneyAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(BigDecimal moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", moneyAmount=" + moneyAmount +
                '}';
    }
}

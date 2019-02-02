package com.budgetcheckerweb.model;

import java.math.BigDecimal;
import java.util.Objects;

public class User {

    private String email;
    private String password;
    private String name;
    private String surname;
    private BigDecimal moneyAmount;

    public User() {

    }

    public User(String email, String password) {
        this(email, password, "", "", BigDecimal.ZERO);
    }

    public User(String email, String password, String name, String surname, BigDecimal moneyAmount) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.moneyAmount = moneyAmount;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(email, user.email) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password);
    }
}

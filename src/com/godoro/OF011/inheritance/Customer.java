package com.godoro.OF011.inheritance;

import com.godoro.OF011.person.Person;

public class Customer extends Person {

    private long customerId;
    private double totalDebit;


    public Customer() {
    }

    public Customer(long customerId, double totalDebit) {
        this.customerId = customerId;
        this.totalDebit = totalDebit;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public double getTotalDebit() {
        return totalDebit;
    }

    public void setTotalDebit(double totalDebit) {
        this.totalDebit = totalDebit;
    }

    @Override //Person'daki getFullName metodunu eziyor bu.
    public String getFullName () {
        return lastName + ", " + firstName; // Person'daki fieldları protected yaparak, getLastName()
        // yapmadan da direkt Super Class'taki fieldları kullanabildik, yani private olan fieldlar, extend
        // edilen sınıflarda dahi kullanılamaz. Protected olan fieldlar, aynı paketteki sınıflarda ve/veya
        // extend üretilen sınıflarda(farklı pakette olsa bile) kullanılabilir.
    }

    @Override
    public String getGreetings() {
        return "Merhaba!";
    }
}

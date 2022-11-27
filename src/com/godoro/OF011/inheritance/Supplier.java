package com.godoro.OF011.inheritance;

import com.godoro.OF011.person.Person;

public class Supplier extends Person {

    private long supplierId;
    private String mainSector;


    public Supplier() {
    }

    public Supplier(long supplierId, String mainSector) {
        this.supplierId = supplierId;
        this.mainSector = mainSector;
    }

    public long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(long supplierId) {
        this.supplierId = supplierId;
    }

    public String getMainSector() {
        return mainSector;
    }

    public void setMainSector(String mainSector) {
        this.mainSector = mainSector;
    }

    @Override
    public String getGreetings() {
        return "Selam!";
    }

    @Override
    public String getFullName() {
        return firstName + " - " + lastName;
    }
}

package com.training.globant.administration;

public class Person {
    int idNumber;
    String name;
    String lastname;
    String homeAddress;
    int cellPhone;
    String bloodType;

    public Person(int idNumber, String name, String lastname, String homeAddress, int cellPhone, String bloodType) {
        this.idNumber = idNumber;
        this.name = name;
        this.lastname = lastname;
        this.homeAddress = homeAddress;
        this.cellPhone = cellPhone;
        this.bloodType = bloodType;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public int getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(int cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }


}

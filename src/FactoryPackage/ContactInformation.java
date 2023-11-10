package FactoryPackage;

import java.util.Objects;

public abstract class ContactInformation {
    private String firstName;
    private String surName;
    private int age;
    private String phoneNumber;
    private String optionalPhoneNumber=" ";
    private String address;
    private String buildingNumber;
    private String cityName;
    private int zipCode;
    public ContactInformation(String firstName, String sureName, int age, String phoneNumber, String optionalPhoneNumber, String address, String buildingNumber, String cityName, int zipCode) {
        this.firstName = firstName;
        this.surName = sureName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.optionalPhoneNumber=optionalPhoneNumber;
        this.address = address;
        this.buildingNumber = buildingNumber;
        this.cityName = cityName;
        this.zipCode = zipCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return Integer.parseInt(String.valueOf(age));
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getOptionalPhoneNumber() {
        return optionalPhoneNumber;
    }

    public void setOptionalPhoneNumber(String optionalPhoneNumber) {
        this.optionalPhoneNumber = optionalPhoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getZipCode() {
        return zipCode;
    }
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }if (obj==null||getClass()!=obj.getClass()){
            return false;
        }
        ContactInformation otherContactInformation=(ContactInformation) obj;
        return Objects.equals(this.firstName, otherContactInformation.firstName)&&
                Objects.equals(this.surName,otherContactInformation.surName)&&
                Objects.equals(this.age,otherContactInformation.age)&&
                Objects.equals(this.phoneNumber,otherContactInformation.phoneNumber)&&
                Objects.equals(this.optionalPhoneNumber,otherContactInformation.optionalPhoneNumber)&&
                Objects.equals(this.address,otherContactInformation.address)&&
                Objects.equals(this.buildingNumber,otherContactInformation.buildingNumber)&&
                Objects.equals(this.cityName,otherContactInformation.cityName)&&
                Objects.equals(this.zipCode,otherContactInformation.zipCode);
    }

    @Override
public String toString(){
            return " För och efternamn: " +getFirstName().toUpperCase() +" "+ getSurName().toUpperCase() + " \n ålder: " + getAge() + "\n mobile:" + getPhoneNumber() + " \n telefonnummer: "
                    + getOptionalPhoneNumber() +"\n Gatunamn: " +
                    getAddress() + "\n port nummer: " + getBuildingNumber() + "\n ort:" + getCityName() +"\n postnummer: "+ getZipCode() + "\n " +
                    "______________________________________________________________________________________________________________";
    }

}

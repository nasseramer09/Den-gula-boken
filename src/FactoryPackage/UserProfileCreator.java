package FactoryPackage;

public class UserProfileCreator extends ContactInformation {

    public UserProfileCreator(String firstName, String surName, int age, String phoneNumber, String optionalPhoneNumber, String address, String buildingNumber, String cityName, int zipCode) {
        super(firstName, surName, age, phoneNumber, optionalPhoneNumber, address, buildingNumber, cityName, zipCode);
    }

}

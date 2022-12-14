package com.company;

public class Customer {
    private String firstName;

    private String lastName;

    private String email;

    private int phoneNumber;

    private Address shippingAddress;

    private Address billingAddress;

    private RewardsMember rewardsCard;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public RewardsMember getRewardsCard() {
        return rewardsCard;
    }

    public void setRewardsCard(RewardsMember rewardsCard) {
        this.rewardsCard = rewardsCard;
    }
}

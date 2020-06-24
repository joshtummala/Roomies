package com.roomies.backend.data;

import java.util.Date;

/** A user that is an industry professional such as a landlord or real-estate agent.*/
public class ProfessionalUser extends User {

  ProfessionalType type;
  String zipCode;
  String phoneNumber;

  public ProfessionalUser() {}

  public ProfessionalUser(String username, String password, String email, Date dob,
                          Location location, ProfessionalType type, String zipCode,
                          String phoneNumber) {
    super(username, password, email, dob, location);
    this.type = type;
    this.zipCode = zipCode;
    this.phoneNumber = phoneNumber;
  }

  public ProfessionalType getType() {
    return type;
  }

  public void setType(ProfessionalType type) {
    this.type = type;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


}

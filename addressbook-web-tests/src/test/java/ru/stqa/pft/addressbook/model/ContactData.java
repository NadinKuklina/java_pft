package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String firstName;
  private final String middleName;
  private final String lastName;
  private final String nickName;
  private final String title;
  private final String company;
  private final String address;
  private final String homeTelephone;
  private final String mobileTelephone;
  private final String workTelephone;
  private final String faxTelephone;
  private final String email1;
  private final String email2;
  private final String email3;
  private final String homePage;
  private final String secondaryAddress;
  private final String secondaryHome;
  private final String notes;

  public ContactData(String firstName, String middleName, String lastName, String nickName, String title, String company,
                          String address, String homeTelephone, String mobileTelephone, String workTelephone, String faxTelephone,
                          String email1, String email2, String email3, String homePage, String secondaryAddress, String secondaryHome, String notes) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.nickName = nickName;
    this.title = title;
    this.company = company;
    this.address =  address;
    this.homeTelephone = homeTelephone;
    this.mobileTelephone = mobileTelephone;
    this.workTelephone = workTelephone;
    this.faxTelephone = faxTelephone;
    this.email1 = email1;
    this.email2 = email2;
    this.email3 = email3;
    this.homePage = homePage;
    this.secondaryAddress = secondaryAddress;
    this.secondaryHome = secondaryHome;
    this.notes = notes;
  }
  public String getFirstName() {
    return firstName;
  }
  public String getMiddleName() { return middleName; }
  public String getLastName() { return lastName; }
  public String getNickName() { return nickName; }
  public String getTitle() { return title; }
  public String getCompany() { return company; }
  public String getAddress() { return address; }
  public String getHomeTelephone() { return homeTelephone; }
  public String getMobileTelephone() { return mobileTelephone; }
  public String getWorkTelephone() { return workTelephone; }
  public String getFaxTelephone() { return faxTelephone; }
  public String getEmail1() { return email1; }
  public String getEmail2() { return email2; }
  public String getEmail3() { return email3; }
  public String getHomePage() { return homePage; }
  public String getSecondaryAddress() { return secondaryAddress; }
  public String getSecondaryHome() { return secondaryHome; }
  public String getNotes() { return notes; }
}

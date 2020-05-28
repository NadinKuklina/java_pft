package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getNavigationHelper().gotoAddNewPage();
    app.getContactHelper().createContact(new ContactData("Anna", "Olegovna", "Kuklina",
            "KOA", "test1", "test title", "test company", "test address", "216230", "89876543322",
            "457889", "457889", "11@mail.ru", "12@mail.ru",
            "13@mail.ru", "www.homepage", "2 address", "2 home", "35"));
  }

}

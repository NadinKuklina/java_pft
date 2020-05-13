package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

public class ContactModificationTests extends TestBase {
  @Test
  public void testContactModification() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Anna1", "Olegovna1", "Kuklina1",
            "KOA1", "test title1", "test company1", "test address1", "2162301", "898765433221",
            "4578891", "4578891", "11@mail.ru1", "12@mail.ru1",
            "13@mail.ru1", "www.homepage1", "2 address1", "2 home1", "351"));
    app.getContactHelper().submitContactUpdate();
  }

}

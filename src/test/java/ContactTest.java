import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class ContactTest {

  @Test
  public void Contact_initiatesCorrectly_true() {
    Contact myContact = new Contact ("Jacob Steinberg", "test address", "29");
    assertEquals(true, myContact instanceof Contact);
  }
  @Test
  public void Contact_getsName() {
    Contact myContact = new Contact ("Jacob Steinberg", "test address", "29");
    assertEquals("Jacob Steinberg", myContact.getName());
  }
  @Test
  public void Contact_getsAddress() {
    Contact myContact = new Contact ("Jacob Steinberg", "test address", "29");
    assertEquals("test address", myContact.getAddress());
  }
  @Test
  public void Contact_getsAge() {
    Contact myContact = new Contact ("Jacob Steinberg", "test address", "29");
    assertEquals("29", myContact.getAge());
  }

  @Test
    public void all_returnsAllInstancesOfContact_true() {
      Contact firstContact = new Contact ("Jonah Hill", "test address", "29");
      Contact secondContact = new Contact ("James Franco", "test address", "45");
      assertTrue(Contact.all().contains(firstContact));
      assertTrue(Contact.all().contains(secondContact));
  }

  @Test
  public void getId_returnsIdOfContact_id() {
    Contact testContact = new Contact("test", "test2", "45");
    assertEquals(Contact.all().size(), testContact.getId());
  }

  @Test
  public void find_returnsContactByItsID_testContact() {
   Contact testContact = new Contact("test", "test2", "August");
   Contact testContact2 = new Contact("test2", "test3", "October");
   assertEquals(testContact2, Contact.find(testContact2.getId()));
 }
  @Test
  public void find_throwsExceptionWhenIDIsOutOfBounds() {
    Contact testContact = new Contact("test", "test2", "August");
    Contact testContact2 = new Contact("test2", "test3", "October");
    assertTrue(Contact.find(999) == null);
  }

  @Test
  public void clear_emptiesAllContactsFromArrayList() {
    Contact myContact = new Contact("test", "test", "test");
    Contact.clear();
    assertEquals(Contact.all().size(), 0);
  }

  @Test
  public void getPhones_initiallyReturnsEmptyArrayList() {
    Contact testContact = new Contact("test2", "test3", "334-2234");
    assertTrue(testContact.getPhones() instanceof ArrayList);
  }

  @Test
  public void addPhone_addsPhoneObjectToPhoneArrayList() {
    Contact testContact = new Contact("john doe", "address", "23");
    Phone testPhone = new Phone("cell", "505", "555-5555");
    testContact.addPhone(testPhone);
    assertTrue(testContact.getPhones().contains(testPhone));
  }
}

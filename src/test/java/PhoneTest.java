import java.util.ArrayList;

import org.junit.*;
import static org.junit.Assert.*;

public class PhoneTest {

  @Test
  public void Phone_instantiatesCorrectly_true() {
    Phone myPhone = new Phone ("cell", "707", "221-3333");
    assertEquals(true, myPhone instanceof Phone);
  }
  @Test
  public void Phone_intantiatesWithCellType_cell() {
    Phone myPhone = new Phone ("cell", "707", "221-3333");
    assertEquals("cell", myPhone.getType());
  }

  @Test
  public void Phone_intantiatesWithAreaCode_707() {
    Phone myPhone = new Phone ("cell", "707", "221-3333");
    assertEquals("707", myPhone.getCode());
  }

  @Test
  public void Phone_intantiatesWithNumber() {
    Phone myPhone = new Phone ("cell", "707", "221-3333");
    assertEquals("221-3333", myPhone.getNumber());
  }

  @Test
    public void all_returnsAllInstancesOfPhone_true() {
      Phone firstPhone = new Phone ("cell", "818", "329-4444");
      Phone secondPhone = new Phone ("home", "227", "453-4444");
      assertTrue(Phone.all().contains(firstPhone));
      assertTrue(Phone.all().contains(secondPhone));
  }

  @Test
  public void newId_PhoneInstantiateWithAnID_true() {
    Phone myPhone = new Phone("cell", "818", "329-4444");
    assertEquals(Phone.all().size(), myPhone.getId());
  }

  @Test
  public void find_returnsPhoneWithSameId_secondPhone() {
    Phone firstPhone = new Phone("cell", "818", "329-4444");
    Phone secondPhone = new Phone("home", "418", "329-1444");
    assertEquals(Phone.find(secondPhone.getId()), secondPhone);
  }

  @Test
  public void find_returnsNullWhenNoPhoneFound_null() {
    assertTrue(Phone.find(999) == null);
  }

  @Test
  public void clear_emptiesAllPhonesFromArrayList() {
    Phone myPhone = new Phone("home", "418", "329-1444");
    Phone.clear();
    assertEquals(Phone.all().size(), 0);
  }
}

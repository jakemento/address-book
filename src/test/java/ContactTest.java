import org.junit.*;
import static org.junit.Assert.*;

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
}
//
//   @Test
//   public void Task_intantiatesWithDescription_true() {
//     Task myTask = new Task ("Mow the lawn");
//     assertEquals("Mow the lawn", myTask.getDescription());
//   }
//
//   @Test
//   public void isCompleted_isFalseAfterInstantiaon_false() {
//     Task myTask = new Task("Mow the lawn");
//     assertEquals(false, myTask.isCompleted());
// }
//
//   @Test
//   public void getCreateAt_instantiatesWithCurrentTime_today() {
//     Task myTask = new Task("Mow the lawn");
//     assertEquals(LocalDateTime.now().getDayOfWeek(), myTask.getCreatedAt().getDayOfWeek());
// }
//
//   @Test
//   public void all_returnsAllInstancesOfTask_true() {
//     Task firstTask = new Task("Mow the lawn");
//     Task secondTask = new Task("Buy groceries");
//     assertTrue(Task.all().contains(firstTask));
//     assertTrue(Task.all().contains(secondTask));
// }
//
//   @Test
//   public void newId_tasksInstantiateWithAnID_true() {
//     Task myTask = new Task("Mow the lawn");
//     assertEquals(Task.all().size(), myTask.getId());
// }
//
//   @Test
//   public void find_returnsTaskWithSameId_secondTask() {
//     Task firstTask = new Task("Mow the lawn");
//     Task secondTask = new Task("Buy groceries");
//     assertEquals(Task.find(secondTask.getId()), secondTask);
// }
//
//   @Test
//   public void find_returnsNullWhenNoTaskFound_null() {
//     assertTrue(Task.find(999) == null);
// }
//
//   @Test
//   public void clear_emptiesAllTasksFromArrayList() {
//     Task myTask = new Task("Mow the lawn");
//     Task.clear();
//     assertEquals(Task.all().size(), 0);

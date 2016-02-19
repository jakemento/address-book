import java.util.ArrayList;


public class Contact {
  private static ArrayList<Contact> instances = new ArrayList<Contact>();
  private String mName;
  private String mAddress;
  private String mAge;
  private int mId;

  public Contact(String name, String address, String age ) {
    mName = name;
    mAddress = address;
    mAge = age;
    instances.add(this);
    mId = instances.size();
  }

  public String getName(){
    return mName;
  }
  public String getAddress(){
    return mAddress;
  }
  public String getAge(){
    return mAge;
  }

  public static ArrayList<Contact> all(){
    return instances;
  }

  public int getId(){
    return mId;
  }

  public static Contact find(int id) {
    try {
      return instances.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }

  public static void clear() {
    instances.clear();
  }
}

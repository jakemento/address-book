import java.util.ArrayList;

public class Phone {
  private static ArrayList<Phone> instances = new ArrayList<Phone>();

  private String mType;
  private String mAreaCode;
  private String mNumber;
  private int mId;

  public Phone(String type, String areaCode, String number) {
    mType = type;
    mAreaCode = areaCode;
    mNumber = number;
    instances.add(this);
    mId = instances.size();
  }

  public String getType() {
    return mType;
  }

  public String getCode() {
    return mAreaCode;
  }

  public String getNumber() {
    return mNumber;
  }

  public static ArrayList<Phone> all() {
    return instances;
  }

  public int getId () {
    return mId;
  }

  public static Phone find(int id) {
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

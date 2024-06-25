//The concurrent modificaiton exception occurs when you try to
//modify and array while looping through it
//to avoid this we will remove the item outside the loop

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class ConcurrentModificationExceptionFix {

  public static void main(String[] args) {
    // Your array
    List<String> names = new ArrayList<>();
    // things in the array
    names.add("Ziad");
    names.add("Ziad1");
    names.add("Ziad2");
    names.add("Ziad3");
    System.out.println(names);
    //condition to set in the for loop
    //loop
    String nametodelete = "";
    try {
      for (String name : names) {
        if (name.contains("1")) {
          nametodelete = name;
          names.remove(name);
        }
      }
    }
    catch (ConcurrentModificationException e) {
      System.out.println("Caught ConcurrentModificationException while deleting [" + nametodelete + "]");
    }

    System.out.println(names);
  }
}

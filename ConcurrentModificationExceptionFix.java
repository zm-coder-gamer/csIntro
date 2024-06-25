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
    names.add("Johnathan");
    names.add("Lily");
    names.add("Nick");
    names.add("Richard");
    names.add("Dorothy");
    names.add("Jim");
    System.out.println(names);
    //condition to set in the for loop
    //loop
    String nametodelete = "";
    try {
      for (String name : names) {
        if (name.length() < 5) {
          nametodelete = name;
          names.remove(name);
        }
      }
    }
    catch (ConcurrentModificationException e) {
      System.out.println("Caught ConcurrentModificationException while deleting [" + nametodelete + "]");
    }

    System.out.println(names);
    // lets do it the right way
    List<String> namestodelete = new ArrayList<>();
    for (String name : names) {
      if (name.length() < 5) {
        namestodelete.add(name);
      }
    }
    if (namestodelete.size() > 0) {
      names.removeAll(namestodelete);
    }
    System.out.println(names);
  }
}

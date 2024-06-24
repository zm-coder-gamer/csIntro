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
    boolean removeZiad2 = false;
    for (String name : names) {
      try {
        names.remove("Ziad2");
      } catch (ConcurrentModificationException e) {
        System.out.println("Cannot modify a list when list is part of the condition in the for loop.");
        removeZiad2 = true;
      }
    }
    if (removeZiad2) {
      System.out.println("Safely modify the list by modifying it outside the loop.");
      names.remove("Ziad2");
    }
    System.out.println(names);
  }
}

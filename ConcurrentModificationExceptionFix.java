//The concurrent modificaiton exception occurs when you try to 
//modify and array while looping through it
//to avoid this we will remove the item outside the loop

import java.util.ArrayList;
import java.util.List;

public class MyClass {
    public static void main(String args[]) {
      // Your array
      List<String> myArray = new ArrayList<>();
      // things in the array
      myArray.add("Ziad");
      myArray.add("Ziad1");
      myArray.add("Ziad2");
      myArray.add("Ziad3");
      System.out.println(myArray);
      //condition to set in the for loop
      boolean removename = false;
      //loop
        for (String xyz: myArray) {
          //  if statement
          if (xyz == "Ziad2") {    
            // set condition to true    
            removename=true;
            }
        }
      // remove the item outside your loop
        if (removename){
            myArray.remove("Ziad2");
        }
      System.out.println(myArray);
    }
}

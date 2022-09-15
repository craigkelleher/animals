package com.tlglearning.animals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args){
    // a list of animals using an interface : List
    // List<Wolf> wolves = new ArrayList<Wolf>();
    List<Wolf> wolves = new ArrayList<>();  //reference type of wolves is List "list of Wolf"
    // instance at run time is: ArrayList, creating an instance of ArrayList
    // a pointer to that array list is what is actually being stored.
    wolves.add(new Wolf());
    wolves.add(new Wolf());
    wolves.add(new Wolf());
    wolves.add(new Dog());
    wolves.add(new Dog());
    wolves.add(new Dog());
    Collections.shuffle(wolves);
    //iterate over the contents of this loop. arraylist is an iterable.
    //enhanced for loop ( for each loop) , use colons
    //for each Wolf in the list wolves, and referring to each in turn with w, perform steps in statement following ()
    for(Wolf w: wolves){
      System.out.println();
      System.out.println(w.getClass().getName()); //will show us instance type, what it is currently pointing to.
      w.hunt(); //wolf version when executed
      w.vocalize(); //if pointing to instance of wolf, wolf will be invoked
      // if its currently pointing at dog, dog will print out.
      //w.whoAmI(); // invoking static method with instance reference, normally done on classes though.
      //reference type is Wolf. Instance type will depend on what it points to
      // if pointing to dog instance, whoAmI will invoke? wolf
      // static methods are resolved at compile time based on reference time
      // non static polymorphic methods (can be inherited, so no static or private) depends on instance type at run time
      // so at run time, but because whoAmI is a static method, it looks only at the reference type of w,
      // and compiler looks at w and says ref type of w is wolf, from the for loop. so I will compile
      // the direct invocation of the wolf whoAmI method.

/*      if (w instanceof Dog) { // invoking static methods, polymorphism isnt play, we are writing our own brute force polymorpism
        // treat w as if its reference type is Dog.
        ((Dog) w).whoAmI(); // object type cast (class cast). cast to interface.
      } else {
        Wolf.whoAmI();
      }*/
      if (w instanceof Dog) {
        // Dog d = (Dog) w;
        // d.rollOver();
        ((Dog) w).rollOver(); // reference thinks its wolf, but rollOver doesnt exist in wolf class
      }

    }
  }

}

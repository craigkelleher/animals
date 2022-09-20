package com.tlglearning.animals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args){
    new Dog();
    /*
    0. Class initialization of Wolf superclass (object), not necessary, because Object is already loaded and initialized
      This is because class's superclass is Object.
    1. Class initialization of Wolf
    2. Class initialization of Dog
    2a. Object's initialization of Dog instance
    3. Wolf's initialization of Dog instance
    4. Dog's initialization of Dog instance.
     */
  }
}

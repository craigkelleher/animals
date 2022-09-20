package com.tlglearning.animals;

import static com.tlglearning.animals.Dog.initializeValue;

public class Wolf {
  //invocation of a method. Declaration with initialization due to final.
  private static final int MY_CONSTANT = initializeValue();

  private int data = initializeData();

  //static initialization
  static{
    System.out.println("Wolf static initialization block");
  }
  //instance initialization block is just empty thing with {}
  {
    System.out.println("Wolf instance initialization block");
  }

  //constructor, to show importance of order
  public Wolf(){
    System.out.println("Wolf constructor");
  }

  private static int initializeValue(){
    System.out.println("Wolf.initializeValue");
    return -1;
  }

  private int initializeData(){
    System.out.println("Wolf.initializeData");
    return 1;
  }

  public void vocalize(){
    System.out.println("Howl like a wolf!");
  }

  public void hunt(){
    System.out.println("Hunt in packs for live prey");
  }

  public static void whoAmI(){
    System.out.println("I am a wolf");
  }
}

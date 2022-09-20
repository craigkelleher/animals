package com.tlglearning.animals;

public class Dog extends Wolf {
  // inherit hunt and vocalize
  //cannot override whoAmI, as it is static

  private static final int MY_CONSTANT = initializeValue();

  private int data = initializeData();

  static {
    System.out.println("Dog initialization Block");
  }

  // non static initialization
  {
    System.out.println("Dog instance initialization block");
  }

  {
    System.out.println("Dog instance initialization block");
  }

  // constructor
  public Dog() {
    super();
    System.out.println("Dog constructor");
  }

  //methods
  public static int initializeValue() {
    System.out.println("Dog.initializeValue");
    return -1;
  }

  public static void whoAmI() {
    System.out.println("I am a dog");
  }

  private int initializeData() {
    System.out.println("Dog.initializeData");
    return 2;
  }

  @Override
  public void vocalize() {
    //super.vocalize(); //not invoking inherited behavior
    System.out.println("Bark like a dog!");
  }

  @Override
  public void hunt() {
    //super.hunt();
    System.out.println("Hunt for balls, leaves, bones, etc.");
  }

  public void rollOver() {
    System.out.println("I'm rolling over! I'm the best dog!");
  }
}

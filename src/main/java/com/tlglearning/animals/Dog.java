package com.tlglearning.animals;

public class Dog extends Wolf {
  // inherit hunt and vocalize
  //cannot override whoAmI, as it is static

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

  public static void whoAmI(){
    System.out.println("I am a dog");
  }

  public void rollOver(){
    System.out.println("I'm rolling over! I'm the best dog!");
  }
}

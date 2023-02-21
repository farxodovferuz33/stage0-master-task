package com.epam.OOP;

public class Animal {
    String color;
    int numberOfPaws;
    boolean hasFur;

    public void getDescription(String color, int numberOfPaws, boolean hasFur) {
        System.out.println("This animal is mostly "+ color + ". It has "+ (numberOfPaws>1?"paws ":"paw ")+ "and "+numberOfPaws+ (hasFur?" a":" no")+ " fur");
    }
  
}

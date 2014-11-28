package com.denis.smolov.app;

public class Main {

  public static void main(String[] args) {
    Factorial f = new Factorial();
    System.out.println("result factorial = " + f.factorial(3));
    System.out.println("result factorialRecursion = " + f.factorialRecursion(3));
  }

}

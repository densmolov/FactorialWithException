package com.denis.smolov.app;

public class Factorial {

  public int factorial(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
      result *= i;
    }
    return result;
  }

  public int factorialRecursion(int n) {
    int result = 1;
    if (n == 1) {
      return result;
    }

    if (n >= 1) {
      for (int i = 1; i <= n; i++) {
        result = factorialRecursion(n - 1) * n;
      }
      return result;
    } else {
      throw new IllegalArgumentException("Argument is less than one.");
    }
  }

}

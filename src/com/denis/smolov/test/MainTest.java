package com.denis.smolov.test;

import com.denis.smolov.app.Factorial;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MainTest {

  @Test
  public void testAssertArrayEquals() {
    Factorial fTest = new Factorial();
    int result1 = fTest.factorial(3);
    int result2 = fTest.factorial(5);
    int result3 = fTest.factorial(1);
    int[] expected = {result1, result2, result3};
    int[] actual = {6, 120, 1};
    Assert.assertArrayEquals("Alarm! Int arrays are not equal.", expected, actual);
  }

  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void testExceptionMessage() throws IllegalArgumentException {
    Factorial fTest = new Factorial();
    fTest.factorial(-1);
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("Argument is less than one.");
    fTest.factorialRecursion(-7);
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("Argument is less than one.");
  }

}

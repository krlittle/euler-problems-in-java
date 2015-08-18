package problems;

// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
// Find the sum of all the multiples of 3 or 5 below 1000.

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestEuler1
{

   Euler1 euler1 = new Euler1();
   
   @Test
   public void test()
   {
      assertEquals(233168, euler1.run());
   }

}

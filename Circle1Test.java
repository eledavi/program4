
/***
* Example JUnit testing class for Circle1 (and Circle)
*
* - must have your classpath set to include the JUnit jarfiles
* - to run the test do:
*     java org.junit.runner.JUnitCore Circle1Test
* - note that the commented out main is another way to run tests
* - note that normally you would not have print statements in
*   a JUnit testing class; they are here just so you see what is
*   happening. You should not have them in your test cases.
***/

import org.junit.*;

public class Circle1Test
{
   // Data you need for each test case
   private Circle1 circle1;
   // ADDED: another Circle1 variable to test 
   private Circle1 circle2;  
   private Circle1 circle3;  

// 
// Stuff you want to do before each test case
//
@Before
public void setup()
{
   System.out.println("\nTest starting...");
   circle1 = new Circle1(1,2,3);
   circle2 = new Circle1(4,5,6);
   circle3 = new Circle1(9,9,1);
}

//
// Stuff you want to do after each test case
//
@After
public void teardown()
{
   System.out.println("\nTest finished.");
}

//
// Test a simple positive move
//
@Test
public void simpleMove()
{
   Point p;
   System.out.println("Running test simpleMove.");
   p = circle1.moveBy(1,1);
   Assert.assertTrue(p.x == 2 && p.y == 3);
}

// 
// Test a simple negative move
//
@Test
public void simpleMoveNeg()
{
   Point p;
   System.out.println("Running test simpleMoveNeg.");
   p = circle1.moveBy(-1,-1);
   Assert.assertTrue(p.x == 0 && p.y == 1);
}

//
// ADDED: Test a simple scaling
//
@Test
public void simpleScaling() {
   double r;
   r = 1.5;
   r = circle1.scale(r);
   Assert.assertTrue(r == 4.5);
}

//
// ADDED: Test a simple intersection (true)
//
@Test
public void simpleIntersect () {
   boolean doesIntersect = circle1.intersects(circle2);
   Assert.assertTrue(doesIntersect);
}

//
// ADDED: Test a simple intersection (false)
//
@Test
public void simpleIntersectFalse () {
   boolean doesIntersect = circle1.intersects(circle3);
   Assert.assertFalse(doesIntersect);
}

/*** NOT USED
public static void main(String args[])
{
   try {
      org.junit.runner.JUnitCore.runClasses(
               java.lang.Class.forName("Circle1Test"));
   } catch (Exception e) {
      System.out.println("Exception: " + e);
   }
}
***/

}


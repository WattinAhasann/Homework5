/*
Wattin Ahasan
SE 4367.001
Homework 5
 */

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

//12 tests in total, 11 running and 1 commented out
//the 12 tests includes the one possible fault that you could place into the cal() method that my tests do  and do not find.

public class TestCalFunction {

    @Test
    public void testOne() {
        int test1 = DaysDurationCalculator.cal(0,  28, 1, 29, 2022);

        //System.out.println(test1); test1 or actual = 1

        assertEquals(1, test1);
    }

    @Test
    public void testTwo() {
        int test2 = DaysDurationCalculator.cal(2, 28, 2, 29, 2020);

        //System.out.println(test2); test2 or actual = 1

        assertEquals(1, test2);
    }
    @Test
    public void testThree() {
        int test3 = DaysDurationCalculator.cal(5, 3, 6, 3, 2019);

        //System.out.println(test3); test3 or actual = 3

        assertEquals(31, test3);
    }

    @Test
    public void testFour() {
        int test4 = DaysDurationCalculator.cal(4, 15, 4, 21, 2021);

        //System.out.println(test4); test4 or actual = 6

        assertEquals(6, test4);
    }

    @Test
    public void testFive() {
        int test5 = DaysDurationCalculator.cal(3, 21, 3, 25, 2022);

        //System.out.println(test5); test5 or actual = 4

        assertEquals(4, test5);
    }

    @Test
    public void testSix() {
        int test6 = DaysDurationCalculator.cal(12, 28, 12, 28, 2020);

        //System.out.println(test6); test6 or actual = 0

        assertEquals(0,test6);
    }

    @Test
    public void testSeven() {
        int test7 = DaysDurationCalculator.cal(12, 28, 12, 29, 2020);

        //System.out.println(test7); test7 or actual = 1

        assertEquals(1,test7);
    }

    @Test
    public void testEight() {
        int test8 = DaysDurationCalculator.cal(7, 15, 7, 19, 2018);

        //System.out.println(test8); test8 or actual = 4

        assertEquals(4, test8);
    }

    @Test
    public void testNine() {
        int test9 = DaysDurationCalculator.cal(1, 1, 12, 31, 2020);

        //System.out.println(test9); test9 or actual = 365

        assertEquals(365, test9);
    }

    @Test
    public void testTen() {
        int test10 = DaysDurationCalculator.cal(4, 1, 4, 10, 2020);

        //System.out.println(test10); test10 or actual = 365

        assertEquals(9, test10);
    }

    //one possible fault that you could place into the cal() method that your tests do not find.
    //in the while loop, it said that
    // while ( month1 > month2 ){
    //            System.out.println ("month1 must be prior or equals to month2");
    //however, the test is not finding the fault

    @Test
    public void testEleven() {
        int test11 = DaysDurationCalculator.cal(9, 28, 7, 10, 1000);

        //System.out.println(test11); test11 or actual = 12

        assertEquals(12, test11);
    }

    //one possible fault that you could place into the cal() method that your tests do find.
    //2020 is a leap year so starting from February 28 to March 10th, it is 12 days and not 11 days

    //uncomment to see that fault in the test
//
//    @Test
//    public void testTwelve() {
//        int test12 = DaysDurationCalculator.cal(2, 28, 3, 10, 2020);
//
//        //System.out.println(test12); test12 or actual = 12
//        assertEquals(12, test12);
//    }

}
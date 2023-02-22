package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int numLast = number%10; //last digit
        int numFirstThree = number/10; //first 3 digit
        int numFirstThreeLast = numFirstThree%10; //first 3 digit last
        int numFirstThreeLastFirstTwo = numFirstThree/10;  //first 3 digit first 2
        int numFirstThreeFirstTwoLast = numFirstThreeLastFirstTwo%10;
        int numFirst = numFirstThreeLastFirstTwo/10;

        int sum = numFirst+numFirstThreeLast+numFirstThreeFirstTwoLast+numLast;

        System.out.println(sum);
    }

}

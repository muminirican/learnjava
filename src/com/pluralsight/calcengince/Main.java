package com.pluralsight.calcengince;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 3.0d, 17.0d};
        char[] opcodes = new char[4];
        opcodes[0] = 'a';
        opcodes[1] = 's';
        opcodes[2] = 'm';
        opcodes[3] = 'd';

        //or simply
        // char[] opcodes = {'a', 'd', 's', 'm'}

        double[] results = new double[opcodes.length];

        for (int i = 0; i < opcodes.length ; i++) {
         /*   switch(opcodes[i]) {
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case 'd':
                    results[i] = rightVals[i] != 0.0d ? leftVals[i] / rightVals[i] : 0.0d ;
                    break;
                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                default:{
                    System.out.println("Error - invalid opcode");
                    results[i] = 0.0d;
                    break;}
            } */

        }

        for(double theResult : results) {
            System.out.println("result = ");
            System.out.println(theResult);

        }
    }
}



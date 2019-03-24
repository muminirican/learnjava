package com.pluralsight.calcengince;

public class MathEquation {
    public double getLeftVal() {
        return leftVal;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    private double leftVal;

    public double getRightVal() {
        return rightVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    private double rightVal;

    public char getOpCode() {
        return opCode;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    private char opCode;

    public double getResult() {
        return result;
    }

    private double result;

    public void execute(){
        switch(opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                result = rightVal != 0.0d ? leftVal / rightVal : 0.0d ;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:{
                System.out.println("Error - invalid opCode");
                result = 0.0d;
                break;}
        }
    }
}

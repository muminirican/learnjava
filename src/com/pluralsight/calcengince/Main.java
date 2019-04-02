package com.pluralsight.calcengince;

public class Main {

    public static void main(String[] args) {

        MathEquation testEquation = new MathEquation();
        testEquation.execute();
        System.out.println("test= ");
        System.out.println(testEquation.getResult());

        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a',25.0d ,92.0d);
        equations[2] = new MathEquation('s',225.0d ,17.0d);
        equations[3] = new MathEquation('m',11.0d ,3.0d);

        for(MathEquation equation : equations) { //this is a special type of for which is there in Java
            equation.execute(); // this one sets the "result" member of the MathEquation Class
            System.out.println("result = ");
            System.out.println(equation.getResult());

        }

        System.out.println();
        System.out.println("using overloads");
        System.out.println();

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;

        MathEquation equationOverload = new MathEquation('d');
        equationOverload.execute(leftDouble, rightDouble);
        System.out.println("result = ");
        System.out.println(equationOverload.getResult());

        System.out.println();
        System.out.println("using inheritence");
        System.out.println();


        CalculateBase[] calculators = {
                new Divider(100.0d ,50.0d),
                new Adder(25.0d ,92.0d ),
                new Subtracter(225.0d ,17.0d ),
                new Multiplier(11.0d , 3.0d ), //so this is a comma when inside the block
        };

        for(CalculateBase a: calculators){
            a.calculate();
            System.out.println("result =");
            System.out.println(a.getResult());
        }

        System.out.println();
        System.out.println("using strings");
        System.out.println();

        String[] statements = {
                "add 1.0",
                "add xx 1.0",
                "addX 0.0 0.0",
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0",
                "multiply 11.0 3.0"
        };

        CalculateHelper helper = new CalculateHelper();
        for(String statement: statements){
            try {
                helper.process(statement);
                System.out.println(helper.toString());
            } catch (InvalidStatementException e){
                System.out.println(e.getMessage());
                if(e.getCause() != null)
                    System.out.println("  Original exception: " + e.getCause().getMessage());
            }
        }
    }
    // create a new method inside the Main Class
    //public static MathEquation create(double leftVal, double rightVal, char opCode){
    //    MathEquation equation = new MathEquation();
    //    equation.setLeftVal(leftVal);
    //    equation.setRightVal(rightVal);
    //    equation.setOpCode(opCode);
//
    //    return equation;
    //}


}



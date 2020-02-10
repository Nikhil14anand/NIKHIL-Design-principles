package calculator;
import operations.Operations;

public class Calc {
    private Operations operation;
    public Calc(){

        operation = new Operations();
    }
    public float getResult(char operator,float op1,float op2){

        switch (operator){
            case '+':
                return this.operation.add(op1,op2);
            case '-':
                return this.operation.subtract(op1,op2);
            case '*':
                return this.operation.multiply(op1,op2);
            case '/':
                return this.operation.divide(op1,op2);
            case '%':
                return this.operation.modulus(op1,op2);
        }

        return -1;

    }
}
package homeworkweek8;

public class SimpleCalculator {
    double firstNumber;
    double secondNumber;

    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    public  void setFirstNumber(double firstNumber){
        this.firstNumber=firstNumber;

    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber=secondNumber;
    }
    public double getAdditionResult(){
        double addition=this.firstNumber + this.secondNumber;
        return addition;
    }
    public double getSubtractionResult() {
        double subtraction = this.firstNumber-this.secondNumber;
        return subtraction;
    }
    public double getMultiplicationResult(){
        double multiplication=this.firstNumber * this.secondNumber;
        return multiplication;
    }
    public double getDivisionResult() {
        double division = this.firstNumber / this.secondNumber;

        if (this.secondNumber == 0) {
            division = 0;
        } else {
            division = this.firstNumber / this.secondNumber;
        }
        return division;
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
//        OUTPUT
//                add= 9.0
//        subtract= 1.0
//        multiply= 0.0
//        divide= 0.0

    }
    }




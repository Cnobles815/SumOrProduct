package nobles.christopher.SumOrProduct;

/**
 * Created by christophernobles on 9/10/16.
 */
public class Brain {

    Display display;
    Calculator calculator;

    public Brain(){

        this.display = new Display();
        this.calculator = new Calculator();

    }

    public void setMode() {

        String userInput1 = display.getUserInputStr();

        if (userInput1.equals("Add"))
            display.showResult(calculator.calculateSum(display.getUserInput1() , display.getUserInput2()));

        if (userInput1.equals("Multiply"))
            display.showResult(calculator.calculateProduct(display.getUserInput1() , display.getUserInput2()));
    }



}

package nobles.christopher.SumOrProduct;

/**
 * Created by christophernobles on 9/10/16.
 */
public class Calculator {

    int sum = 0;
    int product = 1;

    public int calculateSum (int userNum1, int userNum2) {

        sum = userNum1 + userNum2;

        return sum;



    }

    public int calculateProduct (int userNum1, int userNum2) {

        product = userNum1 * userNum2;

        return product;
    }

    }



public class Main {
    public static void main(String[] args) {
        int intOperandA = 4;
        int intOperandB = 7;
        int intSum = 0;
        int intProduct = 0;
        int intDifference = 0;
        double intQuotient = 0;
        int intModule = 0;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum of " + intOperandA + " and " + intOperandB + " is " + intSum);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product of " + intOperandA + " and " + intOperandB + " is " + intProduct);

        intQuotient = (double) intOperandA / intOperandB;
        System.out.println("The quotient of " + intOperandA +  "and " + intOperandB + "is " + intQuotient);
        double doubleOperandA = 3.14;
        double doubleOperandB = 3.50;
        double doubleSum = 0;
        double doubleDifference = 0;
        double doubleProduct = 0;
        double doubleQuotient = 0;
        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + "is " + doubleSum);
        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference of " + doubleOperandA + " and " + doubleOperandB + "is " + doubleDifference);
        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product of " + doubleOperandA + " and " + doubleOperandB + "is " + doubleProduct);
        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient of " + doubleOperandA + " and " + doubleOperandB + "is " + doubleQuotient);

    }
}

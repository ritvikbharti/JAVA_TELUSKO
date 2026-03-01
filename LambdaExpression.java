@FunctionalInterface
interface SquareCalculator {
    int calculate(int x);
    
}
@FunctionalInterface
interface Concatenator {   
     String concatenate(String a, String b);
}
public class LambdaExpression {
    public static void main(String[] args) {
        // Lambda expression to calculate the square of a number
        SquareCalculator square = (int x) -> x * x;
        System.out.println("Square of 5: " + square.calculate(5));

        // Lambda expression to concatenate two strings
        Concatenator concatenator = (String a, String b) -> a + b;
        System.out.println("Concatenation of 'Hello' and ' World': " + concatenator.concatenate("Hello", " World"));
    }
}
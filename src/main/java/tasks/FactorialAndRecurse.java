package tasks;

public class FactorialAndRecurse {
    public static void main(String[] args) {
        System.out.println(factorialAndRecurse(3));
    }

    public static int factorialAndRecurse(int value) {
        if ((value == 1) || (value == 0)) {
            return 1;
        }
        return factorialAndRecurse(value - 1) * value;
    }
}


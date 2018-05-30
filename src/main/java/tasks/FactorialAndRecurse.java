package tasks;

public class FactorialAndRecurse {
    public static void main(String[] args) {
        System.out.println(factorialWithRecurse(7));
        System.out.println(factorialWithCycle(0));
    }

    private static int factorialWithRecurse(int value) {
        if ((value == 1) || (value == 0)) {
            return 1;
        }
        return factorialWithRecurse(value - 1) * value;
    }

    private static int factorialWithCycle(int value){
        int temp = 1;
        for (int i = 1; i <= value; i++) {
            temp = i * temp;
        }
        return temp;
    }
}


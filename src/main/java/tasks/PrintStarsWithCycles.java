package tasks;

public class PrintStarsWithCycles {
    public static void main(String[] args) {
    printCoubeWithStars(5);
    }
    
    private static void printCoubeWithStars(int coubeSize){
        for (int i = 0; i < coubeSize; i++) {
            for (int j = 0; j < coubeSize; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
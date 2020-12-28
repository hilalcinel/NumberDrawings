public class NumberDrawings {

    private static final int LOWER_LIMIT = 1;
    private static final int UPPER_LIMIT = 7;


    public static void printFlag() {
        System.out.println("--------------------------------------------");
        System.out.println("Example-1");

        for (int row = LOWER_LIMIT; row <= UPPER_LIMIT; row++) {
            for (int col = LOWER_LIMIT; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        for (int row = UPPER_LIMIT - 1; row >= LOWER_LIMIT; row--) {
            for (int col = LOWER_LIMIT; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void printRaceFlag() {
        System.out.println("--------------------------------------------");
        System.out.println("Example-2");

        for (int row = UPPER_LIMIT; row >= LOWER_LIMIT; row--) {
            for (int col = LOWER_LIMIT; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        for (int row = LOWER_LIMIT + 1; row <= UPPER_LIMIT; row++) {
            for (int col = LOWER_LIMIT; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void printSandGlass() {
        System.out.println("--------------------------------------------");
        System.out.println("Example-3");

        for (int row = LOWER_LIMIT; row <= UPPER_LIMIT; row++){
            for (int col = LOWER_LIMIT; col < row; col++){
                System.out.print(" ");
            }
            for (int col = row; col <= UPPER_LIMIT; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
        for (int row = LOWER_LIMIT; row <= UPPER_LIMIT - 1; row++) {
            for (int col = UPPER_LIMIT - 2; col >= row; col--) {
                System.out.print(" ");
            }
            for (int col = UPPER_LIMIT - row; col <= UPPER_LIMIT; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void printBinaryTriangle() {
        System.out.println("--------------------------------------------");
        System.out.println("Example-4");

        for (int row = LOWER_LIMIT; row <= UPPER_LIMIT; row++){
            for (int col = LOWER_LIMIT; col <= row; col++){
                if (col % 2 == 0){
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }

    public static void printNumberSquare() {
        System.out.println("--------------------------------------------");
        System.out.println("Example-5");

        for (int row = LOWER_LIMIT; row <= UPPER_LIMIT; row++){
            for (int col = LOWER_LIMIT; col <= UPPER_LIMIT; col++){
                int n;
                if (row < 8 - col){
                    n =LOWER_LIMIT;
                }else{
                    n=row;
                }
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }

    public static void printNumberTriangle() {
        System.out.println("--------------------------------------------");
        System.out.println("Example-6");

        for(int row = LOWER_LIMIT; row <= UPPER_LIMIT - 2; row++){
            int a = 0, increaseValue=4;
            for (int col = LOWER_LIMIT; col <= row; col++){
                int s = row + a;
                System.out.print(s + " ");
                a = a + increaseValue;
                increaseValue--;
            }
            System.out.println();
        }
    }
}

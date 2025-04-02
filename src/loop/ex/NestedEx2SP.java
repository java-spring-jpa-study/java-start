package loop.ex;

public class NestedEx2SP {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            for (int m = 1; m <= rows - i; m++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int m = 1; m <= rows - i; m++) {
                System.out.print(" ");
            }

            System.out.println();
        }

    }
}

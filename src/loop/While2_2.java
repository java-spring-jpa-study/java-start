package loop;

public class While2_1 {
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;
        while (count <= 3) {
            sum = sum + count;
            count = count + 1;
        }
        System.out.println(sum);
    }
}

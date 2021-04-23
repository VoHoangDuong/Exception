import java.util.Scanner;

public class IllegalTriangleException {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập vào độ dài 3 cạnh tam giác");
            System.out.println("Cạnh thứ nhất:");
            int a = scanner.nextInt();

            System.out.println("Cạnh thứ 2:");
            int b = scanner.nextInt();

            System.out.println("Cạnh thứ 3:");
            int c = scanner.nextInt();

            if (a == 0 || b == 0 || c == 0) {
                throw new Main(a + ", " + b + ", " + c + " không phải là 3 cạnh tam giác");
            }
            if (a >= b + c || b >= a + c || c >= a + b) {
                throw new Main(a + ", " + b + ", " + c + " không phải là 3 cạnh tam giác");
            }
            System.out.println(a + ", " + b + ", " + c + " là 3 cạnh tam giác");
        } catch (Main e) {
            e.printStackTrace();
        }
    }
}

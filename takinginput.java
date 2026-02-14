import java.util.Scanner;

public class takinginput {
    public static void main(String[] args) {
        System.out.println("it works!");
        System.out.println("taking inputs from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum=" + sum);
        // boolean b1=sc.hasNextInt();
        // System.out.println(b1);
        String str=sc.nextLine();
        System.out.println(str);

        // System.out.println(sum);

    }

}

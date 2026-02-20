import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        System.out.println("Enter the name of that student:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println("Enter the student marks:");
        System.out.print("sub1=");
        int sub1 = sc.nextInt();
        System.out.println("sub1=" + sub1);
        int sub2 = sc.nextInt();
        System.out.println("sub2=" + sub2);
        int sub3 = sc.nextInt();
        System.out.println("sub3=" + sub3);
        int sub4 = sc.nextInt();
        System.out.println("sub4=" + sub4);
        int sub5 = sc.nextInt();
        System.out.println("sub5=" + sub5);
        int sum = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println(sum);
        double per = (sum / 500.0) * 100.0;

        System.out.println(per+ "%");

    }

}

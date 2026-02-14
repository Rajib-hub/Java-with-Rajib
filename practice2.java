import java.util.Scanner;
public class practice2 {
    public static void main(String[] args) {
        //question 1
        float a=7/4.0f*9/2.0f;
        System.out.println(a);
        //QUESTION 2
        char grade='B';
        //grade by adding 8
        grade=(char)(grade+8);
        System.out.println(grade);
        //Decrypt -8
        grade=(char)(grade-8);
        System.out.println(grade);
        //Question 3
        Scanner sc=new Scanner (System.in);
        int m=sc.nextInt();
        System.out.println(m>8);
        

    }
    
}

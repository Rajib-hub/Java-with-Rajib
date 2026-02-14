import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        System.out.println("Enter the number from 0 to 10:");
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
         for(int i=0;i<=10;i++){
            if(a%2!=0){
                System.out.println("print all odd numbers:"+i);
            }
        }
        // for(int i=1;i>=0;i++)
        // {
        //     System.out.println("enter");
        // }
        //quick quiz
        System.out.println("Enter the how many natural number print:");
        int natural=sc.nextInt();
        for(int i=natural;i>=1;i--){
            System.out.println(" "+i);
        }
        //break statement
        for(int i=1;i<=5;i++){
            System.out.println("lets print"+i);
            if(i==2){
                System.out.println("print 2");
                break;
            }
        }
        System.out.println("hii");
        //continue statement
        for(int i=1;i<=5;i++){
            System.out.println("lets print"+i);
            if (i==2){
                System.out.println("print2");
                continue;
            }
            System.out.println(i);
        }
        System.out.println("rajib");
        
    }
    
}

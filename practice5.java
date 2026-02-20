import java.util.Scanner;
public class practice5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of equal rows and column:");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
                
        }
        System.out.print("\n");
        }
        //question 2
        System.out.println("enter the number:");
        int a=sc.nextInt();
        int sum=0;
        int k=1;
        while(k<=a){
            if(k%2==0){
                sum=sum+k;
            }
            k++;
         }
            System.out.println("sum=");
                System.out.println(sum);
                //question3
                System.out.println("Enter number:");
            int b=sc.nextInt();
            int mul=1;
            for(int i=1;i<=10;i++)
            {
                mul=b*i;
                System.out.println(b+"*"+i+"="+mul);
            }
            //question 4
            System.out.println("enter the number:");
            int f=sc.nextInt();
            int mul1=1;
            for(int i=10;i>=1;i--){
                mul1=f*i;
                System.out.println(f+"*"+i+"="+mul1);

            }
            //question 5
            System.out.println("Enter the number :");
            int g=sc.nextInt();
            int fact=1;
            // while(g!=0){
            for(int i=g;i>=1;i--){
                fact=fact*i;
            }
            // }
            System.out.println("factorial="+fact);
            //question 6
            System.out.println("find out the sum of multiplication of 8=====");
            int o=8;
            int mul2=1;
            int sum1=0;
            for(int i=1;i<=10;i++){
                mul2=o*i;

                sum1+=o*i;
                System.out.println(o+"*"+i+"="+mul2);

            }
            System.out.println("sum="+sum1);

    }

    
}

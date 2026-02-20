import java.util.Scanner;
public class practice4 {
    public static void main(String[] args) {
        //QUESTION 1
        int a =10;
        if(a==11){
            System.out.println("i am 11");
        }
        else{
            System.out.println("i am not 11");
        }
        //QUESTION 2
        // find out a student is pass or fail.
        Scanner sc=new Scanner (System.in);
        // String name=sc.next();
        // System.out.println("name:"+name);
        // System.out.println("Enter the subject and marks:");
        // System.out.println("Enter chemistry marks:");
        // int m1=sc.nextInt();
        // System.out.println("enter physics marks:");
        // int m2=sc.nextInt();
        // System.out.println("Enter computer science marks:");
        // int m3=sc.nextInt();
        // float avg=(m1+m2+m3)/3.0f;
        // if (avg>=40 && m1>=33 &&m2>=33 &&m3>=33)
        // {
        //     System.out.println("pass");
        // }
        // else{
        //     System.out.println("fail");
        // }
        //QUESTION 3
        // question 4
        System.out.println("enter the day number:");
        int day=sc.nextInt();
        switch(day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednessday");
                break;
            case 4:
                System.out.println("thurseday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("not  a week");
        }
        //question 5
        System.out.println("Enter the year:");
        int year=sc.nextInt();
        if((year%4==0)&&(year%100!=0)||(year%400==0)){
            System.out.println(year +"is a leap year");
        }
        else {
            System.out.println("not a leap year");
        }
        //question 6
        System.out.println("Enter the website type:");
        String websitetype=sc.next();
        if (websitetype.endsWith(".com")){
            System.out.println("comercial website");
        }
        else if(websitetype.endsWith(".org")){
            System.out.println("orginizational website");
        }
        else if(websitetype.endsWith(".in")){
            System.out.println("indian website");

        }
        else{
            System.out.println("other website");
        }
        


        
        
    }
    
}

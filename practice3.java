import java.util.Scanner;
public class practice3 {
    public static void main(String[] args) {
        //QUESTION 1
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(str.toLowerCase());
        //QUESTION 2
        System.out.println(str.replace(" ","_"));
        //QUESTION 3
        String letter="Dear <|name|>, thanks a lot";
        System.out.println(letter.replace("<|name|>","Rajib"));
        //QUESTION 4
        String mystring="this string contains   double space and triple space ";
        System.out.println(mystring.indexOf("   "));
        System.out.println(mystring.indexOf("  "));
        //question 5
        String myletter="Dear rajib,\n\t this java course is nice .";
        System.out.println(myletter);


    }
    
}

import java.util.Scanner;
import java.util.Random;
public class rockpaper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        String[] choices={"rock","paper","scissors"};
        System.out.println("Enter the rock paper scissor:");
        System.out.println("enter your choice:");
        String userchoice=sc.next();
        int computerindex=rand.nextInt(3);
        String computerchoice=choices[computerindex];
        System.out.println("computerchoose: "+computerchoice);
        if(userchoice.equalsIgnoreCase(computerchoice)){
            System.out.println("match is draw");
        }
        else if(userchoice.equalsIgnoreCase("rock")&&computerchoice.equalsIgnoreCase("scissors")||userchoice.equalsIgnoreCase("scissors")&&computerchoice.equalsIgnoreCase("paper")||userchoice.equalsIgnoreCase("paper")&&computerchoice.equalsIgnoreCase("rock")){
            System.out.println("user win");
        }
        else {
            System.out.println("computer win!");
        }



    }
    
}

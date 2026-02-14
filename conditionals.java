import java.util.Scanner;
public class conditionals {
    public static void main(String[] args) {
        int age=17;
        if(age>18)
        {
            System.out.println("can drive.");
        }
        else{
            System.out.println("can not drive");
        }
            boolean a=true;
            boolean b=false;
            System.out.println(!a);
            //switch case
            Scanner sc =new Scanner(System.in);
            int age1=sc.nextInt();
            switch(age1){
            case 18:
                System.out.println("you are going to become an adult ");
                break;
            case 23:
                System.out.println("you are going to join a job!");
                break;
                case 60:
                    System.out.println("you are going to get retired");
                    break;
                    default:
                        System.out.println("enjoy your life !");
            }

        }
    }
    


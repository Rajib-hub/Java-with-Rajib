import java.util.Scanner;
class cellphone{
    public void ringing(){
        System.out.println("Ringing ...");
    }
    public void vibrating(){
        System.out.println("Vibrating ...");
    }
}
class rectangle{
    public void repeat(int q){
        if(q==0){
            return;
        }
                else{
                    System.out.println("4");
                    repeat(q-1);
                }
        }
    }

class square{
    public int area(int a){
        int area=a*a;
        return area;
    }
    public int perimeter(int a){
        int perimeter=4*a;
        return perimeter;
    }
}
public class practice81{
    public static void main(String[] args) {
        System.out.println("enter the choice in your phone: ");
        Scanner sc=new Scanner(System.in);
        int press=sc.nextInt();
        cellphone cp=new cellphone();
        if( press==1){
        cp.ringing();
        }
        else{
        cp.vibrating();
        }
        System.out.println("enter the side of square: ");
        int x=sc.nextInt();
        square sq=new square();
        int area1=sq.area(x);
        System.out.println( "Area="+area1);
        int perimeter=sq.perimeter(x);
        System.out.println("perimeter="+perimeter);
        System.out.println("print how many times repeat :");
        int w=sc.nextInt();
        rectangle rect=new rectangle();
        rect.repeat(w);
        sc.close();

    }
    
}

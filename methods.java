import java.util.Scanner;
public class methods {
    static void foo(){
        System.out.println("good morning bro!");
    }
    static void foo(int f){
        System.out.println("good morning "+f+"bro!");
    }
    static void change(int r){
        r=98;

    }
    static void change2(int [] p){
        p[0]=98;
    }
    static int logic(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y) *5;
        }
        return z;

    }
    public static void main(String[] args) {
System.out.println("enter the value1: ");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.println("enter the value2:");
int b=sc.nextInt();
int c;
c=logic(a,b);
System.out.println("answer :"+c);
int t=5;
change(t);
System.out.println("the value of t is:"+t);
int [] arr={97,67,34,23,10};
change2(arr);
System.out.println("the value of index 0 of arr:"+arr[0]);
foo();
foo(30);
    }
    
}

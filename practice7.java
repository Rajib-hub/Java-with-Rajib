import java.util.Scanner;
public class practice7 {

public static void  multable(int n){
    for(int i=1;i<=10;i++){
        System.out.println(n+"*"+i+"="+n*i);
    }
    System.out.println();
}
public static void design1(){
    for(int i=0;i<4;i++){
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
public static int  sumnatural(int o){
    if(o==1){
        return 1;
    }
    else{
        return o+sumnatural(o-1);
    }
}
public static void design2(){
    for(int i=4;i>0;i--){
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
public static int fibonacci(int y){
    if (y==0){
        return 0;
    }
    else if(y==1){
        return 1;
    }
    else{
        return fibonacci(y-1)*fibonacci(y-2);
    }
}
public static int foo(int ... arr){
    int avg=0;
    int sum=0;
    int count =0;
    for(int f:arr){
        sum+=f;
        count++;
    }
    avg=sum/count;
    return avg;

    }
    public static void repeat(int n){
        if(n==0){
            return;

        }
        else{
            System.out.println("4");
             repeat(n-1);
        }
    }
    public static int far(int cel){
        int far1;
        far1=(cel*(9/5))+32;
        return far1;
    }
    public static void repeat1(int v){
        for(int i=v;i>0;i--){
            System.out.println("3");
        }
    }
    


    public static void main(String[] args) {
        System.out.println("it works!");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        multable(a);
        design1();
        int p=6;
        System.out.println(sumnatural(p));
        design2();
        int y=sc.nextInt();
        int result= fibonacci(y);
        System.out.println(result);
        System.out.println("average="+foo(2,3,4,5,6,7));
        // int ele=sc.nextInt();
        // int [] arr=new int[ele];
        // for(int i=0;i<ele;i++){
        //     arr[i]=sc.nextInt();
        // }
        // int average =foo(arr[]);
        // System.out.println(average);
        int v=sc.nextInt();
        repeat(v);
        int celcious=sc.nextInt();
       System.out.println( far(celcious)+"f");
       repeat1(v);


    
    }
}

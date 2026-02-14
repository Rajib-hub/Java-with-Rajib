import java.util.Scanner;
public class practice7 {

 static void multable(int n){
    for(int i=1;i<=10;i++){
System.out.println(n+"*"+i+"="+n*i);
    }
}
static void design(int q){
    for(int i=0;i<q;i++){
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
static int recursion(int p){
    if(p==0){
        return 0;
    }
    else if(p==1){
        return 1;
    }
    else{
        return p+recursion(p-1);
    }
}
static void design2(int x){
    for(int i=x;i>0;i--){
        for(int j=i;j>0;j--){
            System.out.print("*");
        }
        System.out.println();
    }
}
static int fibonancci(int o){
    if(o==1 || o==2){
        return o-1;
    }
    else {
        return fibonancci(o-1)+fibonancci(o-2);
    }
}
static int foo(int ...arr){
    int sum=0;
    int avg=0;
    int count=arr.length;
    for(int element:arr){
        sum+=element;


    }
    avg=sum/count;
    return avg;
}
static void repeat(int count){
    if(count==0){
        return ;
    }
    else{
        System.out.println("4");
        repeat (count-1);
    }
}

public static float conversion(float z){
    float f=((9*z)/5)+32;
    return f;

}
static int iterrative



    public static void main(String[] args) {
        System.out.println("it works!");
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            multable(a);
            int b=sc.nextInt();
            design(b);
            int c=sc.nextInt();
            int sum=recursion(c);
            System.out.println(" natural number sum="+sum);
            int k=sc.nextInt();
            design2(k);
            int v=sc.nextInt();
            int num=fibonancci(v);
            System.out.println("nth number of fibonancci:"+num);
            //int h=sc.nextInt();
            int avg1=foo(1,2,3,4);
            System.out.println("average="+avg1);
            repeat(10);
            float cel=sc.nextFloat();
            float far=conversion(cel);
            System.out.println("farhennite="+far);


        
    }
}

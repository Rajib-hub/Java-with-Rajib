import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int []marks=new int[5];
        marks[0]=100;
        marks[1]=90;
        marks[3]=80;
        marks[4]=70;
        System.out.println(marks[2]);
        //character array
        char [] name=new char[2];
        name[0]='r';
        System.out.println(name[1]);
        int [] marks1={98,67,87,80,87};
        System.out.println(marks1[1]);
        float [] marks2={98,67,87,80,87};
        System.out.println(marks2[2]);
        System.out.println(marks.length);
        for(int i=0;i<marks2.length;i++)
        {
            System.out.println(marks2[i]);
        }
        for(int element:marks1){
            System.out.println(element);
        }
        for(int i=marks1.length - 1;i>=0;i--){
            System.out.println(marks1[i]);
        }
        //two dimentional array
        int [][] flats;
        flats=new int [2][3];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=104;
        flats[1][1]=105;
        flats[1][2]=106;
        for(int i=0;i<=1;i++){
            for(int j=0;j<=2;j++){
        
        System.out.print(flats[i][j] ); 
        System.out.print("\t");

}
System.out.println(" ");
// System.out.println(flats[i].length);
        }
        
int [][] flats1;
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();
flats1=new int [m][n];
for(int i=0;i<flats1.length;i++){
    for(int j=0;j<flats1[0].length;j++){
        System.out.print(flats1[i][j]);
        System.out.print("\t");
    }
    System.out.println(" ");
}

        



    }
    
}

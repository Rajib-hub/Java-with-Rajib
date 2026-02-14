import java.util.Scanner;
public class practice6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        float sum=0;
        float [] marks=new float[i];
        for(int j=0;j<i;j++)
        {
            System.out.println("enter" +j+ "marks:");
             marks[j]=sc.nextFloat();
            sum+=marks[j];
        }
        System.out.println("sum="+sum);

        //question 2
        float num=45.5f;
        boolean isInArray=false;
        for(float element:marks){
            if (num==element){
                isInArray = true;
                break;
            }
        }
      if (isInArray){
        System.out.println("preasent");
      }
      else{
        System.out.println("not present");
      }
      //question 3
      System.out.println("Enter how many students:");
      int students=sc.nextInt();
      float avg=1;
      float sum1=0;
      float [] marks1=new float[students];
      for(int j=0;j<students;j++){
        marks1[j]=sc.nextFloat();
        sum1+=marks1[j];
    }
    avg=sum1/students;
      System.out.println("average="+avg);
    //question 5
    System.out.println("enter the array number of row :");
    int row=sc.nextInt();
    // System.out.println("column:");
    // int column=sc.nextInt();
    int [] array=new int [row];
    int m;
    for( m=0;m<row;m++){
      System.out.println("enter the values of the array:");
      array[m]=sc.nextInt();
      System.out.println(array[m]);

    }
     System.out.println(array[m]);
    
    }
    
}

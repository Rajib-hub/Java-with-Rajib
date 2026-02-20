
import java.util.Scanner; 
class Employee{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public void setsalary(int x){
        salary=x;
    }
    public void setname(String c){
         name=c;
    }
    public String getname(){
        return name;
    }
}
public class practice8 {
    public static void main(String[] args) {
        System.out.println(
            "custom class!"
        );
         Employee emp[]=new Employee[2];
        for(int i=0;i<2;i++){
             emp[i]=new Employee();
        
        Scanner sc=new Scanner(System.in);
       
        //Employee emp1=new Employee();
        int a=sc.nextInt();
        emp[i].setsalary(a);
        //emp1.setsalary(a);

        String name1=sc.next();
        emp[i].setname(name1);
        //emp1.setname(name1);
        System.out.println("name:"+emp[i].getname());
        System.out.println("salary:"+emp[i].getsalary());



    }
    
}
}
 
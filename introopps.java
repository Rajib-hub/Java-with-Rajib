class employee {
    int id;
    String name;
    int salary;

    public int getsalary() {
        // System.out.println(" salary");
        return salary;
    }

    public void printdetails() {
        System.out.println("my id is " + id);
        System.out.println("my name is " + name);
    }
}

public class introopps {
    public static void main(String[] args) {
        System.out.println("it works!");
        employee emp = new employee();
        emp.id = 01;
        emp.name = "rajib";
        emp.salary = 34000;
        employee emp1=new employee();
        emp1.id=02;
        emp1.name="bibek";
        emp1.salary=33000;
        // System.out.println(emp.id);
        emp.printdetails();
          int salary=emp.getsalary();
        System.out.println(salary);
        emp1.printdetails();
      
        System.out.println(emp1.getsalary());

    }

}

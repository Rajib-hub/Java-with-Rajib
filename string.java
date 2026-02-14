import java.util.Scanner;
public class string {
public static void main(String[] args) {
    String name=new String("RAJIB");
    System.out.println(name);
    // String methods
    int len=name.length();
    System.out.println(len);
    String a=name.toLowerCase();
    System.out.println(a);
    String ustring=name.toUpperCase();
    System.out.println(ustring);
    String nontrimmedstring="     rajib    ";
    System.out.println(nontrimmedstring);
    String trimmedstring = nontrimmedstring.trim();
    System.out.println(trimmedstring);
    System.out.println(name.substring(2));
    System.out.println(name.substring(1,5));
    String newstring =name.replace('R','B');
    System.out.println(newstring);
    System.out.println(name.replace("JIB","QWE"));
    System.out.println(name.startsWith("RAJ"));
    System.out.println(name.endsWith("JIR"));
    System.out.println(name.charAt(3));
    System.out.println(name.indexOf("I"));
    System.out.println(name.indexOf("RAJ",0));
    System.out.println(name.lastIndexOf("J"));
    System.out.println(name.lastIndexOf("JI",1));
    System.out.println(name.equals("RAJIB"));
    System.out.println(name.equalsIgnoreCase("Rajib"));
    Scanner sc=new Scanner(System.in);
    String modifiedstring=sc.nextLine();
    System.out.println(modifiedstring);
    System.out.println(modifiedstring.lastIndexOf("rry",4));
    System.out.println("i am rajib kumar bisoi \\ lala");
    



}    
}

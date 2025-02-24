public class Method{
public static void main(int args){
System.out.println("main()overloading");}
public static void main(char args){System.out.println("main()overloaded" +"method2 Executing");}
public static void main(Double[]args){System.out.println("main() overloading"+ "method3 Executing");}
public static void main(String[]args){
System.out.println("Original main()" + "Executing");
Method.main(23);}
}

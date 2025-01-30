import java.util.Scanner;
public class video13 {
    public static void main(String[]args){
        // String name = new String("Harsh");
        // String nameString = "Harsh";
        // System.out.print("The name is: ");
        // System.out.print(name);

        int a = 6;
        float b = 5.6467f;
       // System.out.printf("The value of a is %d and value of b is %9.2f", a, b);
        System.out.format("The value of a is %d and value of b is %f", a,b);
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String st1 = sc.nextLine();
        System.out.println(st);
    }
    
}

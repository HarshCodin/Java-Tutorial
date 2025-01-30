import java.util.Scanner;
public class video11 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Physics marks : ");
        int physics = sc.nextInt();
        System.out.println("Enter your English marks : ");
        int English = sc.nextInt();
        System.out.println("Enter your Chemistry marks : ");
        int Chemistry = sc.nextInt();
        System.out.println("Enter your Biology marks : ");
        int Biology = sc.nextInt();
        System.out.println("Enter your Computer Science marks : ");
        int Computer = sc.nextInt();

        float percentage = ((physics + English + Chemistry + Biology + Computer)/500.0f)*100;
        System.out.println("percentage : ");
        System.out.println(percentage);
    }
    
}

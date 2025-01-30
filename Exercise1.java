import java.util.Scanner;
public class Exercise1{   
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enetr your Web Design marks : ");   
     int Web = sc.nextInt();
     System.out.println("Enter your Data Mining marks : ");
     int Data = sc.nextInt();
     System.out.println("Enter your Net Framework marks : ");
     int Net = sc.nextInt();
     System.out.println("Enter your Bca Project marks : ");
     int Bca = sc.nextInt();
     System.out.println("Enter your Web Lab marks : ");
     int Web2 = sc.nextInt();

     float percentage = ((Web + Data + Net + Bca + Web2)/500.0f)*100;
     System.out.println("percentage : ");
     System.out.println(percentage);
    } 
}

import java.util.Scanner;
public class video18 {
    public static void main(String[]args){
        // String var = "Shivam";

        // switch (var) {
        //     case "Shivam" -> {
        //         System.out.println("You are going to become an Adult!");
        //         System.out.println("You are going to become an Adult!");
        //         System.out.println("You are going to become an Adult!");
        //     }
        //     case "Shubham" -> System.out.println("You are going to join a job!");
        //     case "Saurabh" -> System.out.println("You are going to get retired");
        //     default -> System.out.println("Enjoy your life");
        // } 
        // System.out.println("Thanks for using my java code");

        int age;
        System.out.println("Enter your age!");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age>56){
            System.out.println("You are experienced!");
        }
        else if(age>46){
            System.out.println("You are semi experienced!");
        }
        else if(age>36){
            System.out.println("You are semi-semi experienced!");
        }
        else{
            System.out.println("You are not experienced!");
        }
        if(age>2){
            System.out.println("You are not baby!");
        }
        
    }
    
}

class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on phone...");
    }
}

class SmartPhone extends Phone {
    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}

public class video49 {
    public static void main(String[]args){
        Phone obj = new SmartPhone(); // Yes it is allowed
       // SmartPhone obj = new Phone(); Not Allowed

       // obj.showTime();
        obj.on();
        // obj.music(); Not Allowed
    }
}

class Employee1 {
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String geName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

}

class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }

    public void vibrate(){
        System.out.println("Vibrating...");
    }

    public void callfriend(){
        System.out.println("Calling Mukul...");
    }
}

class Square{
    int side;
    public int area(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }

    public void run(){
        System.out.println("Running from the enemy");
    }

    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

public class Video39 {
    public static void main(String[]args){

        // Problem 1
        Employee1 harsh = new Employee1();
        harsh.setName("HarshSingh");
        harsh.salary = 233;
        System.out.println(harsh.getSalary());
        System.out.println(harsh.geName());

        /*
        // Problem 2
        CellPhone asus = new CellPhone();
        asus.callfriend();
        asus.ring();
        asus.vibrate();

        // Problem 3
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        // Problem 5
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();
       */
    }

}







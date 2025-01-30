abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}
class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello Sir");
    }
    @Override
    public void eat(){
        System.out.println("Eating");
    }
    @Override
    public void sleep(){
        System.out.println("Sleeping");
    }
}

public class video60 {
    public static void main(String[]args){
        // Q1 + Q2
        FountainPen pen = new FountainPen();
        pen.changeNib();

        // Q3
        Human harsh = new Human();
        harsh.sleep();

        // Q5
        Monkey m1 = new Human();
        m1.jump();
        m1.bite();

        BasicAnimal chunnu = new Human();
        chunnu.eat();
        chunnu.sleep();
    }
}

//abstract class Phone1 {
//    abstract void on();
//}
//class SmartPhone extends Phone1 {
//    void run() {
//        System.out.println("Turning on...");
//    }
//
//    @Override
//    void on() {
//
//    }
//}
//
//
//public class video53 {
//    public static void main(String[]args){
//        Phone1 obj = new SmartPhone1();
//            obj.on();
//
//            }
//        }

abstract class Parent2{
    public Parent2(){
        System.out.println("Mai base2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}

abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}

public class video53{
    public static void main(String[]args){
        //Parent2 p = new Parent2();
        Child2 c = new Child2();
        c.greet();
        c.greet2();
        //Child3 c3 = new Child3();
    }
}



interface Animal{
    default void say(){
        System.out.println("Hello, this is default method");
    }
    void bark();

}

public class video57 {
    //@Override
    public void bark(){
        System.out.println("Dog barks!");
    }
    public void say(){
        System.out.println("say");
    }
    public static void main(String[]args){
        video57 obj1 = new video57();
        obj1.bark();
        obj1.say();
    }
}

//class cwc{
//    int x;
//
//    // getter of x
//    public int getX(){
//        return  x;
//    }
//
//    cwc(int x){
//      this.x = x;
//    }
//}
//
//
//
//public class video47 {
//    public static void main (String[]args){
//        cwc obj = new cwc(65);
//        System.out.println(obj.getX());
//
//    }
//}

import javax.print.Doc;
class EkClass{
    int a;
    public int getA(){
        return a;
    }
    EkClass(int a){
        this.a=a;
    }
    public int returnone(){
        return 1;
    }
}

class DoClass extends EkClass{DoClass(int c){super(c);
    System.out.println("I am a constructor");}
}

public class video47 {
    public static void main(String[]args){
        EkClass e = new EkClass(65);
        DoClass d = new DoClass(5);
        System.out.println(e.getA());
    }
}
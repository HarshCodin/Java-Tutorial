interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("Harsh Singh");
    }
    public void meth2(){
        System.out.println("Harshit beta");
    }
    public void meth3(){
        System.out.println("Aabid beti");
    }
    public void meth4(){
        System.out.println("In dono ka papa Harsh Singh");
    }
}

public class video58 {
    public static void main(String[]args){
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}

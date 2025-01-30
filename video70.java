class MyThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<40000){
            System.out.println("Harsh Singh");
            System.out.println("Lucky Singh");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<40000){
            System.out.println("Harsh Pratap Singh");
            System.out.println("Harsh Singh");
            i++;
        }
    }
}

public class video70 {
    public static void main(String[]args){
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}


public class video32 {
    static void foo(){
        System.out.println("Good Morning bro!");
    }

    static void foo(int a){
        System.out.println("Good Morning" + a + "bro!");
    }

    static void foo(int a, int b){
        System.out.println("Good Morning" + a + "bro!");
        System.out.println("Good Morning" + b + "bro!");
    }

    static void foo(int a, int b, int c){
        System.out.println("Good Morning" + a + "bro!");
        System.out.println("Good Morning" + b + "bro!");
    }

    static void change(int a){
        a = 98;
    }

    static void change1(int [] arr){
        arr[0] = 98;
    }

    static void telljoke(){
        System.out.println("I invented a new word\n" + "Plagiarism!");
    }

    public static void main(String[]args){
        telljoke();

        // Case 1 Changing the Integer
        int x = 45;
        change(x);
        System.out.println("The value of x after running change is " + x);

        // Case 2 Changing the Array
        int [] marks = {45, 67, 89, 98, 99};
        change1(marks);
        System.out.println("The value of x after running change is " + marks[0]);

        // Method Overloading
        foo();
        foo(3000);
        foo(3000, 4000);
        // Arguments are actual
    }
}

public class video33 {
    static class calculate{
        static int add(int ...arr){
            int result = 0;
            for(int a : arr){
                result += a;
            }
            return result;
        }

       // static int add(int a, int b){
       //     return a+b;
       // }
    }

    public static void main(String[] args) {
    
        System.out.println(calculate.add(1, 2));
        System.out.println(calculate.add(2, 3, 4));
        System.out.println(calculate.add(4, 5, 6));
    }
     
}

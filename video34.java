public class video34 {
        // static class recursion{
        // static void fun2(int n){
        //     if(n>0){
        //         fun2(n-1);
        //         System.out.println(n);
        //     }
        // }

        // static void fun1(int n){
        //     if(n>0){
        //         System.out.println(n);
        //         fun1(n-1);
        //     }
        // }

        static int factorial(int n){
            if(n==0 || n==1){
                return 1;
            }
            else{
                return n * factorial(n-1);
            }
        }

        static int factorial_iterative(int n){
            if(n==0 || n==1){
                return 1;
            }
            else{
                int product = 1;
                for(int i=1; i<=n; i++){
                    product *= i;
                }
                return product;
            }
        }
    }

    public static void main(String [] args){
        // int n = 3;
        // recursion.fun2(n);

        // int n = 3;
        // recursion.fun1(n);

        int x = 5;
        System.out.println("The value of factorial x is: " + video34.factorial(x));
        System.out.println("The value of factorial x is: " + video34.factorial_iterative(x));
    }
//  }    


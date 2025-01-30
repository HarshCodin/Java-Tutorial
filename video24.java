public class video24 {
    public static void main(String[]args){
        // for(int i=10; i>0; i--){
        //     if(i==7){
        //         break;
        //     }
        //     System.out.println(i);
        // }

        // for(int i=7; i>0; i--){
        //     if(i==3){
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        // Break and continue using loop
        for(int i=0; i<50; i++){
           System.out.println(i);
           System.out.println("Harsh is great");
           if(i==2){
            System.out.println("Ending the loop");
            break;
           }
        }
        int i=0;
        do{
            System.out.println(i);
            System.out.println("Harsh is great");
            if(i==2){
                System.out.println("Ending the loop");
                break;
            }
            i++;
        }while(i<5);
        System.out.println("Loop ends here ");
    }
    
}

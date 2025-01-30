public class video27 {
    public static void main(String[]args){
        // declaring an array
    //     int arr [] = {1,2,3,3,4,5};
    //  // traversing the array with for each loop
    //     for(int i:arr){
    //         System.out.println(i);
    //     }
    /* 
    float marks[] = {46.0f, 67.0f, 87.8f, 76.9f, 89.4f};
    String [] students = {"Harsh", "Shubham", "Vishal", "Rohan", "Shyam"};
    System.out.println(students.length);
    System.out.println(students[2]);
    */

    int marks [] = {98, 78, 99, 95, 87};

    // Displaying the array (Naive way)
    System.out.println("Printing using naive way");
    System.out.println(marks[0]);
    System.out.println(marks[1]);
    System.out.println(marks[2]);
    System.out.println(marks[3]);
    System.out.println(marks[4]);

    // Displaying the array (for loop)
    System.out.println("Printing using for loop");
    for(int i=0; i<marks.length; i++){
        System.out.println(marks[i]);
    }

    // Quick Quiz: Displaying the array in reverse order (for loop)
    System.out.println("Printing using the loop in reverse order");
    for(int i=marks.length-1; i>=1; i--){
        System.out.println(marks[i]);
    }

    // Quick Quiz: Displaying the array (for each array)
    System.out.println("Printing using the for-each loop");
    for(int element: marks){
        System.out.println(element);
    }
    }
    
}

public class video29 {
    public static void main(String[]args){

        // Question 1
        // float [] marks = {89.9f, 78.7f, 87.6f, 88.5f, 76.0f};
        // float sum = 0;
        // for(float element: marks){
        //     sum = sum + element;
        // }
        // System.out.println("The value of sum is " + sum);

        // Question 2
        // float [] marks = {100.0f, 99.9f, 88.8f, 77.7f, 66.6f};
        // float num = 99.9f;
        // boolean isInArray = false;
        // for(float element: marks){
        //     if(num==element){
        //         isInArray = true;
        //         break;
        //     }
        // }
        // if(isInArray){
        //     System.out.println("The value is present in the array");
        // }
        // else{
        //     System.out.println("The value is not present in the array");
        // }

        // Question 3
        // float [] marks = {100.0f, 99.9f, 88.8f, 77.7f, 66.6f};
        // float sum = 0;
        // for(float element:marks){
        //     sum = sum + element;
        // }
        // System.out.println("The value of average marks is " + sum/marks.length);

        // Question 4
        // int [][] mat1 = {{1, 2, 3},
        //                  {4, 5, 6}};
        // int [][] mat2 = {{2, 6, 13},
        //                  {3, 7, 11}};
        // int [][] result = {{0, 0, 0},
        //                    {0, 0, 0}};
                           
        // for(int i=0; i<mat1.length; i++){ // row number of times
        //     for(int j=0; j<mat1[i].length; j++){ // column number of time
        //         System.out.format("Setting value for i=%d and j=%d\n", i,j);
        //         result[i][j] = mat1[i][j] + mat2[i][j];
        //     }
        // }
        // // Printing the elements of a 2-D array
        // for(int i=0; i<mat1.length; i++){ // row number of times
        //     for(int j=0; j<mat1[i].length; j++){  // column number of time
        //         System.out.println(result[i][j] + " ");
        //         result[i][j] = mat1[i][j] + mat2[i][j];
        //     }
        // }
        // System.out.println(""); // Print the new line

        // Question 5
        // int [] arr = {100, 99, 88, 77, 66};
        // int l = arr.length;
        // int n = Math.floorDiv(l, 2);
        // int temp;

        // for(int i=0; i<n; i++){
        //     temp = arr[i];
        //     arr[i] = arr[l-i-1];
        //     arr[l-i-1] = temp;
        // }

        // for(int element:arr){
        //     System.out.println(element +" ");
        // }

        // Question 6
        // int [] arr = {22, 33, 44, 55};
        // int max = Integer.MIN_VALUE;
        // for(int e:arr){
        //     if(e>max){
        //         max = e;
        //     }
        // }
        // System.out.println("The value of the maximum element in this array is: " +max);
        // System.out.println(Integer.MIN_VALUE);
        // System.out.println(Integer.MAX_VALUE);

        // Question 7
        boolean isSorted = true;
        int [] arr = {45, 56, 77, 68, 89};
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }

        if(isSorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }
    }
    
}

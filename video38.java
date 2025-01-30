
    class Employee{
        int id;
        int salary;
        String name;
        public void printDetails(){
            System.out.println("My id is " + id);
            System.out.println("and my name is " + name);
        }
        public int getSalary(){
            return salary;
        }
    }

    public class video38 {
    public void main(String[]args){
        System.out.println("This is our custom class");
        Employee harsh = new Employee(); // Instantiating a new Employee Object
        Employee shivam = new Employee(); // Instantiating a new Employee Object
        
        // Setting Attributes for Harsh
        harsh.id = 12;
        harsh.salary = 34;
        harsh.name = "codewithharsh";
        
        // Setting Attributes for Shivam
        shivam.id = 14;
        shivam.salary = 36;
        shivam.name = "Shivam Singh";
        
        // Printing the Attributes
        harsh.printDetails();
        shivam.printDetails();
        int salary = shivam.getSalary();
        System.out.println(salary);
        // System.out.println(harsh.id);
        // System.out.println(harsh.name);

    }
    
}

//class Employee2{
//    Employee2(String s, int i){
//        System.out.println("The name of the first employee is : " + s);
//        System.out.println("The name of the first employee is : " + i);
//    }
//
//    // Constructor Overloaded
//    Employee2(String s, int i, int salary){
//        System.out.println("The name of the second employee is : " + s);
//        System.out.println("The name of the second employee is : " + i);
//        System.out.println("The name of the second employee is : " + salary);
//    }
//}
//
//
//public class video42 {
//    public static void main(String [] args){
//        Employee2 ram = new Employee2("Ram", 1);
//        Employee2 shyam = new Employee2("Shyam", 2, 2000);
//
//    }
//}

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 0;
        name = "Your-Name-Here";
    }

    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }

    public MyMainEmployee(String myName){
        id = 1;
        name = myName;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name = n;
    }

    public void setId(int i){
        this.id = i;
    }

    public int getId(){
        return id;
    }
}

public class video42 {
    public static void main(String[]args){
        MyMainEmployee sohan = new MyMainEmployee();
//        sohan.setName("Sohan Khandelawal");
//        sohan.setId(345);
        System.out.println(sohan.getId());
        System.out.println(sohan.getName());
    }
}


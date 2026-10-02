package ac.rca.oop.encapsulation;

import ac.rca.oop.inheritance.*;


public class program {
    public static int value = 10;
    public int addition(int a , int b){
        return a+value;
    }
    public static int addition(int a , int b, int c){
        return a+b+c;
    }

    public static void  main(String[] args){
        program pr1 = new program();
        Laptop laptop1 = new Laptop();
        laptop1.setSerialNumber("32");
        laptop1.setManufacturer("lenovo");
        laptop1.setModel("thinkpad");
        laptop1.setManufacturedyear(2903);
        System.out.println(laptop1);

        student s1 = new student("RCA","l4","Angella","HIRWA",12);
        System.out.println(s1);
        Object s5 = new student();

    }




}

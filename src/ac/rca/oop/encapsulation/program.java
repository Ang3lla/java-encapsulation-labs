package ac.rca.oop.encapsulation;

import ac.rca.oop.inheritance.*;


public class program {
    public static void  main(String[] args){
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

package ac.rca.oop.encapsulation;


public class program2 {
    public static void main(String[] args){
        int myScore = 10;
        Integer mysCore = 20;
        double d2 = 25;
        Double d1 = 30.8;
        short a = 12;
        Short b = 24;
        char c= 200;
        char c1 = 89;
        int abc = c;
        int[] marks = {12,13,14,15,26,34};

        String name1 = new String("Mary");
        String name2 = new String("Mary");
        String s3 = new String("John");
        if(name1 == name2){
            System.out.println("they are equal");
        }else{
            System.out.println("they are no equal");
        }
        System.out.println(name1.equals(name2));




        System.out.println(mysCore.hashCode());
    }
}

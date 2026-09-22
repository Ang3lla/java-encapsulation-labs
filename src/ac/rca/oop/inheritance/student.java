package ac.rca.oop.inheritance;

import ac.rca.oop.encapsulation.person;

public class student extends person {
    private String school;
    private String level;
    public student(){}

    public student(String school, String level,String firstName, String lastName , int age) {
        super(firstName, lastName,age);
        this.school = school;
        this.level = level;
    }

    public String getSchool() {
        return school;
    }

    public String getLevel() {
        return level;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getEmail(){
        return "my email is";
    }

    @Override
    public String toString() {
        return "student{" +
                "school='" + school + '\'' +
                ", level='" + level + '\'' +
                ", email='"+this.getEmail()+ '\''+
                '}';
    }
}

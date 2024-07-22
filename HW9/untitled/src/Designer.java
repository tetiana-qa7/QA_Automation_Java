import java.util.ArrayList;

public class Designer extends Employee{


    Designer(String name, int age, double salary) {
        super(name, age, salary);
    }

    public void work(){
        System.out.println("I'm working as a DESIGNER. I have a lot of duties");
        System.out.println("My name is "+ getName());
        System.out.println("My salary is "+ getSalary());
    }

    public void takeBreak(){
        System.out.println("I am out, at lunch as a DESIGNER. I'm fed up with the amendments");
    }

    public void performJob(){
        System.out.println("I performing a job as a DESIGNER. I have to provide different options to choose from");
    }

    public void describeRole(){
        System.out.println("This is my role. I am a DESIGNER. It's my repsonsibility to make sure that we are on the same page with the stakeholders");
    }

    public void describeRole(String extraInfo){
       System.out.println("My role is DESIGNER. I have the following responsibilities:  " + extraInfo);
    }


}

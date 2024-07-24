public class Developer extends Employee {

    Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void work(){
        System.out.println("I'm working as a DEVELOPER. I have a lot of tasks in backlog");
        System.out.println("My name is "+ getName());
        System.out.println("My age is "+ getAge());
        System.out.println("My salary is "+ getSalary());
    }


    @Override
    public void takeBreak(){
        System.out.println("I am out, at lunch as a DEVELOPER");
    }

    @Override
    public void performJob(){
        System.out.println("I performing a job as a DEVELOPER. I have to implement a couple of features");
    }

    public void describeRole(){
        System.out.println("This is my role. I am a DEVELOPER. It's my repsonsibility to implement tasks and inform management about possible delays");
    }

    public void describeRole(String extraInfo){
        System.out.println("My role is Developer. I have the following responsibilities:  " + extraInfo);
    }
}

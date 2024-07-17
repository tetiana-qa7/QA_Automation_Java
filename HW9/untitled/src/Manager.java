public class Manager extends Employee {
    Manager(String name, int age, double salary) {
        super(name, age, salary);
    }

    public void work(){
        System.out.println("I'm working as a MANAGER. I have a lot of duties");
        System.out.println("My name is "+ getName());
        System.out.println("My salary is "+ getSalary());
    }

    public void takeBreak(){
        System.out.println("I am out, at lunch as a MANAGER");
    }

    public void performJob(){
        System.out.println("I performing a job as a MANAGER. I have to control everything");
    }


    public void describeRole(){
        System.out.println("My role is manager. It's my repsonsibility to make sure we/ll finish in time");

    }

    public void describeRole(String extraInfo, int subordinates){
        System.out.println("My role is manager. I have the following responsibilities:  " + extraInfo);
        System.out.println("I have  " + subordinates + " subordinates");

    }

    //априклад Manager зможе мати додаткові методи, які приймають об'єкт типу Employee на вхід і
            //"змушують" робити його якусь роботу, або методи, які дозволяють керувати офісом

    public void giveInstructions(Employee employee){
        System.out.println("I five instruction to " + employee.getName());
    }

}

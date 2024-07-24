public abstract class Employee {
    private String name;
    private int age;
    private double salary;

    Employee(String name,int age, double salary ){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    public String getName(){
        return name.trim();
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        }
        else{
            System.err.println("It's invalid age");
        }
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        if (salary > 0.01 && salary < 200_000_000.99){
        this.salary = salary;
        }
        else {
            System.err.println("Invalid salary value");
        }

    }

    protected abstract void work();
    protected abstract void takeBreak();
    protected abstract void performJob();
    protected abstract void describeRole();
    protected abstract void describeRole(String extraInfo);



}

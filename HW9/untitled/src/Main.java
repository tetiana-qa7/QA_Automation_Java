public class Main {
    public static void main(String[] args) {

        /*Приклад: Створіть масив Employee[], що містить об'єкти типів Manager,
        Developer та Designer, та викликайте методи performJob() і describeRole() д
        ля кожного з них в циклі (таким чином можна переконатись, що типи-наслідники та
        наслідуваний суперклас є взаємозамінними навіть при об'явленні масиву зі значень типу Employee
         */

        Manager manager1 = new Manager("Alex", 56, 295950.0);
        Manager manager2 = new Manager("Anna", 34, 8348595.5);
        Manager managerInvalid = new Manager("Alex", 10, 295950.0);
        managerInvalid.setAge(0);

        Developer developer1 = new Developer("Vitalii", 29, 39955005.9);
        Developer developer2 = new Developer("Olena", 40, 5890606.0);
        Developer developerInvalid = new Developer("Olena", 40, 100000.0);
        developerInvalid.setSalary(0);


        Designer designer1 = new Designer("Artem", 28, 39995995.9);
        Designer designer2 = new Designer("Olga", 45, 588590.9);



        Employee[] employees = {manager1, manager2, managerInvalid, developer1, developer2, designer1, designer2};

        for (int i = 0; i < employees.length; i++){
            employees[i].work();
            employees[i].performJob();
            employees[i].describeRole();
            System.out.println("---");
        }

    }
}
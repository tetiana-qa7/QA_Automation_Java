import java.util.ArrayList;

public class Office {
    /* класс Office, в якого буде поле-масив employees,
    а також методи, які надають контрольований доступ до внутрішнього стану офісу або інших Employee,
    наприклад Manager зможе мати додаткові методи, які приймають об'єкт типу Employee на вхід і
    "змушують" робити його якусь роботу, або методи, які дозволяють керувати офісом
     */

    private ArrayList<Employee> employees;


    public ArrayList<Employee> getEmployees(){
    return employees;
    }

    public void setEmployee(Employee employee){
        employees.add(employee);
    }

}

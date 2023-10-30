package AQAston.Lesson_4;

public class Lesson_4 {
    public static void main(String[] args) {
        Employee[] EmployeeArray = new Employee[5];
        AddToArray(EmployeeArray);
        AgeOver40(EmployeeArray);
    }

    public static void AddToArray(Employee[] EmployeeArray) {
        EmployeeArray[0] = new Employee("Андреева Елена Викторовна", "Инженер", "elenavi@gmail.com",
                "+79275699001", 20000, 20);
        EmployeeArray[1] = new Employee("Ильинец Вадим Сергеевич", "Тестировщик",
                "vadimil@gmail.com", "+79274699001", 20000, 45);
        EmployeeArray[2] = new Employee("Агзамов Ренат Лемарович", "Инженер-кондитер",
                "renatik@gmail.com", "+79275699002", 100000, 47);
        EmployeeArray[3] = new Employee("Константинова Алина Евгеньевна", "Архитектор",
                "alinashka@gmail.com", "+79275699001", 120000, 19);
        EmployeeArray[4] = new Employee("Рыбин Евгений Владимирович", "Директор",
                "rubiiin@gmail.com", "+79857818781", 120000, 39);
    }

    public static void AgeOver40(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.ToString();
            }
        }
    }
}

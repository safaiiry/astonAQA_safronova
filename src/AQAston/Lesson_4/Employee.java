package AQAston.Lesson_4;

public class Employee {
    private String FullName;
    private String Post;
    private String Email;
    private String PhoneNumber;
    private int Salary;
    private int Age;

    public Employee(String FullName, String Post, String Email, String PhoneNumber, int Salary, int Age) {
        this.FullName = FullName;
        this.Post = Post;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
        this.Salary = Salary;
        this.Age = Age;
    }

    public void ToString() {
        System.out.printf("""
                ФИО: %s\s
                Должность: %s\s
                Email: %s\s
                Телефон: %s\s
                Зарплата: %d\s
                Возраст: %d\s
                _____________
                """, FullName, Post,Email, PhoneNumber, Salary, Age);
    }

    // геттеры и сеттеры

    public void setAge(int age) {
        Age = age;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setPost(String post) {
        Post = post;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getEmail() {
        return Email;
    }

    public int getAge() {
        return Age;
    }

    public int getSalary() {
        return Salary;
    }

    public String getFullName() {
        return FullName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getPost() {
        return Post;
    }

}

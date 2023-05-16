package entities;

public class Employee {
    
    // atributos
    private Integer id;
    private String name;
    private Double salary;

    // Construtores
    public Employee() {

    }

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters e setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    // Métodos
    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100;
    }

    // to string
    @Override
    public String toString() {
        return  id + ", " + name + ", " + String.format("%.2f", salary);
    }
    
    
    

}

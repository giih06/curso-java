package entities;

public class Employee {
    // atributos
    public String name;
    public double grossSalary; // salario bruto em portugues
    public double Tax; // imposto

    // métodos

    // salário líquido (bruto - imposto)
    public double netSalary(double gs, double tax) { 
        return gs - tax;
    }

    // aumentar o salário com base em uma porcentagem dada
    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", netSalary(grossSalary, Tax));
    }
}

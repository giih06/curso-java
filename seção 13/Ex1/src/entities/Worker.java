package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkLevel;

public class Worker {
    // atributos
    private String name;
    private WorkLevel level;
    private double baseSalary;

    // associações
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();// é uma list pois pode existir vários contratos / a lista não entra no construtor

    // construtores
    public Worker () {
    }

    public Worker(String name, WorkLevel level, double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    // getters e setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkLevel getLevel() {
        return level;
    }

    public void setLevel(WorkLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContract() {
        return contracts;
    }

    // métodos
    public void addContract(HourContract contract) {
    contracts.add(contract); // adicionei o método addCOntract na lista dos contratos
    }

    public void removeContract(HourContract contract) {
    contracts.remove(contract);
    }

    public double income(int year, int month) {
        double soma = baseSalary;
        Calendar cal = Calendar.getInstance();
        for(HourContract c : contracts) {
            cal.setTime(c.getDate());
            int c_yeat = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if(year == c_yeat && month == c_month){
                soma += c.totalValue();
            }
        }
        return soma;
    }

    
    
}

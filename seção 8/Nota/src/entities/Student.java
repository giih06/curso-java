package entities;

public class Student {
    //atributos
    public String name;
    public double grade1, grade2, grade3;
    //primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada

    //metodos
    public double finalGrade(){
        return grade1 + grade2 + grade3;
    }

    public double missingPoints(){
        if(finalGrade() < 60){
            return 60.0 - finalGrade();
        } else {
            return 0.0;
        }
    }

    
}

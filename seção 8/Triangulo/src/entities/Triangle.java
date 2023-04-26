package entities; // pacote da classe

public class Triangle {
    
    // o public significa que a fução vai poder ser usada em outro arquivo

    // Declarando os atributos da classe Triangle
    public double a;
    public double b;
    public double c;

    // Criando um método (função) que calcule a área do triângulo
    // essa função não receerá parãmetros, por isso o parênteses não tem nada dentro
    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }
}

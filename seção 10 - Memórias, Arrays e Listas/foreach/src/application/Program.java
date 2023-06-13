package application;
public class Program {
    public static void main(String[] args) throws Exception {
        String[] vect = new String[] {"Maria", "Bob", "Alex"};

        for(int i=0; i<vect.length; i++) {
            System.out.println(vect[i]);
        }
        System.out.println("------------------");

        // Esse for percorre todos os elementos do vetor vect, chamando cada um dos elementos de obj
        // Como lê: para cada objeto obj, contido no vetor vect, FAÇA:
        for(String obj : vect) {
            System.out.println(obj);
        }
    }
}

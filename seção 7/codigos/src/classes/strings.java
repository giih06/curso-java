package classes;

// Funções interessantes para String
/* Formatar:
toLowerCase() - transformar para minúsculo
toUpperCase() - transforma para maiúsculo
trim() - remove espaços
    Recortar:
substring(inicio) - recorta informando o início 
substring(inicio, fim) - recorta indormando do início ao fim
    Substituir:
Replace(char, char) - substitui uma letra por outra
Replace(string, string) - substitui uma string por outra
    Buscar a posição de alguma parte do string:
IndexOf - busca a primeira ocorrencia da string(em posição)
LastIndexOf -  busca a ultima ocorrencia da string (em posição)
    str.Split(" "): recortar o string com base no separador que for informado

*/
public class strings {
    public static void main(String[] args) throws Exception {
        
    String original = "abcde FGHIJ ABC abc DEFG    ";

    String s01 = original.toLowerCase();
    String s02 = original.toUpperCase();
    String s03 = original.trim();
    String s04 = original.substring(2);
    String s05 = original.substring(2, 9);
    String s06 = original.replace('a', 'x');
    String s07 = original.replace("abc", "xy");

    int i = original.indexOf("bc");
    int j = original.lastIndexOf("bc");

    System.out.println("Original: -" + original + "-");
    System.out.println("toLowerCase: -" + s01 + "-");
    System.out.println("toUpperCase: -" + s02 + "-");
    System.out.println("trim: -" + s03 + "-");
    System.out.println("substring(2): -" + s04 + "-");
    System.out.println("substring(2, 9): -" + s05 + "-");
    System.out.println("replace('a', 'x'): -" + s06 + "-");
    System.out.println("replace('abc', 'xy'): -" + s07 + "-");
    System.out.println("Index of 'bc': " + i);
    System.out.println("Last index of 'bc': " + j);


        
    }
}
package application;
public class Program {
    // Boxing, unboxing e wrapper classes
    public static void main(String[] args) throws Exception {

        // Boxing
        int x = 20;
        Object obj = x;
        System.out.println(obj);

        // Unboxing
        int y = (int) obj;
        System.out.println(y);

        // Wrapper classes
        Integer obj2 = x;
        int z = obj2 * 2;
        // obs: tipo primitivo - int; tipo classe - Integer

    }
}

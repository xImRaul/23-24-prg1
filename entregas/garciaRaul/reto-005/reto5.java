import java.util.Scanner;

class Reto5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un primer numero entero");
        int numero1 = scanner.nextInt();
        System.out.println("Dime un segundo numero entero");
        int numero2 = scanner.nextInt();
        
        System.out.println(numero1 > numero2 ? "El numero mayor es " + numero1 : "El numero mayor es " + numero2);
    }
}

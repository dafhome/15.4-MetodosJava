import java.util.Scanner;

public class Saludar {
    public static void main(String[] args) throws Exception {


        Scanner scan = new Scanner(System.in);
        
        imprimir("¿Como te llamas?", 1, 1);
        String nombre = scan.nextLine();

        imprimir("¿Como te gusta que te saluden?", 1, 1);
        String saludo = scan.nextLine();
        System.out.println();
        saludar1();
        saludar2(saludo, nombre);
        imprimir(saludar3(saludo, nombre), 1, 1);
        scan.close();
    }

    public static void saludar1() {
        imprimir("Hola Andrés!", 1, 1);
    }

    public static void saludar2(String saludo, String nombre) {
        imprimir(saludo + " " + nombre + "!", 1, 1);
    }

    public static String saludar3(String saludo, String nombre) {
        String frase = saludo + " " + nombre + "!";
        return frase;
    }

    static void imprimir(String frase, int enter, int sleep) {
        try {
            for (int i = 0; i < frase.length(); i++) {
                System.out.print(frase.charAt(i));
                if (sleep == 1) {
                    Thread.sleep(20);
                }

            }
            if (enter == 1) {
                System.out.println(" ");
            }

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

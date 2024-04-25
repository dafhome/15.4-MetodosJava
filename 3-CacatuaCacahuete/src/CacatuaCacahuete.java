import java.util.Scanner;

public class CacatuaCacahuete {
    public static String frase = "La cacatua dice: ¡Cacatúa cacahuetes!";
    public static String pregunta = "Que comida quieres darle a la cacatua?";
    public static String separador = "------------------------------------------------------";
    
    public static void main(String[] args) throws Exception {
        // 3- CACATÚA CACAHUETES!

        // Tienes una cacatúa que todo el rato te pide comer cacahuetes, diciendo
        // “cacatúa cacahuetes!”.

        // El programa te pregunta qué comida le das.

        // Mientras NO sean cacahuetes, sigue diciendo “cacatúa cacahuetes!”

        // Pero si le das cacahuetes, llama al método ‘dormirse’ y se calla, y en vez
        // del mensaje anterior,
        // vemos ‘zzZzzzz…’ (aquí acaba el programa)
        // *EXTRA: realizar no solo el método 'dormirse()', sino también el de
        // 'pideComida()'

        Scanner scan = new Scanner(System.in);
        String comida;
        imprimir("Que hambre tiene tu cacatua! Vamos a preguntarle si quiere comer:", 1, 1);
        System.out.println();
        boolean cacahuete = false;

        while (!cacahuete) {

            comida = CacatuaCacahuete(scan);

            if (comida.equalsIgnoreCase("cacahuete") | comida.equalsIgnoreCase("cacahuetes")) {
                dormirse();
                cacahuete = true;
            }

        }

        scan.close();
    }

    static void dormirse() {
        imprimir(
                "Se ha dormido: zzzZZzzzZZzzzZZzzzZZzzzZZzzzZZzzzZZzzzZZzzzZZzzzZZzzzZZzzzZZzzzZZzzzZZzzzZZzzzZZzzzZZzzzZZzzzZZzzzZZzzzZZ",
                1, 1);
    }

    static String CacatuaCacahuete(Scanner scan) {
        // Scanner scan = new Scanner(System.in);
        imprimir(frase, 1, 1);
        imprimir(separador, 1, 0);
        imprimir(pregunta, 1, 1);
        String respuesta = scan.nextLine();
        System.out.println();
        // scan.close();
        return respuesta;   
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

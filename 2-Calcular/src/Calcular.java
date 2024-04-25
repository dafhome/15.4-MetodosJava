import java.util.Scanner;

public class Calcular {
    public static void main(String[] args) throws Exception {

        // 2- CALCULAR
        // Con switch, preguntar la operación, y con switch envíalo a una función
        // diferente
        // ( ‘sumar’, ‘restar’, ‘multiplicar’ y ‘dividir’ )que retorne el resultado a la
        // opción del switch y se
        // muestre en terminal.

        // +EXTRA: Opcional: colocar todo el programa en un bucle que siga funcionando
        // mientras que el usuario no
        // escriba “s” (salir).
        // +EXTRA: usar char y (+, -, *,/)

        Scanner scan = new Scanner(System.in);
        String separador = "----------------------------------------------------------------------";
        String operacion;
        int num1;
        int num2;
        int resultado;
        float resultadoDivision;
        float resultadoTotal;
        int contador = 0;
        boolean salir = false;
        String pregunta;
        while (!salir) {
            imprimir("----CALCULADORA----", 1, 1);

            if (contador > 0) {
                imprimir("Vamos a realizar otra operación, te volveré a preguntar dos números y la operación", 1, 1);
            }

            else
                imprimir("Vamos a calcular la operación que me indiques entre los dos números que quieras", 1, 1);

            imprimir("Indicame el primer número: ", 0, 1);
            num1 = scan.nextInt();

            imprimir("Indicame el segundo número: ", 0, 1);
            num2 = scan.nextInt();
            System.out.println();
            imprimir(separador, 0, 0);
            System.out.println();
            imprimir(
                    "sumar/+, restar/-, multiplicar/* o dividir/'/'",1, 1);
            scan.nextLine();
            operacion = scan.nextLine();

            switch (operacion) {
                case "sumar":
                    resultado = sumar(num1, num2);
                    imprimir("El resultado de la " + operacion + " es: " + resultado, 1, 1);
                    break;
                case "restar":
                    resultado = restar(num1, num2);
                    imprimir("El resultado de la " + operacion + " es: " + resultado, 1, 1);

                    break;
                case "multiplicar":
                    resultado = multiplicar(num1, num2);
                    imprimir("El resultado de la " + operacion + " es: " + resultado, 1, 1);

                    break;
                case "dividir":
                    resultadoDivision = (float) dividir(num1, num2);
                    imprimir("El resultado de la " + operacion + " es: " + resultadoDivision, 1, 1);

                    break;

                case "+":
                    resultado = sumar(num1, num2);
                    imprimir("El resultado de la " + operacion + " es: " + resultado, 1, 1);
                    break;
                case "-":
                    resultado = restar(num1, num2);
                    imprimir("El resultado de la " + operacion + " es: " + resultado, 1, 1);

                    break;
                case "*":
                    resultado = multiplicar(num1, num2);
                    imprimir("El resultado de la " + operacion + " es: " + resultado, 1, 1);

                    break;
                case "/":
                    resultadoDivision = (float) dividir(num1, num2);
                    imprimir("El resultado de la " + operacion + " es: " + resultadoDivision, 1, 1);

                    break;
                default:
                    imprimir("No has escrito una operación correcta", 1, 1);
                    break;
            }
            contador++;

            imprimir("Indica s para salir de la calculadora o cualquier otro valor para continuar", 1, 1);
            pregunta = scan.nextLine();
            if (pregunta.equalsIgnoreCase("s") || pregunta.equalsIgnoreCase("salir")) {
                salir = true;
            }
        }

        scan.close();
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static float dividir(int a, int b) {
        return (float) a / b;
    }

    public static void imprimir(String frase, int enter, int sleep) {
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

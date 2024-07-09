import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // ¿Qué tipo de bebida te gusta?
        System.out.println("Bienvenido a la máquina expendora de bebidas");
        System.out.println("Elegí una opción de las siguientes: ");
        System.out.println("1 - Café");
        System.out.println("2 - Mate");
        System.out.println("3 - Refresco");
        System.out.println("4 - Vino");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
            System.out.println("Buena elección que combina con Java");
            break;
            case 2:
            System.out.println("Seguramente eres de Argentina, ¡viva la libertad c@r4j0!");
            break;
            case 3:
            System.out.println("Cuidado con el azúcar");
            break;
             case 4:
            System.out.println("Ten cuidado, sugiero no manejar");
            break;
            
            default:
            System.out.println("Opción no válida. Fin del programa.");
                break;
        }

        if(opcion <= 4){
            System.out.println("¡Disfruta de tu bebida!");
        }
        scanner.close();

    }
}


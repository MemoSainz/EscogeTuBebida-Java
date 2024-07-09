import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // ¿Qué tipo de bebida te gusta?
        System.out.println("Bienvenido a la máquina expendora // Welcome to the vending machine");
        System.out.println("Elige una opción:                 //  Chose an option:    ");
        System.out.println("1 - Café                           / 1 - Coffee");
        System.out.println("2 - Mate                           / 2 - Mate");
        System.out.println("3 - Refresco                       / 3 - Soda");
        System.out.println("4 - Vino                           / 4 - Wine");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
            System.out.println("Buena elección que combina con Java      /      Good option that combines with Java");
            break;
            case 2:
            System.out.println("Seguramente eres de Argentina, ¡viva la libertad c@r4j0!        /        Perhaps you're from Argentina, long live freedom, darn it!!");
            break;
            case 3:
            System.out.println("Cuidado con el azúcar        /       Be careful with the sugar ");
            break;
             case 4:
            System.out.println("Ten cuidado, sugiero no manejar      /       Be careful, better to not drive.");
            break;
            
            default:
            System.out.println("Opción no válida. Fin del programa.      /       Option no valid, end of the program.");
                break;
        }

        if(opcion <= 4){
            System.out.println("¡Disfruta de tu bebida!         /        Enjoy your beverage!");
        }
        scanner.close();

    }
}


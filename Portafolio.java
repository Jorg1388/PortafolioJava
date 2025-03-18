import java.util.Scanner;

public class Portafolio {

    public static void main(String[] args) {
        
        Scanner Entrada=new Scanner(System.in);
        int opcion;

        do {
            System.out.println();
            System.out.println("Bienvenidos a mi Alexander java [Alexander Versión 1.21]");

            System.out.println("    _    _                          _           ");
            System.out.println("   / \\  | | _____  ____ _ _ __   __| | ___ _ __ ");
            System.out.println("  / _ \\ | |/ _ \\ \\/ / _` | '_ \\ / _` |/ _ \\ '__|");
            System.out.println(" / ___ \\| |  __/>  < (_| | | | | (_| |  __/ |   ");
            System.out.println("/_/   \\\\_\\_|\\___/_/\\_\\__,_|_| |_|\\__,_|\\___|_|   ");
            System.out.println("");

            System.out.println("[ ? ] Seleciona una opción para continuar");
            System.out.println("Proyecto iniciado -->> Mar 18 8:51 am 2025");
            System.out.println("");

           System.out.println("[1] La suma de dos números");
           System.out.println("[2]");
           System.out.println("[3]");
           System.out.println("[0] Salir");
           System.out.print("[?] ");
           opcion=Entrada.nextInt();

           switch (opcion) {
                case 1:
                System.out.print("Ingresar el primer numero: ");
                int num1=Entrada.nextInt();

                System.out.print("Ingresar el segundo numero: ");
                int num2=Entrada.nextInt();

                int resultado=num1+num2;

                System.out.println("El resultado de la suma es " + resultado);
                    break;

                case 2:
                break;
                
                case 3:
                break;

                case 0:
                System.out.println("Saliendo del progarama.");
                break;

                default:
                System.out.println("Error de entrada [/]");
                break;
                
            }
           
        }while (opcion != 0);

    }
}
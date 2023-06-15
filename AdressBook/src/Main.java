import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.load();

        Scanner scanner = new Scanner(System.in);
        String option = "";

        while (!option.equals("5")) {
            System.out.println("1. Listar contactos");
            System.out.println("2. Crear contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Guardar contactos");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            option = scanner.nextLine();

            switch (option) {
                case "1":
                    addressBook.list();
                    break;
                case "2":
                    System.out.print("Ingresa el número de contacto: ");
                    String number = scanner.nextLine();
                    System.out.print("Ingresa el nombre de contacto: ");
                    String name = scanner.nextLine();
                    addressBook.create(number, name);
                    break;
                case "3":
                    System.out.print("Ingresa el número de contacto a eliminar: ");
                    String deleteNumber = scanner.nextLine();
                    addressBook.delete(deleteNumber);
                    break;
                case "4":
                    addressBook.save();
                    break;
                case "5":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }

        scanner.close();
    }
}

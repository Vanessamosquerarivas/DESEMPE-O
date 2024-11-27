package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leerteclado=new Scanner(System.in);
        String tituloLibro;
        int cantiddaEejemplares;
        int cantidad = 5;
        String titulo = "EL PRINCIPITO";
          boolean menu=true;
                System.out.print("Ingrese el título del libro: ");
                tituloLibro = leerteclado.nextLine();

                System.out.print("Ingrese la cantidad de ejemplares: ");
                int ejemplares =3;
                cantiddaEejemplares=leerteclado.nextInt();

                    System.out.println("no tenemos esa cantidad");



        do {

            System.out.println("***Menú***");
            System.out.print("1. Buscar un libro por título y mostrar cuántos ejemplares hay. "
                    + "El libro '" + titulo + "' tiene " + cantidad + " ejemplares.");

            System.out.println(" 2. Mostrar el libro con mayor cantidad de ejemplares.");
         System.out.println("3.Listar los libros con menos de 3 ejemplares.");
         System.out.println("4. Salir del programa.");
         System.out.print("elige una opcion: ");

         String opcion = leerteclado.nextLine();
            cantidad = leerteclado.nextInt();
         leerteclado.nextLine();

         switch (cantidad) {
             case 1:
                 System.out.print("Digita el titulo del libro que buscas ");
                 opcion= leerteclado.nextLine();
                 System.out.println("De este libro hay 5 elemplare");
                 System.out.println(" de este libro no tenemos ejemplares");
                 break;
                 case 2:
                    System.out.println(" El libro con mayor catidad de ejemplares es ");
                    System.out.println("El principito ");
                    break;

                case 3:
                    System.out.println("Estos son los libros con menos de 3 ejemplares");
                    System.out.println("Sombras y susuros");
                    System.out.println("lo que el viento se llevo");
                    break;
             case 4:
                 System.out.println("Salir del sistema");
                 menu=false;



            }
        }while (menu==true);


    }
}
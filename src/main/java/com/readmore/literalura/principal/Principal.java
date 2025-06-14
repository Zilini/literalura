package com.readmore.literalura.principal;

import com.readmore.literalura.repository.LibrosRepository;

import java.util.Scanner;

public class Principal {
    Scanner teclado = new Scanner(System.in);
    private LibrosRepository repositorio;

    public Principal(LibrosRepository repository) {
        this.repositorio = repository;
    }

    public void mostrarMenu () {
        var opcion = -1;
        while (opcion != 0) {
            var menu = """
                    -----------------
                    
                    1 - Buscar libros
                    
                    0 - Salir.
                    
                    -----------------
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    buscarLibroWeb();
                    break;
                case 0:
                    System.out.println("¡Gracias por visitar LiterAlura!");
                    System.out.println("Cerrando aplicación...");
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }
    }



    private void buscarLibroWeb() {
    }
}

package com.readmore.literalura.principal;

import com.readmore.literalura.model.Datos;
import com.readmore.literalura.model.DatosLibros;
import com.readmore.literalura.model.Libros;
import com.readmore.literalura.repository.LibrosRepository;
import com.readmore.literalura.service.ConsumeAPI;
import com.readmore.literalura.service.ConvieteDatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Principal {
    Scanner teclado = new Scanner(System.in);
    private ConsumeAPI consumeAPI = new ConsumeAPI();
    private ConvieteDatos conversor = new ConvieteDatos();
    private static final String URL_BASE = "https://gutendex.com/books?search=";
    private List<Datos> datosLibros = new ArrayList<>();
    private List<Libros> libros;
    private LibrosRepository repositorio;
    Optional<Libros> libroBuscado;

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

    private Datos getDatosLibros () {
        System.out.println("Escribe el nombre del libro que quieres buscar: ");
        var nombreLibro = teclado.nextLine();
        var json = consumeAPI.obtenerDatos(URL_BASE + nombreLibro.replace(" ", "+"));
        System.out.println(json);
        DatosLibros datos = conversor.obtenerDatos(json, l.class);
    }

    private void buscarLibroWeb() {
    }
}

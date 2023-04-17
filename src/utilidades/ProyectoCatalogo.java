package utilidades;

import java.util.Date;
import entidades.Comics;
import entidades.IElectronico;
import entidades.ILibro;
import entidades.IPhone;
import entidades.IProducto;
import entidades.Libro;
import entidades.TvLcd;

public class ProyectoCatalogo {

    public static void main(String[] args) {
        IProducto[] productos = new IProducto[6];

        productos[0] = new IPhone(80000, "Apple", "iPhone 12", "Negro");
        productos[1] = new IPhone(90000, "Apple", "iPhone XR", "Azul");
        productos[2] = new TvLcd(340000, "Samsung", 60);
        productos[3] = new Libro(4500, new Date(49, 5 , 8), "George Orwell", "1984", "Acantilado");
        productos[4] = new Libro(1500, new Date(116, 6, 31), "Kazuaki Takano", "Akili", "Umbriel");
        productos[5] = new Comics(9500, new Date(88, 2, 1), "Batman: The Killing Joke", "Alan Moore", "DC Comics", "Batman");

        for (IProducto producto : productos) {
            System.out.println("Tipo de producto: " + producto.getClass().getSimpleName());
            System.out.println("Precio: " + producto.getPrecio());

            if (producto instanceof IPhone) {
                IPhone electronico = (IPhone) producto;
                System.out.println("Fabricante: " + electronico.getFabricante());
                System.out.println("Modelo: " + electronico.getModelo());
                System.out.println("Color: " + electronico.getColor());
            }
            
            if (producto instanceof TvLcd) {
                TvLcd electronico1 = (TvLcd) producto;
                System.out.println("Fabricante: " + electronico1.getFabricante());
                System.out.println("Pulgadas: " + electronico1.getPulgadas());
            }

            if (producto instanceof ILibro) {
                ILibro libro = (ILibro) producto;
                System.out.println("Autor: " + libro.getAutor());
                System.out.println("Título: " + libro.getTitulo());
                System.out.println("Editorial: " + libro.getEditorial());
                System.out.println("Fecha de publicación: " + libro.getFechaPublicacion());
            }

            if (producto instanceof Comics) {
                Comics comics = (Comics) producto;
                System.out.println("Personaje: " + comics.getPersonaje());
            }

            System.out.println();
        }
    }
}
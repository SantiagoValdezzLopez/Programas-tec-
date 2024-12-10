import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// clase Producto
class Producto {
    private int id;
    private String categoria;
    private String nombre;
    private double precio;

    public Producto(int id, String categoria, String nombre, double precio) {
        this.id = id;
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto [ID=" + id + ", Categoria=" + categoria + ", Nombre=" + nombre + ", Precio=" + precio + "]";
    }
}

// Clase principal maneja el catalogo de productos
public class CatalogoProductos {
    
    private List<Producto> productos; // Lista para almacenar los productos

    public CatalogoProductos() {
        productos = new ArrayList<>();
        //  productos de ejemplo
        productos.add(new Producto(1, "Ropa", "Chamarra", 299.99));
        productos.add(new Producto(2, "Ropa", "Pantalón", 199.99));
        productos.add(new Producto(3, "Calzado", "Zapatillas", 499.99));
    }

    // Método para buscar productos por nombre o descripción
    public void buscarProducto(String busqueda) {
        boolean encontrado = false;
        System.out.println("Producto(s) encontrado(s):");
        for (Producto producto : productos) {
            if (producto.getNombre().toLowerCase().contains(busqueda.toLowerCase())) {
                System.out.println(producto);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Producto no encontrado...");
        }
    }

    // Método para eliminar
    public void eliminarProducto(int id) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId() == id) {
                System.out.println("Se borró correctamente el producto \"" + productos.get(i).getNombre() + "\".");
                productos.remove(i);
                System.out.println("Quedan " + productos.size() + " cantidad de productos en el catálogo.");
                return;
            }
        }
        System.out.println("Producto no encontrado para eliminar.");
    }

    // Método principal que ejecuta el menú
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CatalogoProductos catalogo = new CatalogoProductos();
        
        while (true) {
            // Mostrar menú principal
            System.out.println("Bienvenido al Catálogo de Productos.");
            System.out.println("Selecciona una de las siguientes opciones:");
            System.out.println("1) Buscar Productos");
            System.out.println("2) Eliminar Producto");
            System.out.println("0) Salir");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            if (opcion == 0) { // Salir del programa
                break;
            } else if (opcion == 1) { // Buscar Productos
                System.out.println("Ingresa el nombre o descripción a buscar>");
                String busqueda = scanner.nextLine();
                catalogo.buscarProducto(busqueda);
            } else if (opcion == 2) { // Eliminar Producto
                System.out.println("Ingresa el Id del producto a eliminar:");
                int idEliminar = scanner.nextInt();
                catalogo.eliminarProducto(idEliminar);
            } else {
                System.out.println("Opción no válida. Intenta nuevamente.");
            }
        }
        
        scanner.close(); // Cerrar el escáner al salir
        System.out.println("Gracias por usar el Catálogo de Productos.");
    }
}

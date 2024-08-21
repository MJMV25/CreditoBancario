package Ejercicio4;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    private static ArrayList<Producto> productos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Gestión de Productos:");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Modificar Stock de Producto");
            System.out.println("3. Eliminar Producto");
            System.out.println("4. Listar Productos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    modificarStock();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    listarProductos();
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void agregarProducto() {
        System.out.print("Ingrese el nombre del producto: ");
        scanner.nextLine();
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la descripción del producto: ");
        String descripcion = scanner.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese el stock del producto: ");
        int stock = scanner.nextInt();
        System.out.print("¿El producto es perecedero? (s/n): ");
        char esPerecedero = scanner.next().charAt(0);

        if (esPerecedero == 's' || esPerecedero == 'S') {
            System.out.print("Ingrese la fecha de vencimiento (formato yyyy-MM-dd): ");
            scanner.nextLine();
            String fecha = scanner.nextLine();
            Date fechaVencimiento = new Date(fecha);

            ProductoPerecedero productoPerecedero = new ProductoPerecedero(nombre, descripcion, precio, stock, fechaVencimiento);
            productos.add(productoPerecedero);
        } else {
            Producto producto = new Producto(nombre, descripcion, precio, stock);
            productos.add(producto);
        }

        System.out.println("Producto agregado con éxito.");
    }

    private static void modificarStock() {
        System.out.print("Ingrese el nombre del producto a modificar: ");
        scanner.nextLine();
        String nombre = scanner.nextLine();

        Producto producto = buscarProducto(nombre);
        if (producto != null) {
            System.out.print("Ingrese el nuevo stock: ");
            int nuevoStock = scanner.nextInt();
            producto.modificarStock(nuevoStock);
            System.out.println("Stock actualizado con éxito.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void eliminarProducto() {
        System.out.print("Ingrese el nombre del producto a eliminar: ");
        scanner.nextLine();
        String nombre = scanner.nextLine();

        Producto producto = buscarProducto(nombre);
        if (producto != null) {
            productos.remove(producto);
            System.out.println("Producto eliminado con éxito.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static Producto buscarProducto(String nombre) {
        for (Producto producto : productos) {
            if (producto.obtenerNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    private static void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
        } else {
            System.out.println("Lista de Productos:");
            for (Producto producto : productos) {
                System.out.println(producto);
            }
        }
    }
}

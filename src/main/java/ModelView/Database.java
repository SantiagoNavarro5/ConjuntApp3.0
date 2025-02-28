package ModelView;

import java.io.*;
import java.util.*;

public class Database {


public class BaseDeDatosArchivo {

    private static final String FILE_PATH = "base_de_datos.txt"; // Ruta del archivo

    public static void main(String[] args) {
        // Ejemplo de operaciones
        // 1. Insertar datos
        insertarRegistro("Juan Pérez", "juan@example.com");
        insertarRegistro("Maria Gómez", "maria@example.com");

        // 2. Leer y mostrar los datos
        mostrarRegistros();

        // 3. Actualizar un registro
        actualizarRegistro(1, "Juan Pérez", "juan.perez@example.com");

        // 4. Volver a mostrar los datos
        mostrarRegistros();
    }

    // Método para insertar un registro
    public static void insertarRegistro(String nombre, String email) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            // Obtener el siguiente ID
            int id = obtenerSiguienteId();
            writer.write(id + "|" + nombre + "|" + email);
            writer.newLine(); // Añadir salto de línea
            System.out.println("Registro insertado: " + id + " | " + nombre + " | " + email);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    // Método para leer y mostrar los registros
    public static void mostrarRegistros() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split("\\|");
                System.out.println("ID: " + partes[0] + ", Nombre: " + partes[1] + ", Email: " + partes[2]);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    // Método para actualizar un registro por ID
    public static void actualizarRegistro(int id, String nuevoNombre, String nuevoEmail) {
        List<String> lineas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split("\\|");
                if (Integer.parseInt(partes[0]) == id) {
                    // Si el ID coincide, actualizamos el registro
                    lineas.add(id + "|" + nuevoNombre + "|" + nuevoEmail);
                } else {
                    lineas.add(linea);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        // Volver a escribir el archivo con los datos actualizados
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (String nuevaLinea : lineas) {
                writer.write(nuevaLinea);
                writer.newLine();
            }
            System.out.println("Registro con ID " + id + " actualizado.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    // Método para obtener el siguiente ID (el ID es el primero de cada línea)
    private static int obtenerSiguienteId() {
        int maxId = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split("\\|");
                int id = Integer.parseInt(partes[0]);
                if (id > maxId) {
                    maxId = id;
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return maxId + 1; // Incrementa el ID
    }
}

    
}

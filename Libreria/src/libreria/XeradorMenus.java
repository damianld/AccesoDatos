
package libreria;

import java.sql.Statement;

/**
 *
 * @author a14damianld
 */
public class XeradorMenus {

    public void mostrarMenuInicial(Statement sentencia, EntradaTeclado entradaTeclado) {
        byte eleccionMenu;
        do {
            System.out.println("Benvido á librería de Damián\n"
                    + "1. Insertar filas\n"
                    + "2. Borrar filas\n"
                    + "3. Modificar rexistros\n"
                    + "4. Consultar rexistros\n"
                    + "0. Cerrar programa");
            eleccionMenu = entradaTeclado.leerByteTeclado();
            switch (eleccionMenu) {
                case 0:
                    System.out.println("O programa cerrouse con éxito");
                    break;
                case 1:
                    mostrarMenuInsertar(sentencia, entradaTeclado);
                    break;
                case 2:
                    mostrarMenuBorrar(sentencia);
                    break;
                case 3:
                    mostrarMenuEditarPrecio(sentencia, entradaTeclado);
                    break;
                case 4:
                    mostrarMenuConsultas(sentencia, entradaTeclado);
                    break;
                default:
                    System.err.println("Opción incorrecta");
            }
        } while (eleccionMenu != 0);
    }
    
    private void mostrarMenuConsultas(Statement sentencia, EntradaTeclado entradaTeclado) {
        byte eleccionMenu;
        do {
            System.out.println("CONSULTAS\n"
                    + "1. Datos dun libro\n"
                    + "2. Libros dun autor\n"
                    + "3. Visualizar táboa libros\n"
                    + "4. Visualizar autores e libros\n"
                    + "0. Atrás");
            eleccionMenu = entradaTeclado.leerByteTeclado();
            switch (eleccionMenu) {
                case 0:
                    System.out.println("Volves atrás");
                    break;
                case 1: 
                    
                    break;
                case 3:
                    ConsultarBD.visualizarLibros(sentencia);
                    break;
                default:
                    System.err.println("Opción incorrecta");
            }
        } while (eleccionMenu != 0);
    }
    
    private void mostrarMenuEditarPrecio(Statement sentencia, EntradaTeclado entradaTeclado) {
        byte eleccionMenu;
        do {
            System.out.println("MODIFICACIÓNS\n"
                    + "1. Modificar precio\n"
                    + "0. Atrás");
            eleccionMenu = entradaTeclado.leerByteTeclado();
            switch (eleccionMenu) {
                case 0:
                    System.out.println("Volves atrás");
                    break;
                case 1: 
                    new ModificacionBD().editarPrezoLibro(sentencia, entradaTeclado);
                    break;
                default:
                    System.err.println("Opción incorrecta");
            }
        } while (eleccionMenu != 0);
    }
    
    private void mostrarMenuBorrar(Statement sentencia) {
        byte eleccionMenu;
        do {
            System.out.println("BORRAR\n"
                    + "1. Borrar libro\n"
                    + "2. Borrar autor\n"
                    + "0. Atrás");
            eleccionMenu = new EntradaTeclado().leerByteTeclado();
            switch (eleccionMenu) {
                case 0:
                    System.out.println("Volves atrás");
                    break;
                case 1: 
                    new BorrarBD().eliminarLibro(sentencia);
                    break;
                case 2:
                    new BorrarBD().eliminarAutor(sentencia);
                    break;
                default:
                    System.err.println("Opción incorrecta");
            }
        } while (eleccionMenu != 0);
    }
    
    private void mostrarMenuInsertar(Statement sentencia, EntradaTeclado entradaTeclado) {
        byte eleccionMenu;
        do {
            System.out.println("INSERTAR\n"
                    + "1. Insertar libro\n"
                    + "2. Insertar autor\n"
                    + "0. Atrás");
            eleccionMenu = entradaTeclado.leerByteTeclado();
            switch (eleccionMenu) {
                case 0:
                    System.out.println("Volves atrás");
                    break;
                case 1: 
                    new InsertarBD().insertarLibro(sentencia, entradaTeclado);
                    break;
                case 2:
                    new InsertarBD().insertarAutor(sentencia, entradaTeclado);
                    break;
                default:
                    System.err.println("Opción incorrecta");
            }
        } while (eleccionMenu != 0);
    }

}

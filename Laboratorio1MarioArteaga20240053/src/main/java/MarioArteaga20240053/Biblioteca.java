package MarioArteaga20240053;
import java.awt.List;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Biblioteca {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Integer> Tree = new TreeMap<>();
        Set<String> Hash = new HashSet<>();
        HashMap<Integer, String> MapHash = new HashMap<>();
        LinkedList<String> ListA = new LinkedList<>();

        System.out.println("Bienvenido a DonBosco biblioteca");
        System.out.println(" 1.  Insertar Libros || 2.Obtener Libro por Genero || 3.Obtener los Ultimos Libros || 4.Obtener Libro por ISBN ");
        int RPST = sc.nextInt();
        do {
            switch (RPST){
                case 1:
                    System.out.println("¿Que quieres hacer?");
                    System.out.println("1. Agregar Libro || 2.Buscar Libro por Nombre ");
                    int res = sc.nextInt();
                    if (res == 1){
                        System.out.println("Añade el libro");
                        String Libro = sc.next();
                        boolean RPSTLibro = Hash.contains(Libro);
                        if (RPSTLibro){
                            System.out.println("Libro existente");
                        }else{
                            Hash.add(Libro);
                            System.out.println("Agrega el ISBN del Libro");
                            sc.nextLine();
                            int ISBN = sc.nextInt();
                            Tree.put(Libro, ISBN);
                            MapHash.put(ISBN , Libro);
                            sc.nextLine();
                            System.out.println("¿Cual es el genero del libro?");
                            String genero = sc.nextLine();
                            if (ListA.size()>10){
                                System.out.println("Registro mas antiguo eliminado");
                                ListA.removeLast();
                            }else {
                                ListA.add(Libro);
                            }
                            System.out.println("Libro añadido con exsito.");
                        }
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }while (RPST <= 5);

    }
}
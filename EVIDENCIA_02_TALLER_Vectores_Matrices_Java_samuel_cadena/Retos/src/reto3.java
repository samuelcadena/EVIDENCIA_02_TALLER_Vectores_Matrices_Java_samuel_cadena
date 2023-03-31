import java.util.Scanner;

public class reto3 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String[][] SC;


     SC = new String[3][3];
    
    System.out.println("Como Usarla:");
    System.out.println("Ingrese el Nombre del producto y el precio sera Con "+" : ");
    System.out.println();
     for (int V = 0; V < 3; V++) {
                
            for (int D = 0; D < 3; D++) {

                System.out.println("Escriba el nombre y el precio del producto es");
                SC[V][D] = lectura.next();

            }

        }
       
        for (int j = 0; j < 3; j++) {
            System.out.println(" _____________");
            System.out.print("|");
            for (int i = 0; i < 3; i++) {

                System.out.print(j+""+i+" "+SC[j][i]);
                
                if (i != SC[j].length - 1)
                
                    System.out.print("\t");
            }
            
            System.out.println(" | ");

        }
        System.out.println( " ______________");
        lectura.close();
    }
}

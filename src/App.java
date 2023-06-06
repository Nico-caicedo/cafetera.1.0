import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {

    // SIRVE PARA MOSTRA EL MENU
    public static void MostrarMenu() {

        Scanner scaner = new Scanner(System.in);
        String on = "e";
        boolean power = false, estado;
        int agua = 0, leche = 0, cafe = 0, capuchino = 0,
                p1, p2, p3, p4, op, limit = 50,
                _tintoP, _cafeP, _capuchinoP;
        String message;

        Cafetera C1 = new Cafetera();

        do {
            // se usa para colocar el enceder y apagar lavadora
            if (power == false) {
                on = "Encender";
            } else if (power == true) {
                on = "Apagar";
            }

            String[] options = {
                "1. Estado " + on,
                "2. Cargar material",
                "3. Estado de consumo",
                "4. Establecer precios",
                "5. Estado de ventas",
                "6. Hacer café",
                "0. Cerrar"
        };
        
        String selectedOption = (String) JOptionPane.showInputDialog(
                null,
                "___ café Don José Valdez",
                "Menú",
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]
        );
        
         op = Integer.parseInt(selectedOption.substring(0, 1));
        
            switch (op) {
                case 1:
                    if (op == 1) {

                        if (power == false) {
                            power = true;
                            C1.setEstado(power);
                        } else if (power == true) {
                            power = false;
                            C1.setEstado(power);

                            estado = false;
                        }
                    }
                    break;
                case 2:

                    System.out.println("---CARGAR SUMINISTROS---");
                    System.out.print("1.Agua: ");
                    p1 = scaner.nextInt();
                    while ((agua + p1) > 100) {
                        System.out.print("---cantidad supera el limite--- ");
                        System.out.print("1.leche: ");
                        p1 = scaner.nextInt();
                    }
                    agua = agua + p1;

                    System.out.print("2. leche:");
                    p2 = scaner.nextInt();
                    while ((leche + p2) > limit) {
                        System.out.print("---cantidad supera el limite--- ");
                        System.out.print("2.leche: ");
                        p2 = scaner.nextInt();
                    }
                    leche = leche + p2;

                    System.out.print("3. cafe:");
                    p3 = scaner.nextInt();
                    while ((cafe + p3) > limit) {
                        System.out.print("---cantidad supera el limite--- ");
                        System.out.print("3.cafe: ");
                        p3 = scaner.nextInt();
                    }
                    cafe = cafe + p3;

                    System.out.print("4. capuchino:");
                    p4 = scaner.nextInt();
                    while ((capuchino + p4) > limit) {
                        System.out.println("---cantidad supera el limite--- ");
                        System.out.print("3 .capuchino: ");
                        p4 = scaner.nextInt();
                    }
                    capuchino = capuchino + p4;

                    C1.SetCargar(agua, leche, cafe, capuchino);
                    break;
                case 3:
                    if (power == true) {
                        C1.getMostrarEstado();

                    } else {
                        System.out.println("---DEBE INCIAR CAFÉTERA---");
                    }
                    break;
                case 4:
                    System.out.println("---Asignar Precios---");
                    System.out.print("1. tinto: ");
                    int tintoP = scaner.nextInt();
                    System.out.print("2. Café: ");
                    int CafeP = scaner.nextInt();
                    System.out.print("3. Capuchino: ");
                    int capuchinoP = scaner.nextInt();
                    C1.SetPrecios(tintoP, CafeP, capuchinoP);
                    break;
                case 5:

                    System.out.println("---Estado De Ventas---");
                    _tintoP = C1.getPrecioTinto();
                    _cafeP = C1.getPrecioCafe();
                    _capuchinoP = C1.getPreciocapuchino();
                    System.out.println(
                            "Precios: 1.tinto: " + _tintoP + "  2.Café: " + _cafeP + "  3.Capuchino: " + _capuchinoP);
                    int _tintoPT = C1.getPrecioTintoT();
                    int _cafePT = C1.getPrecioCafeT();
                    int _capuchinoPT = C1.getPreciocapuchinoT();
                    int _PrecioT = C1.getPrecioT();

                    System.out.println("1.tinto : " + _tintoPT);
                    System.out.println("2.Cafe : " + _cafePT);
                    System.out.println("3.Capuchino : " + _capuchinoPT);
                    System.out.println("---VALOR TOTAL: " + _PrecioT);
                    break;
                case 6:
                    System.out.println("--- Haz tu bebida. ---");
                    System.out.println("1.tinto");
                    System.out.println("2.Cafe");
                    System.out.println("3.Capuchino");
                    op = scaner.nextInt();
                    System.out.println("");
                    switch (op) {
                        case 1:
                            System.out.println("---Tinto----");
                            System.out.println("Escoja tamaño: ");
                            System.out.println("1.7 Oz");
                            System.out.println("2.9 Oz");
                            int tam = scaner.nextInt();
                            System.out.println("Cantidad de Tintos");
                            int Cant = scaner.nextInt();

                            C1.setHacerTinto(tam, Cant);
                            break;
                        case 2:
                            message = "---Café----\n" +
                                    "Escoja tamaño:\n" +
                                    "1. 7 Oz\n" +
                                    "2. 9 Oz";
                            JOptionPane.showMessageDialog(null, message);

                            int tama = Integer.parseInt(JOptionPane.showInputDialog("Escoja el tamaño:"));
                            int Canti = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de cafés:"));

                            C1.setHacerCafe(tama, Canti);

                            break;
                        case 3:
                            System.out.println("---Capuchino----");
                            System.out.println("Escoja tamaño: ");
                            System.out.println("1.7 Oz");
                            System.out.println("2.9 Oz");
                            int tamañ = scaner.nextInt();
                            System.out.println("Cantidad de cafe´s");
                            int Cantid = scaner.nextInt();

                            C1.setHacerCapuchino(tamañ, Cantid);
                            break;

                    }

            }

        } while (op != 0);
    }

    public static void main(String[] args) {

        MostrarMenu();

    }

}

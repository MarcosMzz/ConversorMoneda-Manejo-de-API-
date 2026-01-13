import conversor.herramientas.Conversor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eleccionCambio;

        double moneda;

        System.out.println("\nBienvenido al conversor de monedas ;)");

        do {

            try {
                System.out.println("""
            ====================================
                 Elegí tu tipo de cambio
            ====================================
            1) USD → ARS  (Dólar a Peso Argentino)
            2) ARS → USD  (Peso Argentino a Dólar)
            
            3) USD → BRL  (Dólar a Real Brasileño)
            4) BRL → USD  (Real Brasileño a Dólar)
            
            5) USD → COP  (Dólar a Peso Colombiano)
            6) COP → USD  (Peso Colombiano a Dólar)
            
            7)Salir del conversor
            ====================================
            """);

                eleccionCambio = scanner.nextInt();

                if (eleccionCambio == 7){
                    break;
                }

                System.out.println("Ingrese el valor que desea convertir");

                moneda = scanner.nextDouble();

                Conversor conversorF = new Conversor();

                conversorF.conversionFinal(eleccionCambio, moneda);

            } catch (Exception e) {
                System.out.println("Entrada inválida. Intente nuevamente.");
                scanner.nextLine();
            }

        }while(true);


    }
}

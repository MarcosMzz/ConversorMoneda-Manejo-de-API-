package conversor.herramientas;

public class conversor {

    public void conversionFinal(int pEleccion, double pCantidadMoneda){
        servicioApi conversion = new servicioApi();

        double exRateSelected = 0;

        switch (pEleccion) {
            case 1:
                exRateSelected = conversion.obtenerConversion("USD", "ARS");
                System.out.println("Tu conversión es: USD → ARS, por lo tanto " + pCantidadMoneda + " USD es igual a " + pCantidadMoneda*exRateSelected + " ARS");
                break;

            case 2:
                exRateSelected = conversion.obtenerConversion("ARS", "USD");
                System.out.println("Tu conversión es: ARS → USD, por lo tanto " + pCantidadMoneda + " ARS es igual a " + pCantidadMoneda*exRateSelected + " USD");
                break;

            case 3:
                exRateSelected = conversion.obtenerConversion("USD", "BRL");
                System.out.println("Tu conversión es: USD → BRL, por lo tanto " + pCantidadMoneda + " USD es igual a " + pCantidadMoneda*exRateSelected + " BRL");
                break;

            case 4:
                exRateSelected = conversion.obtenerConversion("BRL", "USD");
                System.out.println("Tu conversión es: BRL → USD, por lo tanto " + pCantidadMoneda + " BRL es igual a " + pCantidadMoneda*exRateSelected + " USD");
                break;

            case 5:
                exRateSelected = conversion.obtenerConversion("USD", "COP");
                System.out.println("Tu conversión es: USD → COP, por lo tanto " + pCantidadMoneda + " USD es igual a " + pCantidadMoneda*exRateSelected + " COP");
                break;

            case 6:
                exRateSelected = conversion.obtenerConversion("COP", "USD");
                System.out.println("Tu conversión es: COP → USD, por lo tanto " + pCantidadMoneda + " COP es igual a " + pCantidadMoneda*exRateSelected + " USD");
                break;

            default:
                System.out.println("Seleccioná una opción válida");
                break;
        }



    }
}

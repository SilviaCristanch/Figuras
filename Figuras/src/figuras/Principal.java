package figuras;

import java.util.Scanner;

public class Principal 
{
    public static void main(String []args)
    {
        Scanner entrada=new Scanner(System.in);
        double wlado,walt,wbas;
        System.out.print("Lado del Cuadrado: ");
        wlado=entrada.nextDouble();
        System.out.print("Base del Regatngulo: ");
        wbas=entrada.nextDouble();
        System.out.print("Base del Rectabgulo: ");
        walt=entrada.nextDouble();
        
        cuadrado objcuad = new cuadrado(wlado);
        rectangulo objrect = new rectangulo(wbas,walt);
        objcuad.setarea();
        objcuad.setperimetro();
        objcuad.dibujar();
        objrect.setarea();
        objrect.setperimetro();
        objrect.dibujar();
        
    }
}
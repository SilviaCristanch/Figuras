
package figuras;

/**
 *
 * @author HP AMD RYZEN 3
 */
public class cuadrado extends figura//clase hija de figura
{
   private double lado;//atributos de la clase hija
   
   public cuadrado(double l)
   {
       super("Cuadrado");//metodo constructor de la clase figura
       lado=1;//asignacion de atributo propio de la clase
   }
   public void setarea(){//valor del area
       this.area=lado*lado;
   }
   public void setperimetro(){//valor de perimetro
       this.perimetro=lado*4;
   }

   public void dibujar()//metodo de figura
   {
       super.dibujar();
       System.out.println("Dibujo: ");
       for(int i=0; i<lado;i++)
       {
           for(int j=0; j<lado; j++)
               System.out.print("*");
           System.out.println();
       }
   }
}

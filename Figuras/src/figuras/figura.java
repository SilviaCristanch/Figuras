
package figuras;

/**
 *
 * @author HP AMD RYZEN 3
 */
public class figura {
  protected String nombre;
  protected double area;
  protected double perimetro;
  //metodo constructor
  public figura (String n)
  {
      nombre=n;
  }
  public String getnombre()
  {
      return nombre;
  }
    public double getarea()
  {
      return area;
  }
      public double getperimetro()
  {
      return perimetro;
  }
    public void dibujar() //atributos clase padre
  {
      System.out.println("Nombre: "+this.getnombre());
      System.out.println("Perimetro: "+this.getperimetro());
      System.out.println("Area: "+this.getarea());
  }
       
      
   
   
    
}

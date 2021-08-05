package figuras;

/**
 *
 * @author HP AMD RYZEN 3
 */
public class rectangulo extends figura{
    
    private double base;
    private double altura;
    
    public rectangulo(double b,double a){
        super("rectangulo");
        base=b;
        altura=a;
    }
    public void setarea(){
        this.area=base*altura;
    }
    public void setperimetro(){
        this.perimetro=(base*2)+(altura+2);
    }
    public void dibujar(){
        super.dibujar();
        System.out.println("Dibujo");//numero de asteriscos que nos pida la base y la alturq
        for(int i=0; i<altura; i++)
        {
          for(int j=0; j<base; j++)
            System.out.print("*");
          System.out.println();
        }
    }
       
}

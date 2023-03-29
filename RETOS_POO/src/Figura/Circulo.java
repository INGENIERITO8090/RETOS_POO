package Figura;

public class Circulo extends Figura { 
    // atributos 
    private float radio;
     // metodos constructores 

    public Circulo(float radio) {
        this.radio = radio;
    }
// getter y setters 
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
     
 public void calcaularArea(){ 
    
      float area ;

      area = 3.14f*(radio*radio);


      System.out.println( " el radio del circulo es " + radio+ "y su area es el producto de radio * radio  " +area );


 }

    
}

package Figura;

public class Rectangulo extends Figura  {
//  atributos 
 private  float altura;
 private float base ;



// metodo constructor 
public Rectangulo(float altura, float base) {
    this.altura = altura;
    this.base = base;
}

// metodos accesores 

public float getAltura() {
    return altura;
}



public void setAltura(float altura) {
    this.altura = altura;
}



public float getBase() {
    return base;
}



public void setBase(float base) {
    this.base = base;
} 


// creamos le metodo 


public void calcaularArea (){
float area ; 
area = base*altura;

System.out.println( " la altura del rectangulo es "+ altura+"la base es "+base+"su area es el producto de la base por la altura "+area );


}


    

}

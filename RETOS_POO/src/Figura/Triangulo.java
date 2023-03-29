package Figura;

public class Triangulo extends Figura  {
 
private float base;
 private float altura;

// metodo constructor
public Triangulo(float base, float altura) {
    this.base = base;
    this.altura = altura;
}
// metodos accesores 

public float getBase() {
    return base;
}

public void setBase(float base) {
    this.base = base;
}

public float getAltura() {
    return altura;
}

public void setAltura(float altura) {
    this.altura = altura;
}

public void calcaularArea(){
float area ; 
area = (base * altura) /2;


System.out.println( " la altura de el triangulo es "+altura+"la base del el triangulo es "+base+" el area es la mitad del  producto de la altura por la base "+area );






}



 


    
}

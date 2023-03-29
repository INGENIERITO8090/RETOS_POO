package Juego;

import java.util.Random;
import java.util.Scanner;

public class piedrapapel implements Juego {

// atributos 
  private String nombre; 
  private int edad ; 
  private int eleccion;
  private int eleccion_m;


Scanner leer = new Scanner(System.in);
Random n_c = new Random();

    public void iniciar(){ 

  System.out.println( " digite su edad ");
  edad=leer.nextInt();

  System.out.println( " digite su nombre");
  nombre=leer.next();
    }

    public void jugar() {

            if(edad<=18 ||edad>=100 ){
                System.out.println(" usted no puede jugar  ");
            } 
            // creamos un condicional anidado 
             else if (edad>18 ){ 
                System.out.println(" selecione \n1 piedra \n2 palel \n3 tijera  ");
                eleccion= leer.nextInt();
            // opreracion para saber la eleccion de la maquina 
                 eleccion_m=n_c.nextInt((3)+1); 

                 
        }


    }


    public void finalizar() {
       
  // condicional para mostrar  la eleccion de la maquina  
         if (eleccion_m==1){System.out.println(" la maquina elije piedra ");}
        else if (eleccion_m==2){  System.out.println(" la maquina elije papel ");}
        else if (eleccion_m==3){   System.out.println(" la maquina elije tijera  ");}
        else;



// creamos el condicional para mostar resultados 

     if(eleccion==1 && eleccion_m==1 ){  System.out.println(nombre+" empate con la maquina  ");}
     else if (eleccion==1 && eleccion_m==2 ){  System.out.println(nombre+" usted pierde con la maquina  "); }
     else if (eleccion==1 && eleccion_m==3 ){  System.out.println(nombre+" usted le gana ala maquina");}
     else if (eleccion==2 && eleccion_m==1){  System.out.println(nombre+" usted le gana ala maquina  ");  }
     else if (eleccion==2 && eleccion_m==2 ){  System.out.println(nombre+" empate con la maquina  ");  }
     else if (eleccion==3 && eleccion_m==2 ){  System.out.println(nombre+" usted le gana a la maquina  ");  }
     else if (eleccion==2 && eleccion_m==1 ){  System.out.println(nombre+" usted le gana ala maquina   ");  }
     else if (eleccion==2 && eleccion_m==3 ){  System.out.println(nombre+" usted pierde con la maquina   ");  }
     else if (eleccion==3 && eleccion_m==1 ){  System.out.println(nombre+" usted pierde contra la maquina  ");  }
     else if (eleccion==3 && eleccion_m==2 ){  System.out.println(nombre+" usted le gana ala maquina  ");  }
     else if (eleccion==3 && eleccion_m==3 ){  System.out.println(nombre+" empate con la maquina  ");  }
    
 leer.close();

}

        
    }

    



